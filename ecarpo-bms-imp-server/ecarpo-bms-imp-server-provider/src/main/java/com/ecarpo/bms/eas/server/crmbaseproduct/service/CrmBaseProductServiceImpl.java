/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmbaseproduct.dao.CrmBaseProductMapper;
import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductInsertDTO;
import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductUpdateDTO;
import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmBaseProductServiceImpl extends
  BaseImplement<CrmBaseProductManager, CrmBaseProductMapper, CrmBaseProductDO> implements CrmBaseProductService {

  @Override
  public ResultDTO<Integer> insert(CrmBaseProductInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insert_type(dto));
  }

  @Override
  public ResultDTO<Integer> update(CrmBaseProductUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
