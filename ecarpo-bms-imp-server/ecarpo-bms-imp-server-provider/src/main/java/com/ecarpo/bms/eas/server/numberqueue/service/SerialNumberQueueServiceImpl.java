/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.numberqueue.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.numberqueue.dao.SerialNumberQueueMapper;
import com.ecarpo.bms.eas.server.numberqueue.entity.SerialNumberQueueDO;
import com.ecarpo.bms.eas.server.serialnumber.dto.SerialNumberInsertDTO;
import com.ecarpo.bms.eas.server.serialnumber.dto.SerialNumberUpdateDTO;
import com.ecarpo.bms.eas.server.serialnumber.service.SerialNumberQueueService;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class SerialNumberQueueServiceImpl extends
  BaseImplement<SerialNumberQueueManager, SerialNumberQueueMapper, SerialNumberQueueDO> implements SerialNumberQueueService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(SerialNumberInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(SerialNumberUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }

  @Override
  public ResultDTO<Integer> selectNumberByParams(Date date, Integer storeId, String flag) {
    return new ResultDTO<>(manager.selectNumberByParams(date, storeId, flag));
  }

  @Override
  public ResultDTO<Integer> getNumberByParams(Date date, Integer storeId, String flag) {
    return new ResultDTO<>(manager.getNumberByParams(date, storeId, flag));
  }

  @Override
  public ResultDTO<String> getStrByParams(Date date, Integer storeId, String flag) {
    return new ResultDTO<>(manager.getStrByParams(date, storeId, flag));
  }
  
}
