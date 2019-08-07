/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.dmsrepairworkhour.dao.DmsRepairWorkhourMapper;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourInsertDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.dto.DmsRepairWorkhourUpdateDTO;
import com.ecarpo.bms.eas.server.dmsrepairworkhour.entity.DmsRepairWorkhourDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsRepairWorkhourServiceImpl extends
  BaseImplement<DmsRepairWorkhourManager, DmsRepairWorkhourMapper, DmsRepairWorkhourDO> implements DmsRepairWorkhourService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(DmsRepairWorkhourInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(DmsRepairWorkhourUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
