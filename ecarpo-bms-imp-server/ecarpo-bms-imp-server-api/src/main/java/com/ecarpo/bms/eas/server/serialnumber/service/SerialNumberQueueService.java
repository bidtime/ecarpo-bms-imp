/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.serialnumber.service;

import java.util.Date;

import com.ecarpo.bms.eas.server.serialnumber.dto.SerialNumberInsertDTO;
import com.ecarpo.bms.eas.server.serialnumber.dto.SerialNumberUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface SerialNumberQueueService {

  ResultDTO<Integer> insert(SerialNumberInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(SerialNumberUpdateDTO dto) throws Exception;
  
  ResultDTO<Integer> selectNumberByParams(Date date, Integer storeId, String flag);
  
  ResultDTO<Integer> getNumberByParams(Date date, Integer storeId, String flag);
  
  ResultDTO<String> getStrByParams(Date date, Integer storeId, String flag);
  
}
