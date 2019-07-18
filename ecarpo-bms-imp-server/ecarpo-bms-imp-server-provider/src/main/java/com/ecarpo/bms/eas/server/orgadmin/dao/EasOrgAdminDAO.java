/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgadmin.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.orgadmin.entity.EasOrgAdminDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasOrgAdminDAO extends CRUDDAO<EasOrgAdminMapper, EasOrgAdminDO> {

  /**
   * id获取DO
   *
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public EasOrgAdminDO selectById(String id) throws Exception {
    return mapper.selectById(id);
  }

}
