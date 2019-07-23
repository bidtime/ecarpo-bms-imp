/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.service;

import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourInsertDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsRepairWorkhourService {
  
  ResultDTO<Integer> insert(DmsRepairWorkhourInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsRepairWorkhourUpdateDTO dto) throws Exception;

}
