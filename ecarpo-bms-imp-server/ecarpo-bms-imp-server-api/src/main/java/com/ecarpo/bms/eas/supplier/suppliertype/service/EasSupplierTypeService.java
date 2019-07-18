/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.suppliertype.service;

import com.ecarpo.bms.eas.supplier.suppliertype.dto.SaveSupplierTypeDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
public interface EasSupplierTypeService {

  /**
   * 保存EAS 推送供应商分类信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  ResultDTO<Integer> save(SaveSupplierTypeDTO dto) throws Exception;

}
