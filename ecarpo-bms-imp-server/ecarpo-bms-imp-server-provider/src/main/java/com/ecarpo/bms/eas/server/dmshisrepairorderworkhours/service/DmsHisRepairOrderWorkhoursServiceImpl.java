/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dao.DmsHisRepairOrderWorkhoursMapper;
import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dto.DmsHisRepairOrderWorkhoursInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dto.DmsHisRepairOrderWorkhoursUpdateDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.entity.DmsHisRepairOrderWorkhoursDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsHisRepairOrderWorkhoursServiceImpl extends
  BaseImplement<DmsHisRepairOrderWorkhoursManager, DmsHisRepairOrderWorkhoursMapper, DmsHisRepairOrderWorkhoursDO> implements DmsHisRepairOrderWorkhoursService {

  @Override
  public ResultDTO<Integer> insert(DmsHisRepairOrderWorkhoursInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsHisRepairOrderWorkhoursUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
