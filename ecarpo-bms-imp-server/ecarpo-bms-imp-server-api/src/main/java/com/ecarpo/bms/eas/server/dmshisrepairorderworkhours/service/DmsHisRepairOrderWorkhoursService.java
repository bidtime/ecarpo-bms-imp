/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.service;

import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dto.DmsHisRepairOrderWorkhoursInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dto.DmsHisRepairOrderWorkhoursUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsHisRepairOrderWorkhoursService {
  
  ResultDTO<Integer> insert(DmsHisRepairOrderWorkhoursInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsHisRepairOrderWorkhoursUpdateDTO dto) throws Exception;

}
