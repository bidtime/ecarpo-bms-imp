/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.service;

import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsBuyDetailService {
  
  ResultDTO<Number> insertLong(DmsBuyDetailInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsBuyDetailUpdateDTO dto) throws Exception;

}
