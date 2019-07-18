/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgpurchase.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.org.orgpurchase.entity.EasOrgPurchaseDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Repository
public class EasOrgPurchaseDAO extends CRUDDAO<EasOrgPurchaseMapper, EasOrgPurchaseDO> {

  /**
   * id获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public EasOrgPurchaseDO selectById(String id) throws Exception {
    return mapper.selectById(id);
  }

}
