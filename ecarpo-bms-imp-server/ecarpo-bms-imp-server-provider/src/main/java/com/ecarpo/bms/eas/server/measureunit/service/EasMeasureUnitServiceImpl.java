/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.measureunit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitInsertDTO;
import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitUpdateDTO;
import com.ecarpo.bms.eas.measureunit.service.EasMeasureUnitService;
import com.ecarpo.bms.eas.server.measureunit.dao.EasMeasureUnitDAO;
import com.ecarpo.bms.eas.server.measureunit.dao.EasMeasureUnitMapper;
import com.ecarpo.bms.eas.server.measureunit.entity.EasMeasureUnitDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasMeasureUnitServiceImpl extends
    BaseServiceImpl<EasMeasureUnitManager, EasMeasureUnitDAO, EasMeasureUnitMapper, EasMeasureUnitDO> implements EasMeasureUnitService {

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insertLong(EasMeasureUnitInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasMeasureUnitUpdateDTO dto) throws Exception {
    return new ResultDTO<>(manager.updateByBase(dto));
  }
}
