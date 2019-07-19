/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.service;

import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFnanceClientInsertDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFnanceClientUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsFnanceClientService {
  
  ResultDTO<Number> insertLong(DmsFnanceClientInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsFnanceClientUpdateDTO dto) throws Exception;

}
