/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.server.crmmembercar.dao.CrmMemberCarMapper;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarExInsertDTO;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarInsertDTO;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarUpdateDTO;
import com.ecarpo.bms.eas.server.crmmembercar.entity.CrmMemberCarDO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmMemberCarServiceImpl extends
  BaseImplement<CrmMemberCarManager, CrmMemberCarMapper, CrmMemberCarDO> implements CrmMemberCarService {

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> insert(CrmMemberCarInsertDTO dto) throws Exception {
    return super.insertSelective(dto);
  }

  @Override
  public ResultDTO<Integer> insert(CrmMemberCarExInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertSelective(dto));
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> update(CrmMemberCarUpdateDTO dto) throws Exception {
    return super.updateDTO(dto);
  }
  
}
