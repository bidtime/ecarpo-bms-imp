/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.dmsbuy.dao.DmsBuyMapper;
import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyUpdateDTO;
import com.ecarpo.bms.eas.server.dmsbuy.entity.DmsBuyDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsBuyServiceImpl extends
  BaseImplement<DmsBuyManager, DmsBuyMapper, DmsBuyDO> implements DmsBuyService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(DmsBuyInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertSelective(dto));
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(DmsBuyUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
