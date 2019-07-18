/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.supplier.service;

import com.ecarpo.bms.eas.supplier.supplier.dto.SaveSupplierDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
public interface EasSupplierService {

  /**
   * 保存EAS推送的供应商信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  ResultDTO<Integer> save(SaveSupplierDTO dto) throws Exception;
  
  
}
