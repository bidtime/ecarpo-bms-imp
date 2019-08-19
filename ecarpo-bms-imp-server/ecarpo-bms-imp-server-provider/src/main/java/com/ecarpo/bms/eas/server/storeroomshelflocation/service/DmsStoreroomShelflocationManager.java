/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.storeroomshelflocation.dao.DmsStoreroomShelflocationMapper;
import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.framework.common.service.BaseManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsStoreroomShelflocationManager extends BaseManager<DmsStoreroomShelflocationMapper, DmsStoreroomShelflocationDO> {

  public Integer selectIdByCode(String code, Integer store_id) {
    return mapper.selectIdByCode(code, store_id);
  }
  
}
