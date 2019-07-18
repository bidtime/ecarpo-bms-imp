/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.duty.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.duty.entity.ApDutyDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Repository
public class ApDutyDAO extends CRUDDAO<ApDutyMapper, ApDutyDO> {

  /**
   * 岗位编码获取岗位信息
   * 
   * @param dutyCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.15
   */
  public ApDutyDO selectByEasNumber(String dutyCode) throws Exception {
    return mapper.selectByEasNumber(dutyCode);
  }

}
