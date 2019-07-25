/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmmemberstore.dao.CrmMemberStoreMapper;
import com.ecarpo.bms.eas.server.crmmemberstore.dto.CrmMemberStoreInsertDTO;
import com.ecarpo.bms.eas.server.crmmemberstore.dto.CrmMemberStoreUpdateDTO;
import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmMemberStoreServiceImpl extends
  BaseImplement<CrmMemberStoreManager, CrmMemberStoreMapper, CrmMemberStoreDO> implements CrmMemberStoreService {

  @Override
  public ResultDTO<Integer> insert(CrmMemberStoreInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  public ResultDTO<Integer> update(CrmMemberStoreUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
