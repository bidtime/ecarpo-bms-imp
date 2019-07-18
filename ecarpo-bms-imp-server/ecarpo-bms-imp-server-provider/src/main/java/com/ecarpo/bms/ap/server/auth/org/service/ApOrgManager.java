/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.org.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.org.dao.ApOrgDAO;
import com.ecarpo.bms.ap.server.auth.org.dao.ApOrgMapper;
import com.ecarpo.bms.ap.server.auth.org.entity.ApOrgDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class ApOrgManager extends BaseDAOManager<ApOrgDAO, ApOrgMapper, ApOrgDO> {

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
    return dao.selectByEasOrgNumber(orgCode);
  }

}
