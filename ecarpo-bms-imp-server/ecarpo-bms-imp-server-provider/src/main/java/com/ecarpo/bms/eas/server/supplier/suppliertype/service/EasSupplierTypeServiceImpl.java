/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.suppliertype.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.supplier.suppliertype.dao.EasSupplierTypeDAO;
import com.ecarpo.bms.eas.server.supplier.suppliertype.dao.EasSupplierTypeMapper;
import com.ecarpo.bms.eas.server.supplier.suppliertype.entity.EasSupplierTypeDO;
import com.ecarpo.bms.eas.supplier.suppliertype.dto.SaveSupplierTypeDTO;
import com.ecarpo.bms.eas.supplier.suppliertype.service.EasSupplierTypeService;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierTypeServiceImpl extends
    BaseServiceImpl<EasSupplierTypeManager, EasSupplierTypeDAO, EasSupplierTypeMapper, EasSupplierTypeDO>
    implements EasSupplierTypeService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.supplier.suppliertype.service.EasSupplierTypeService#save(com.ecarpo.bms.eas.supplier.suppliertype.dto.SaveSupplierTypeDTO)
   */
  @Override
  public ResultDTO<Integer> save(SaveSupplierTypeDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
