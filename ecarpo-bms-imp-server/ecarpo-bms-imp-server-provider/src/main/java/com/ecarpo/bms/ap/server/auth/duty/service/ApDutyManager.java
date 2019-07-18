/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.duty.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.duty.dao.ApDutyDAO;
import com.ecarpo.bms.ap.server.auth.duty.dao.ApDutyMapper;
import com.ecarpo.bms.ap.server.auth.duty.entity.ApDutyDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class ApDutyManager extends BaseDAOManager<ApDutyDAO, ApDutyMapper, ApDutyDO> {

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
    return dao.selectByEasNumber(dutyCode);
  }

}
