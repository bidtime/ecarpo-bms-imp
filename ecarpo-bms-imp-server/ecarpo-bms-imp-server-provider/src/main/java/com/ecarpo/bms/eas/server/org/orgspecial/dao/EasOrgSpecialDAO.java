/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgspecial.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.org.orgspecial.entity.EasOrgSpecialDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Repository
public class EasOrgSpecialDAO extends CRUDDAO<EasOrgSpecialMapper, EasOrgSpecialDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public EasOrgSpecialDO selectById(String id) throws Exception {
    return mapper.selectById(id);
  }

}
