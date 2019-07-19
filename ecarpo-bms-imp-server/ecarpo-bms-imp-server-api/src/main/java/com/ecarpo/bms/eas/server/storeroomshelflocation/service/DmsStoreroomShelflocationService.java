/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.service;

import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationInsertDTO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.dto.DmsStoreroomShelflocationUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsStoreroomShelflocationService {
  
  ResultDTO<Number> insertLong(DmsStoreroomShelflocationInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsStoreroomShelflocationUpdateDTO dto) throws Exception;

}
