/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.user.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.user.dao.ApUserDAO;
import com.ecarpo.bms.ap.server.auth.user.dao.ApUserMapper;
import com.ecarpo.bms.ap.server.auth.user.entity.ApUserDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class ApUserManager extends BaseDAOManager<ApUserDAO, ApUserMapper, ApUserDO> {

  /**
   * 编码获取人员信息
   * 
   * @param userCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  public ApUserDO selectByEasNumber(String userCode) throws Exception {
    return dao.selectByEasNumber(userCode);
  }

}
