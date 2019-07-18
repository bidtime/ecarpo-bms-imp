/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.suppliertype.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.supplier.suppliertype.entity.EasSupplierTypeDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Repository
public class EasSupplierTypeDAO extends CRUDDAO<EasSupplierTypeMapper, EasSupplierTypeDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public EasSupplierTypeDO selectByPK(String id) throws Exception{
    return mapper.selectByPK(id);
  }

}
