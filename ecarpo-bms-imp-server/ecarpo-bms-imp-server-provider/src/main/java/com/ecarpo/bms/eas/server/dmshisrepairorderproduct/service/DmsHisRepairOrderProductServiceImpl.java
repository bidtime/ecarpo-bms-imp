/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dao.DmsHisRepairOrderProductMapper;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto.DmsHisRepairOrderProductInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto.DmsHisRepairOrderProductUpdateDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.entity.DmsHisRepairOrderProductDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsHisRepairOrderProductServiceImpl extends
  BaseImplement<DmsHisRepairOrderProductManager, DmsHisRepairOrderProductMapper, DmsHisRepairOrderProductDO> implements DmsHisRepairOrderProductService {

  @Override
  public ResultDTO<Integer> insert(DmsHisRepairOrderProductInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsHisRepairOrderProductUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
