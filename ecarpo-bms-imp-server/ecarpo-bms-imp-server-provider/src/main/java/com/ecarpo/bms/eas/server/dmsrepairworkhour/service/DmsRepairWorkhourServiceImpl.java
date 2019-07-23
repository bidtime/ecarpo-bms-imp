/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourInsertDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourUpdateDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dao.DmsStoreroomShelflocationMapper;
import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.service.DmsStoreroomShelflocationManager;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsRepairWorkhourServiceImpl extends
  BaseImplement<DmsStoreroomShelflocationManager, DmsStoreroomShelflocationMapper, DmsStoreroomShelflocationDO> implements DmsRepairWorkhourService {

  @Override
  public ResultDTO<Integer> insert(DmsRepairWorkhourInsertDTO dto) throws Exception {
    return super.insert(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsRepairWorkhourUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
