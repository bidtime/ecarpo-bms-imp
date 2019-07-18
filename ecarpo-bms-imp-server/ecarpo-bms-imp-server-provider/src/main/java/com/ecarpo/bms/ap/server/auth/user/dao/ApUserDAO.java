/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.user.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.user.entity.ApUserDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Repository
public class ApUserDAO extends CRUDDAO<ApUserMapper, ApUserDO> {

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
    return mapper.selectByEasNumber(userCode);
  }

}
