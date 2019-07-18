/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.position.service;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.duty.entity.ApDutyDO;
import com.ecarpo.bms.ap.server.auth.duty.service.ApDutyManager;
import com.ecarpo.bms.ap.server.auth.dutyproduct.entity.ApDutyProductDO;
import com.ecarpo.bms.ap.server.auth.dutyproduct.service.ApDutyProductManager;
import com.ecarpo.bms.eas.position.dto.EasPositionInsertDTO;
import com.ecarpo.bms.eas.position.dto.EasPositionUpdateDTO;
import com.ecarpo.bms.eas.server.orgbaseunit.entity.EasOrgBaseUnitDO;
import com.ecarpo.bms.eas.server.orgbaseunit.service.EasOrgBaseUnitManager;
import com.ecarpo.bms.eas.server.position.dao.EasPositionDAO;
import com.ecarpo.bms.eas.server.position.dao.EasPositionMapper;
import com.ecarpo.bms.eas.server.position.entity.EasPositionDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasPositionManager
    extends BaseDAOManager<EasPositionDAO, EasPositionMapper, EasPositionDO> {

  @Autowired
  private ApDutyManager apDutyManager;

  @Autowired
  private ApDutyProductManager apDutyProductManager;

  @Autowired
  private EasOrgBaseUnitManager easOrgBaseUnitManager;

  /**
   * EAS推送新增岗位信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author lhf,xinbeibei
   * @since 2019.06.04
   */
  public Number insertByBase(EasPositionInsertDTO dto) throws Exception {
    
    
    EasPositionDO easPositionDO = dao.selectByEasId(dto.getId());
    if (easPositionDO != null) {
      throw new ManagerException("当前主键id存在对应岗位信息,新建失败");
    }
    

    //维护ERP 岗位信息
    Long dutyId = null;

    ApDutyDO apDutyDO = apDutyManager.selectByEasNumber(dto.getEncrypt());
    if (apDutyDO != null) {
      dutyId = apDutyDO.getDutyId();
    } else {
      
      String adminOrgUnitIdNumber = dto.getAdminOrgUnitIdNumber();
      Long orgId = this.getOrgIdByNumber(adminOrgUnitIdNumber);
      if (orgId == null) {
        throw new ManagerException("获取当前岗位组织信息异常,保存数据失败,请联系管理员");
      }
      
      ApDutyDO bean = DAOUtils.cloneBean(ApDutyDO.class, dto);
      bean.setDepartId(0L);
      bean.setOrgId(orgId);
      bean.setOrgType(2);

      if (dto.getDeletedStatus() != null && dto.getDeletedStatus() == 2) {
        bean.setState(0);
      } else {
        bean.setState(1);
      }
      bean.setDutyName(dto.getDefine());
      bean.setRemark("EAS 推送数据");
      dutyId = apDutyManager.insertLong(bean).longValue();

      //维护ap_duty_product
      Date now = new Date();
      ApDutyProductDO apDutyProductDO = new ApDutyProductDO();
      apDutyProductDO.setDutyId(dutyId);
      apDutyProductDO.setProductId(0L);
      apDutyProductDO.setCreateTime(now);
      apDutyProductDO.setModifyTime(now);
      apDutyProductDO.setDelFlag(0);
      apDutyProductManager.insertLong(apDutyProductDO);

    }
    EasPositionDO cloneBean = DAOUtils.cloneBean(EasPositionDO.class, dto);
    //回写岗位主键信息
    cloneBean.setErpDutyId(dutyId);
    int insert = dao.insert(cloneBean);
    return insert;
  }

  /**
   * EAS 推送岗位变更信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author lhf,xinbeibei
   * @since 2019.06.04
   */
  public Object updateByBase(EasPositionUpdateDTO dto) throws Exception {
    //维护ERP 岗位信息
    EasPositionDO easPositionDO = dao.selectByEasId(dto.getId());
    if (easPositionDO == null) {
      throw new ManagerException("当前数据未获取到相关岗位信息,更新失败");
    }

    Long dutyId = null;
    ApDutyDO apDutyDO = apDutyManager.selectByEasNumber(dto.getEncrypt());
    if (apDutyDO != null) {
      dutyId = apDutyDO.getDutyId();
    }

    EasPositionDO cloneBean = DAOUtils.cloneBean(easPositionDO, dto);
    cloneBean.setErpDutyId(dutyId);
    int updateDTO = dao.updateSelective(cloneBean);

    //    if (easPositionDO == null || easPositionDO.getErpDutyId() == null) {
    //      throw new ManagerException("当前数据未获取到ERP系统中的相关信息,请联系管理员");
    //    }
    //    ApDutyDO bean = new ApDutyDO();
    //    bean.setDutyId(easPositionDO.getErpDutyId());
    //    if (dto.getDeletedStatus() != null && dto.getDeletedStatus() == 2) {
    //      bean.setState(0);
    //    } else {
    //      bean.setState(1);
    //    }
    //    bean.setDutyName(dto.getDefine());
    //    bean.setModifyTime(new Date());
    //    apDutyManager.updateSelective(bean);

    return updateDTO;
  }

  /**
   * 岗位编码 获取对应的组织id
   * 
   * @param positionNumber
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  public Long selectPositionOrgByNumber(String positionNumber) throws Exception {

    EasPositionDO easPositionDO = dao.selectByNumber(positionNumber);
    if (easPositionDO == null) {
      throw new ManagerException("岗位编码未获取到岗位信息,请检查岗位信息是否存在");
    }

    Long dutyId = easPositionDO.getErpDutyId();

    ApDutyDO apDutyDO = apDutyManager.selectByPrimaryKey(dutyId, false);
    if (apDutyDO == null) {
      throw new ManagerException("未获取到ERP中岗位信息,请联系管理员");
    }
    return apDutyDO.getOrgId();
  }

  /**
   * 岗位对应的行政组织id 获取ERP中的orgId
   * 
   * @param adminOrgUnitIdNumber
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  private Long getOrgIdByNumber(String adminOrgUnitIdNumber) throws Exception {
    if (StringUtils.isBlank(adminOrgUnitIdNumber)) {
      throw new ManagerException("岗位信息中的行政组织编码为空,不能正确获取组织信息,请检查");
    }

    EasOrgBaseUnitDO easOrgBaseUnitDO = easOrgBaseUnitManager.selectByNumber(adminOrgUnitIdNumber);

    if (easOrgBaseUnitDO == null) {
      throw new ManagerException("当前岗位对应的组织信息不存在,请先完成组织的推送");
    }

    return easOrgBaseUnitDO.getOrgId();
  }

  /**
   * 岗位编码获取岗位DO
   * 
   * @param positionNumber
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  public EasPositionDO selectByNumber(String positionNumber) throws Exception {
    return dao.selectByNumber(positionNumber);
  }

}
