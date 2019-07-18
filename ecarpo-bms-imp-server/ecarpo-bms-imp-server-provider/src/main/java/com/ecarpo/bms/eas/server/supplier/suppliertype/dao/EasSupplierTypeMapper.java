/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.suppliertype.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.supplier.suppliertype.entity.EasSupplierTypeDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/05
 */
@MapperDesc(value = "eas_supplier_type")
public interface EasSupplierTypeMapper extends BaseMapper<EasSupplierTypeDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  EasSupplierTypeDO selectByPK(@Param("id") String id);

}
