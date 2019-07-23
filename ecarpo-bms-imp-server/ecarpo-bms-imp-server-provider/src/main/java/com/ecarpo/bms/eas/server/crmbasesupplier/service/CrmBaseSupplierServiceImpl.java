/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmbasesupplier.dao.CrmBaseSupplierMapper;
import com.ecarpo.bms.eas.server.crmbasesupplier.dto.CrmBaseSupplierInsertDTO;
import com.ecarpo.bms.eas.server.crmbasesupplier.dto.CrmBaseSupplierUpdateDTO;
import com.ecarpo.bms.eas.server.crmbasesupplier.entity.CrmBaseSupplierDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmBaseSupplierServiceImpl extends
  BaseImplement<CrmBaseSupplierManager, CrmBaseSupplierMapper, CrmBaseSupplierDO> implements CrmBaseSupplierService {

  @Override
  public ResultDTO<Integer> insert(CrmBaseSupplierInsertDTO dto) throws Exception {
    return super.insert(dto);
  }

  @Override
  public ResultDTO<Integer> update(CrmBaseSupplierUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
