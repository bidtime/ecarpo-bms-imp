/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.material.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.material.dto.EasMaterialInsertDTO;
import com.ecarpo.bms.eas.material.dto.EasMaterialUpdateDTO;
import com.ecarpo.bms.eas.material.service.EasMaterialService;
import com.ecarpo.bms.eas.server.material.dao.EasMaterialDAO;
import com.ecarpo.bms.eas.server.material.dao.EasMaterialMapper;
import com.ecarpo.bms.eas.server.material.entity.EasMaterialDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasMaterialServiceImpl extends
    BaseServiceImpl<EasMaterialManager, EasMaterialDAO, EasMaterialMapper, EasMaterialDO> implements EasMaterialService {


  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insert(EasMaterialInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasMaterialUpdateDTO dto) throws Exception {
    return new ResultDTO<>(manager.updateByBase(dto));
  }
}
