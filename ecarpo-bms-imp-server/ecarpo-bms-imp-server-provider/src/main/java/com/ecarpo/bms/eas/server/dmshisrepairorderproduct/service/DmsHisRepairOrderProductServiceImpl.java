/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dao.DmsHisRepairOrderProductMapper;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.entity.DmsHisRepairOrderProductDO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourInsertDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourUpdateDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.service.DmsRepairWorkhourService;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsHisRepairOrderProductServiceImpl extends
  BaseImplement<DmsHisRepairOrderProductManager, DmsHisRepairOrderProductMapper, DmsHisRepairOrderProductDO> implements DmsRepairWorkhourService {

  @Override
  public ResultDTO<Integer> insert(DmsRepairWorkhourInsertDTO dto) throws Exception {
    return super.insert(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsRepairWorkhourUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
