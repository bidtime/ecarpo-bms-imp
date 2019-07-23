/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmshisrepairorder.dao.DmsHisRepairOrderMapper;
import com.ecarpo.bms.eas.server.dmshisrepairorder.dto.DmsHisRepairOrderInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorder.dto.DmsHisRepairOrderUpdateDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorder.entity.DmsHisRepairOrderDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsHisRepairOrderServiceImpl extends
  BaseImplement<DmsHisRepairOrderManager, DmsHisRepairOrderMapper, DmsHisRepairOrderDO> implements DmsHisRepairOrderService {

  @Override
  public ResultDTO<Integer> insert(DmsHisRepairOrderInsertDTO dto) throws Exception {
    return super.insert(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsHisRepairOrderUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
