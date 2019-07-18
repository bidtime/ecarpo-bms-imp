/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplierbank.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.supplier.supplierbank.entity.EasSupplierBankDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Repository
public class EasSupplierBankDAO extends CRUDDAO<EasSupplierBankMapper, EasSupplierBankDO> {

  /**
   * 供应商主键删除数据
   * 
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public Integer deleteBySupplierId(String supplierId) throws Exception {
    return mapper.deleteBySupplierId(supplierId);
  }

  
}
