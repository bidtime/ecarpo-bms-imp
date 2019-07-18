/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userduty.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.userduty.entity.ApUserDutyDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Repository
public class ApUserDutyDAO extends CRUDDAO<ApUserDutyMapper, ApUserDutyDO> {

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
    return mapper.deleteByUserId(userId);
  }

  /**
   * Query user's duties.
   *
   * @param userId
   * @return
   * @author mgz
   * @since 2017年7月14日
   */
  public List<ApUserDutyDO> selectByUserId(Long userId) throws Exception {
    return mapper.selectByUserId(userId);
  }

  /**
   * Delete all duties by userId and dutyid.
   *
   * @param userId
   * @return
   * @author mgz
   * @since 2017年7月14日
   */
  public int deleteByUserDutyDO(ApUserDutyDO userDutyDO) throws Exception {
    return mapper.deleteByUserDutyDO(userDutyDO);
  }

}
