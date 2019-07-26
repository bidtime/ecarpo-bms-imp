/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.dmsbuydetail.dao.DmsBuyDetailMapper;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailUpdateDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.entity.DmsBuyDetailDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsBuyDetailServiceImpl extends
  BaseImplement<DmsBuyDetailManager, DmsBuyDetailMapper, DmsBuyDetailDO> implements DmsBuyDetailService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(DmsBuyDetailInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(DmsBuyDetailUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
