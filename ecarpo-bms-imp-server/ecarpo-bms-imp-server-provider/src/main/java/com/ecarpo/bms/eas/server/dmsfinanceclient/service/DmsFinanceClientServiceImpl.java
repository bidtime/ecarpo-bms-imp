/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmsfinanceclient.dao.DmsFinanceClientMapper;
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientInsertDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientUpdateDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.entity.DmsFinanceClientDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsFinanceClientServiceImpl extends
  BaseImplement<DmsFinanceClientManager, DmsFinanceClientMapper, DmsFinanceClientDO> implements DmsFinanceClientService {

  @Override
  public ResultDTO<Integer> insert(DmsFinanceClientInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  public ResultDTO<Integer> update(DmsFinanceClientUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
