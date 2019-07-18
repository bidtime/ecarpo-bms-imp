/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgcompany.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.org.orgcompany.entity.EasOrgCompanyDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Repository
public class EasOrgCompanyDAO extends CRUDDAO<EasOrgCompanyMapper, EasOrgCompanyDO> {

  /**
   * id获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public EasOrgCompanyDO selectById(String id) throws Exception {
    return mapper.selectById(id);
  }

}
