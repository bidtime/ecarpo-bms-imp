/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.supplier.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.supplier.supplier.dao.EasSupplierDAO;
import com.ecarpo.bms.eas.server.supplier.supplier.dao.EasSupplierMapper;
import com.ecarpo.bms.eas.server.supplier.supplier.entity.EasSupplierDO;
import com.ecarpo.bms.eas.supplier.supplier.dto.SaveSupplierDTO;
import com.ecarpo.bms.eas.supplier.supplier.service.EasSupplierService;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierServiceImpl
    extends BaseServiceImpl<EasSupplierManager, EasSupplierDAO, EasSupplierMapper, EasSupplierDO>
    implements EasSupplierService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.supplier.supplier.service.EasSupplierService#save(com.ecarpo.bms.eas.supplier.supplier.dto.SaveSupplierDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(SaveSupplierDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

  
}
