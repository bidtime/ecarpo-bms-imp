/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.supplierbank.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.supplier.supplierbank.dao.EasSupplierBankDAO;
import com.ecarpo.bms.eas.server.supplier.supplierbank.dao.EasSupplierBankMapper;
import com.ecarpo.bms.eas.server.supplier.supplierbank.entity.EasSupplierBankDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierBankManager
    extends BaseDAOManager<EasSupplierBankDAO, EasSupplierBankMapper, EasSupplierBankDO> {

  /**
   * 供应商主键删除数据
   * 
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public Integer deleteBySupplierId(String supplierId) throws Exception{
    return dao.deleteBySupplierId(supplierId);
  }

}
