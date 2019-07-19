/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.storeroomshelflocation.dao.DmsStoreroomShelflocationMapper;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationInsertDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationUpdateDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.service.DmsStoreroomShelflocationManager;
import com.ecarpo.bms.eas.server.storeroomshelflocation.service.DmsStoreroomShelflocationService;
import com.ecarpo.framework.common.service.BaseServiceImpl2;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsRepairWorkhourServiceImpl extends
  BaseServiceImpl2<DmsStoreroomShelflocationManager, DmsStoreroomShelflocationMapper, DmsStoreroomShelflocationDO> implements DmsStoreroomShelflocationService {

  @Override
  public ResultDTO<Number> insertLong(DmsStoreroomShelflocationInsertDTO dto) throws Exception {
    return super.insertLong(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsStoreroomShelflocationUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
