/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.org.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.org.entity.ApOrgDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

@Repository
public class ApOrgDAO extends CRUDDAO<ApOrgMapper, ApOrgDO> {

  /**
   * 组织编码获取组织信息
   * 
   * @param orgCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  public ApOrgDO selectByEasOrgNumber(String orgCode) throws Exception {
    return mapper.selectByEasOrgNumber(orgCode);
  }

}
