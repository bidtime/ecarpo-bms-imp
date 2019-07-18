/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplier.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.supplier.supplier.entity.EasSupplierDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Repository
public class EasSupplierDAO extends CRUDDAO<EasSupplierMapper, EasSupplierDO> {

  /**
   * 主键获取DO
   * 
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public EasSupplierDO selectByPK(String supplierId) throws Exception {
    return mapper.selectByPK(supplierId);
  }

}
