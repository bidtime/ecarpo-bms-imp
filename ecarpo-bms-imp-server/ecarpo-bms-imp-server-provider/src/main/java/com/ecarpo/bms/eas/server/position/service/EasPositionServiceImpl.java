/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.position.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.position.dto.EasPositionInsertDTO;
import com.ecarpo.bms.eas.position.dto.EasPositionUpdateDTO;
import com.ecarpo.bms.eas.position.service.EasPositionService;
import com.ecarpo.bms.eas.server.position.dao.EasPositionDAO;
import com.ecarpo.bms.eas.server.position.dao.EasPositionMapper;
import com.ecarpo.bms.eas.server.position.entity.EasPositionDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasPositionServiceImpl extends
    BaseServiceImpl<EasPositionManager, EasPositionDAO, EasPositionMapper, EasPositionDO> implements EasPositionService {

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insertLong(EasPositionInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
//    return new ResultDTO<>(manager.insert(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasPositionUpdateDTO dto) throws Exception {

    return new ResultDTO<>(manager.updateByBase(dto));
//    EasPositionDO d = DAOUtils.cloneBean(EasPositionDO.class, dto);
//    return new ResultDTO<>(manager.updateSelective(d));
  }
}
