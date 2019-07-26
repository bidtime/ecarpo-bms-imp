/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.storeroomshelflocation.dao.DmsStoreroomShelflocationMapper;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationInsertDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationUpdateDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsStoreroomShelflocationServiceImpl extends
  BaseImplement<DmsStoreroomShelflocationManager, DmsStoreroomShelflocationMapper, DmsStoreroomShelflocationDO> implements DmsStoreroomShelflocationService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(DmsStoreroomShelflocationInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(DmsStoreroomShelflocationUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }

}
