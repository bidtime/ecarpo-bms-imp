/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.service;

import com.ecarpo.bms.eas.server.dmshisrepairorder.dto.DmsHisRepairOrderInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorder.dto.DmsHisRepairOrderUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsHisRepairOrderService {
  
  ResultDTO<Number> insertLong(DmsHisRepairOrderInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsHisRepairOrderUpdateDTO dto) throws Exception;

}
