/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplier.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.supplier.supplier.entity.EasSupplierDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@MapperDesc(value = "eas_supplier")
public interface EasSupplierMapper extends BaseMapper<EasSupplierDO> {

  /**
   * 主键获取DO
   * 
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  EasSupplierDO selectByPK(@Param("supplierId") String supplierId);

}
