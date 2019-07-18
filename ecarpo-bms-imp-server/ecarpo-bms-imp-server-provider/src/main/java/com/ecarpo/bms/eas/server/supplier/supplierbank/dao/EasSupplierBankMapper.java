/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplierbank.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.supplier.supplierbank.entity.EasSupplierBankDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
* Created by Mybatis Generator on 2019/06/05
*/
@MapperDesc(value = "eas_supplier_bank")
public interface EasSupplierBankMapper extends BaseMapper<EasSupplierBankDO> {
  
  /**
   * 供应商主键删除数据
   * 
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  Integer deleteBySupplierId(@Param("supplierId") String supplierId);

  
}