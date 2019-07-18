/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgbaseunit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitInsertDTO;
import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitUpdateDTO;
import com.ecarpo.bms.eas.orgbaseunit.service.EasOrgBaseUnitService;
import com.ecarpo.bms.eas.server.orgbaseunit.dao.EasOrgBaseUnitDAO;
import com.ecarpo.bms.eas.server.orgbaseunit.dao.EasOrgBaseUnitMapper;
import com.ecarpo.bms.eas.server.orgbaseunit.entity.EasOrgBaseUnitDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasOrgBaseUnitServiceImpl extends
    BaseServiceImpl<EasOrgBaseUnitManager, EasOrgBaseUnitDAO, EasOrgBaseUnitMapper, EasOrgBaseUnitDO>
    implements EasOrgBaseUnitService {

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insert(EasOrgBaseUnitInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasOrgBaseUnitUpdateDTO dto) throws Exception {
    return new ResultDTO<>(manager.updateByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(readOnly = true)
  public ResultDTO<String> selectByOrgId(Long orgId) throws Exception {
    return new ResultDTO<String>(manager.selectByOrgId(orgId));
  }

}
