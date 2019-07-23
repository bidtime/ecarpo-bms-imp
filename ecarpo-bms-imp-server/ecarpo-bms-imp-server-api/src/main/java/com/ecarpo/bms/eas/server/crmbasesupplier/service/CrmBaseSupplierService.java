/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.service;

import com.ecarpo.bms.eas.server.crmbasesupplier.dto.CrmBaseSupplierInsertDTO;
import com.ecarpo.bms.eas.server.crmbasesupplier.dto.CrmBaseSupplierUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface CrmBaseSupplierService {
  
  ResultDTO<Integer> insert(CrmBaseSupplierInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(CrmBaseSupplierUpdateDTO dto) throws Exception;

}
