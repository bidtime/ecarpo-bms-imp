/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.person.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.allenum.ap.ApSexEnum;
import com.ecarpo.bms.allenum.ap.OrgTypeEnum;
import com.ecarpo.bms.allenum.bs.BooleanEnum;
import com.ecarpo.bms.ap.server.auth.dutymenu.service.ApDutyMenuManager;
import com.ecarpo.bms.ap.server.auth.user.entity.ApUserDO;
import com.ecarpo.bms.ap.server.auth.user.service.ApUserManager;
import com.ecarpo.bms.ap.server.auth.userduty.dto.InsertUserDutyDTO;
import com.ecarpo.bms.ap.server.auth.userduty.entity.ApUserDutyDO;
import com.ecarpo.bms.ap.server.auth.userduty.service.ApUserDutyManager;
import com.ecarpo.bms.ap.server.auth.usermenu.dto.UserMenuInsertDTO;
import com.ecarpo.bms.ap.server.auth.usermenu.entity.ApUserMenuDO;
import com.ecarpo.bms.ap.server.auth.usermenu.service.ApUserMenuManager;
import com.ecarpo.bms.ap.server.auth.userproduct.entity.ApUserProductDO;
import com.ecarpo.bms.ap.server.auth.userproduct.service.ApUserProductManager;
import com.ecarpo.bms.eas.person.bo.EasPersonInfoBO;
import com.ecarpo.bms.eas.person.dto.EasPersonInfoQO;
import com.ecarpo.bms.eas.person.dto.EasPersonInsertDTO;
import com.ecarpo.bms.eas.person.dto.EasPersonUpdateDTO;
import com.ecarpo.bms.eas.personposition.dto.EasPersonPositionDTO;
import com.ecarpo.bms.eas.server.orgbaseunit.service.EasOrgBaseUnitManager;
import com.ecarpo.bms.eas.server.person.dao.EasPersonDAO;
import com.ecarpo.bms.eas.server.person.dao.EasPersonMapper;
import com.ecarpo.bms.eas.server.person.entity.EasPersonDO;
import com.ecarpo.bms.eas.server.personpositon.entity.EasPersonPositonDO;
import com.ecarpo.bms.eas.server.personpositon.service.EasPersonPositionManager;
import com.ecarpo.bms.eas.server.position.entity.EasPositionDO;
import com.ecarpo.bms.eas.server.position.service.EasPositionManager;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.common.utils.DTOUtils;
import com.ecarpo.framework.exception.ManagerException;
import com.ecarpo.framework.model.InsertDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
@Slf4j
public class EasPersonManager extends BaseDAOManager<EasPersonDAO, EasPersonMapper, EasPersonDO> {

  @Autowired
  private EasPersonPositionManager easPersonPositionManager;

  @Autowired
  private ApUserManager apUserManager;

  @Autowired
  private EasPositionManager easPositionManager;

  @Autowired
  private ApUserMenuManager apUserMenuManager;

  @Autowired
  private ApDutyMenuManager apDutyMenuManager;

  @Autowired
  private ApUserProductManager apUserProductManager;

  @Autowired
  private ApUserDutyManager apUserDutyManager;

  @Autowired
  private EasOrgBaseUnitManager easOrgBaseUnitManager;

  /**
   * EAS推送人员信息 -- 新建
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author lhf,xinbeibei
   * @since 2019.06.05
   */
  public Integer insertByBase(EasPersonInsertDTO dto) throws Exception {

    String id = dto.getId();
    if (StringUtils.isBlank(id)) {
      throw new ManagerException("新增操作,当前主键id为空,请检查后重试");
    }
    EasPersonDO easPersonDO = dao.selectByPK(id);

    if (easPersonDO != null) {
      throw new ManagerException("新增操作,当前主键id已存在对应的人员信息,请检查后重试");
    }

    List<EasPersonPositionDTO> positions = dto.getPositions();
    Set<Long> dutyIds = new HashSet<Long>();

    if (CollectionUtils.isNotEmpty(positions)) {
      positions.forEach(position -> {
        try {
          EasPersonPositonDO rd = DAOUtils.cloneBean(EasPersonPositonDO.class, position);
          rd.setPersonId(dto.getId());
          easPersonPositionManager.insertLong(rd);

          //封装人员岗位id信息
          String positionNumber = position.getPositionNumber();
          if (StringUtils.isNotBlank(positionNumber)) {
            EasPositionDO easPositionDO = easPositionManager.selectByNumber(positionNumber);
            if (easPositionDO != null && easPositionDO.getErpDutyId() != null) {
              dutyIds.add(easPositionDO.getErpDutyId());
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }

    //推送数据到ERP 
    ApUserDO apUserDO = apUserManager.selectByEasNumber(dto.getEncrypt());
    Long userId = null;
    if (apUserDO != null) {
      userId = apUserDO.getUserId();
    } else {
      Long orgId = this.getOrgIdByPosition(dto.getPositions());
      if (orgId != null) {
        ApUserDO bean = DAOUtils.cloneBean(ApUserDO.class, dto);
        bean.setOrgId(orgId);
        bean.setOrgType(OrgTypeEnum.DEALER.getState());
        bean.setUserName(dto.getDefine());
        bean.setAccount(UUID.randomUUID().toString());
        bean.setContactPhone(dto.getCell());
        //男=1,女=2
        Integer gender = dto.getGender();
        if (gender != null) {
          if (1 == gender) {
            bean.setSex(ApSexEnum.MALE.getValue());
          } else if (2 == gender) {
            bean.setSex(ApSexEnum.FEMALE.getValue());
          }
        }
        bean.setRemark("EAS 推送数据");
        userId = apUserManager.insertLong(bean).longValue();
      } else {
        throw new ManagerException("获取当前人员组织信息异常,保存数据失败,请联系管理员");
      }
      //刷新人员岗位菜单信息(当前岗位菜单),维护人员岗位对应关系
      this.insertRefreshMenu(userId, dutyIds);
    }
    EasPersonDO cloneBean = DAOUtils.cloneBean(EasPersonDO.class, dto);
    //维护EAS 中间表信息
    cloneBean.setErpUserId(userId);
    Integer insert = dao.insert(cloneBean);

    return insert;
  }

  /**
   * 获取岗位中对应的组织信息
   * 
   * @param positions
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  @SuppressWarnings("unused")
  private Long getOrgIdByPosition(List<EasPersonPositionDTO> positions) throws Exception {
    if (CollectionUtils.isEmpty(positions)) {
      log.info("岗位信息为空,无法正常获取对应的组织单元信息,不给ERP中推送人员信息数据");
      return null;
    }

    EasPersonPositionDTO easPersonPositionDTO = positions.get(0);
    String positionNumber = easPersonPositionDTO.getPositionNumber();
    if (StringUtils.isBlank(positionNumber)) {
      throw new ManagerException("人员信息中的岗位类型编码为空,请检查后重试");
    }

    Long orgId = easPositionManager.selectPositionOrgByNumber(positionNumber);
    return orgId;
  }

  /**
   * EAS推送人员信息 -- 更新
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author lhf,xinbeibei
   * @since 2019.06.05
   */
  public Integer updateByBase(EasPersonUpdateDTO dto) throws Exception {
    String id = dto.getId();
    if (StringUtils.isBlank(id)) {
      throw new ManagerException("更新操作,当前主键id为空,请检查后重试");
    }
    EasPersonDO easPersonDO = dao.selectByPK(id);

    if (easPersonDO == null) {
      throw new ManagerException("更新操作,未获取到当前id对应的人员信息,请检查后重试");
    }

    Set<Long> dutyIds = new HashSet<Long>();
    EasPersonDO d = DAOUtils.cloneBean(EasPersonDO.class, dto);
    List<EasPersonPositionDTO> positions = dto.getPositions();
    easPersonPositionManager.deleteByPersonId(d.getId());
    if (CollectionUtils.isNotEmpty(positions)) {
      positions.forEach(position -> {
        try {
          EasPersonPositonDO rd = DAOUtils.cloneBean(EasPersonPositonDO.class, position);
          rd.setPersonId(dto.getId());
          easPersonPositionManager.insertLong(rd);

          //封装人员岗位id信息
          String positionNumber = position.getPositionNumber();
          if (StringUtils.isNotBlank(positionNumber)) {
            EasPositionDO easPositionDO = easPositionManager.selectByNumber(positionNumber);
            if (easPositionDO != null && easPositionDO.getErpDutyId() != null) {
              dutyIds.add(easPositionDO.getErpDutyId());
            }
          }

        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }

    //推送数据到ERP 
    //    Long userId = easPersonDO.getErpUserId();
    //    ApUserDO bean = DAOUtils.cloneBean(ApUserDO.class, dto);
    //    bean.setUserName(dto.getDefine());
    //    bean.setContactPhone(dto.getCell());
    //    //男=1,女=2
    //    Integer gender = dto.getGender();
    //    if (gender != null) {
    //      if (1 == gender) {
    //        bean.setSex(ApSexEnum.MALE.getValue());
    //      } else if (2 == gender) {
    //        bean.setSex(ApSexEnum.FEMALE.getValue());
    //      }
    //    }
    //    if (userId != null) {
    //      //更新
    //      bean.setUserId(userId);
    //      apUserManager.updateSelective(bean);
    //    } else {
    //      //新建
    //      Long orgId = this.getOrgIdByPosition(dto.getPositions());
    //      if (orgId != null) {
    //        bean.setOrgId(orgId);
    //        bean.setOrgType(OrgTypeEnum.DEALER.getState());
    //        bean.setAccount(UUID.randomUUID().toString());
    //        userId = apUserManager.insertLong(bean).longValue();
    //      }
    //
    //      //维护eas人员中userId信息
    //      d.setErpUserId(userId);
    //    }
    //    ApUserDO apUserDO = apUserManager.selectByEasNumber(dto.getEncrypt());
    //    if (apUserDO == null) {
    //      throw new ManagerException("人员编码未获取到ERP相关人员信息,请联系管理员");
    //    }
    //
    //    d.setErpUserId(apUserDO.getUserId());
    Integer updateSelective = dao.updateSelective(d);
    //
    //    //更新人员信息,刷新岗位相关信息
    //    this.updateRefreshMenu(userId, dutyIds);

    return updateSelective;

  }

  /**
   * 新建人员 刷新人员菜单信息
   * 
   * @param userId
   * @param dutyIds
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  private Integer insertRefreshMenu(Long userId, Set<Long> dutyIds) throws Exception {
    Integer m = 0;
    if (CollectionUtils.isEmpty(dutyIds) || userId == null) {
      return m;
    }
    Date now = new Date();

    //维护ap_user_duty
    for (Long dutyId : dutyIds) {
      ApUserDutyDO apUserDutyDO = new ApUserDutyDO();
      apUserDutyDO.setUserId(userId);
      apUserDutyDO.setDutyId(dutyId);
      apUserDutyDO.setCreateTime(now);
      apUserDutyDO.setModifyTime(now);
      apUserDutyDO.setDelFlag(0);
      apUserDutyManager.insertLong(apUserDutyDO);
      m++;
    }

    //获取岗位对应的menu_id 集合
    Set<Long> menuIds = apDutyMenuManager.listDutyMenu(dutyIds);

    if (CollectionUtils.isEmpty(menuIds)) {
      return m;
    }

    //维护ap_user_menu
    for (Long menuId : menuIds) {
      ApUserMenuDO apUserMenuDO = new ApUserMenuDO();
      apUserMenuDO.setUserId(userId);
      apUserMenuDO.setMenuId(menuId);
      apUserMenuDO.setProductId(0L);
      //权限值, 0:不限定, 1:user, 2:org, 3:group
      apUserMenuDO.setAuthCode(0);
      apUserMenuDO.setCreateTime(now);
      apUserMenuDO.setModifyTime(now);
      apUserMenuDO.setDelFlag(0);
      //手工标识: 0:默认, 1:增加
      apUserMenuDO.setManualFlag(1);
      apUserMenuManager.insertLong(apUserMenuDO);
      m++;
    }

    //维护ap_user_product
    ApUserProductDO apUserProductDO = new ApUserProductDO();
    apUserProductDO.setUserId(userId);
    apUserProductDO.setProductId(0L);
    apUserProductDO.setCreateTime(now);
    apUserProductDO.setModifyTime(now);
    apUserProductDO.setDelFlag(0);
    apUserProductManager.insertLong(apUserProductDO);

    m++;
    return m;
  }

  /**
   * 更新人员信息,刷新菜单信息
   * 
   * @param userId
   * @param dutyIds
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  @SuppressWarnings("unused")
  private Integer updateRefreshMenu(Long userId, Set<Long> dutyIds) throws Exception {
    Integer m = 0;

    //删除所有
    //ap_user_duty
    apUserDutyManager.deleteByUserId(userId);

    //ap_user_menu
    apUserMenuManager.deleteByUserId(userId);

    //ap_user_product
    apUserProductManager.deleteByUserId(userId);

    //获取当前用户所有菜单权限信息
    //获取更新后的人员权限信息

    //重新新建
    this.insertRefreshMenu(userId, dutyIds);

    return m;
  }

  /**
   * userId 获取人员编码
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public String selectByUserId(Long userId) throws Exception {
    EasPersonDO easPersonDO = this.selectInfoByUserId(userId);
    if (easPersonDO == null) {
      return "";
    }
    return easPersonDO.getEncrypt();
  }

  /**
   * userId 获取人员信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public EasPersonDO selectInfoByUserId(Long userId) throws Exception {
    return dao.selectInfoByUserId(userId);
  }

  /**
   * 更新人员岗位权限信息
   * 
   * @param userId
   * @param dutyIds
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.05
   */
  @SuppressWarnings("unused")
  private Integer updateRefreshMenu(Long userId, List<Long> dutyIds, EasPersonUpdateDTO dto)
      throws Exception {
    Integer n = 0;
    InsertUserDutyDTO userDutyDTO = new InsertUserDutyDTO(userId, dutyIds);
    BeanUtils.copyProperties(dto, userDutyDTO);
    userDutyDTO.setCreateTime(dto.getModifyTime());
    userDutyDTO.setCreatorId(userId);
    //
    int applyUserDuty = apUserDutyManager.update(userDutyDTO);
    if (applyUserDuty > 0) {
      n += applyUserDuty;
      UserMenuInsertDTO userMenuDTO = DAOUtils.cloneBean(UserMenuInsertDTO.class, dto);
      Map<Long, Set<Long>> mapMenuId = apDutyMenuManager.listProductMenuIdByDutyId(dutyIds);
      Map<Long, Set<Long>> mergedUserProductMenuIds = this.mergeUserProductMenu(userId, mapMenuId);
      userMenuDTO.setUserId(userId);
      userMenuDTO.setProductMenuIds(mergedUserProductMenuIds);
      DTOUtils.cloneCreator(userMenuDTO, dto);
      n += apUserMenuManager.insert(userMenuDTO);
      // 添加用户模块
      Collection<Long> productIds = userMenuDTO.getProductMenuIds().keySet();
      InsertDTO insertDTO = DAOUtils.cloneBean(InsertDTO.class, dto);
      n += apUserProductManager.insert(productIds, userId, insertDTO);
    }
    return n;
  }

  /**
   * merge duty menu and user menu
   *
   * @param userId
   * @param mapMenuId
   * @return
   * @throws Exception
   * @since 2018.12.26
   */
  private Map<Long, Set<Long>> mergeUserProductMenu(Long userId, Map<Long, Set<Long>> mapMenuId)
      throws Exception {
    Set<Long> userProductIds = apUserMenuManager.getSetProductIdsByUserId(userId);
    userProductIds = CollectionUtils.isEmpty(userProductIds) ? new HashSet<>(0) : userProductIds;
    userProductIds.addAll(mapMenuId.keySet());
    Map<Long, Set<Long>> mergedMap = new HashMap<>();
    for (Long productId : userProductIds) {
      Set<Long> allMenuIds = new HashSet<>();
      Set<Long> dutyMenuIds = mapMenuId.get(productId);
      if (CollectionUtils.isNotEmpty(dutyMenuIds)) {
        allMenuIds.addAll(dutyMenuIds);
      }
      Set<Long> userMenuIds = apUserMenuManager.getMenuIdsByProductUserId(userId, productId,
          BooleanEnum.FALSE.getValue());
      if (CollectionUtils.isNotEmpty(userMenuIds)) {
        allMenuIds.addAll(userMenuIds);
      }
      mergedMap.put(productId, allMenuIds);
    }
    return mergedMap;
  }

  /**
   * 获取user对应的EAS 编码 + org编码
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.09
   */
  public EasPersonInfoBO selectByUserInfo(EasPersonInfoQO qo) throws Exception {
    EasPersonInfoBO bo = new EasPersonInfoBO();
    if (qo != null) {
      if (qo.getOrgId() != null) {
        //封装组织编码信息
        String orgNumber = easOrgBaseUnitManager.selectByOrgId(qo.getOrgId());
        if (StringUtils.isNoneBlank(orgNumber)) {
          bo.setOrgNumber(orgNumber);
        }
      }
      if (qo.getUserId() != null) {
        //封装人员编码信息
        EasPersonDO easPersonDO = dao.selectInfoByUserId(qo.getUserId());
        if (easPersonDO != null) {
          bo.setOrgNumber(easPersonDO.getEncrypt());
        }
      }
    }
    return bo;
  }

}
