/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.service;

import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto.DmsHisRepairOrderProductInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto.DmsHisRepairOrderProductUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsHisRepairOrderProductService {
  
  ResultDTO<Integer> insert(DmsHisRepairOrderProductInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsHisRepairOrderProductUpdateDTO dto) throws Exception;

}
