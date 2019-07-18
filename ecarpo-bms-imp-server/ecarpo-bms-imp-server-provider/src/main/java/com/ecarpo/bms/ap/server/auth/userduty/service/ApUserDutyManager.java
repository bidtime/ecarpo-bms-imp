/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userduty.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.userduty.bo.ApUserDutyListBO;
import com.ecarpo.bms.ap.server.auth.userduty.dao.ApUserDutyDAO;
import com.ecarpo.bms.ap.server.auth.userduty.dao.ApUserDutyMapper;
import com.ecarpo.bms.ap.server.auth.userduty.dto.InsertUserDutyDTO;
import com.ecarpo.bms.ap.server.auth.userduty.entity.ApUserDutyDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class ApUserDutyManager
    extends BaseDAOManager<ApUserDutyDAO, ApUserDutyMapper, ApUserDutyDO> {

  /**
   * userId 删除记录
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  public Integer deleteByUserId(Long userId) throws Exception {
    return dao.deleteByUserId(userId);
  }

  /**
   * 用户岗位更新
   *
   * @param dto
   * @return
   * @throws Exception
   * @since 2017年10月26日
   */
  @SuppressWarnings("unchecked")
  public int update(InsertUserDutyDTO dto) throws Exception {
    if (CollectionUtils.isEmpty(dto.getDutyIds())) {
      return 0;
    }
    // 获取user在数据库中对应的所有岗位id
    List<ApUserDutyListBO> userDutyListDB = this.selectByUserId(dto.getUserId());
    List<Long> dutyIdsDB = null;
    if (CollectionUtils.isNotEmpty(userDutyListDB)) {
      dutyIdsDB = new ArrayList<>(userDutyListDB.size());
      for (ApUserDutyListBO userDutyListBO : userDutyListDB) {
        dutyIdsDB.add(userDutyListBO.getDutyId());
      }
    } else {
      dutyIdsDB = new ArrayList<>(0);
    }
    // 需要添加的岗位id
    //　获取 用户选择的岗位和数据库的岗位，取集合差集，然后插入
    Collection<Long> insertDutyIds = CollectionUtils.subtract(dto.getDutyIds(), dutyIdsDB);
    List<ApUserDutyDO> listInsertDO = this.toList(insertDutyIds, dto);
    int n = CollectionUtils.isEmpty(insertDutyIds) ? 1 : this.insertPK(listInsertDO);
    // 需要删除的岗位id
    if (n > 0) {
      //　获取 数据库的岗位和用户选择的岗位，取集合差集，然后删除
      Collection<Long> deleteDutyIds = CollectionUtils.subtract(dutyIdsDB, dto.getDutyIds());
      List<ApUserDutyDO> listDeleteDTO = this.toList(deleteDutyIds, dto);
      if (CollectionUtils.isNotEmpty(listDeleteDTO)) {
        n += this.deleteBatch(listDeleteDTO);
      }
    }
    return n;
  }
  

  /**
   * 按用户id查询
   *
   * @param userId
   * @return list, can be null
   * @author mgz
   * @since 2017年7月14日
   */
  public List<ApUserDutyListBO> selectByUserId(Long userId) throws Exception {
    return DAOUtils.cloneList(ApUserDutyListBO.class, dao.selectByUserId(userId));
  }
  
  /**
   * 集合转换为list,数据包装方法
   *
   * @param listMenuIds
   * @param bean
   * @param dto
   * @return
   * @author mgz
   * @since 2017年7月27日
   */
  private List<ApUserDutyDO> toList(Collection<Long> insertDutyIds, InsertUserDutyDTO dto)
      throws Exception {
    if (CollectionUtils.isEmpty(insertDutyIds)) {
      return null;
    }
    List<ApUserDutyDO> list = new ArrayList<>();
    for (Long dutyId : insertDutyIds) {
      ApUserDutyDO u = new ApUserDutyDO();
      DAOUtils.cloneBean(u, dto);
      u.setDutyId(dutyId);
      list.add(u);
    }
    return list;
  }
  
  /**
   * 批量删除
   *
   * @param list
   * @return
   * @author mgz
   * @since 2017年7月27日
   */
  private int deleteBatch(List<ApUserDutyDO> list) throws Exception {
    int n = 0;
    if (CollectionUtils.isEmpty(list)) {
      return n;
    }
    for (ApUserDutyDO u : list) {
      n += this.deleteByUserDutyDO(u);
    }
    return n;
  }
  
  /**
   * 按用户id和岗位id删除
   *
   * @param userId
   * @return
   * @author mgz
   * @since 2017年7月14日
   */
  public int deleteByUserDutyDO(ApUserDutyDO userDutyDO) throws Exception {
    return dao.deleteByUserDutyDO(userDutyDO);
  }
  
}
