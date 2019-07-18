/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutymenu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.dutymenu.entity.ApDutyMenuDO;
import com.ecarpo.framework.common.dao.CRUDDAO;
import com.ecarpo.framework.exception.DaoException;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Repository
public class ApDutyMenuDAO extends CRUDDAO<ApDutyMenuMapper, ApDutyMenuDO> {

  /**
   * 按岗位id获取模块id
   * 
   * @param dutyId
   * @return
   * @author shimingkang
   * @since 2017年9月27日
   */
  public List<Long> selectListByDutyId(Long dutyId) throws Exception {
    try {
      return mapper.selectListByDutyId(dutyId);
    } catch (Exception e) {
      throw new DaoException(e);
    }
  }
  
  /**
   * 按岗位id获取模块菜单id
   * 
   * @param dutyId
   * @return
   * @author shimingkang
   * @since 2017年9月27日
   */
  public List<ApDutyMenuDO> listProductMenuIdByDutyId(Long dutyId) throws Exception {
    return mapper.listProductMenuIdByDutyId(dutyId);
  }
  
}
