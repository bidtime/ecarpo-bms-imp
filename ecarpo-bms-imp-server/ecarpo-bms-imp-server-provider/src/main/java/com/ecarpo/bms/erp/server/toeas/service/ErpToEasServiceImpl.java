/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.erp.server.toeas.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.erp.server.toeas.dao.ErpToEasDAO;
import com.ecarpo.bms.erp.server.toeas.dao.ErpToEasMapper;
import com.ecarpo.bms.erp.server.toeas.dto.SaveErpToEasDTO;
import com.ecarpo.bms.erp.server.toeas.entity.ErpToEasDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.05.28
 */
@Service
public class ErpToEasServiceImpl
    extends BaseServiceImpl<ErpToEasManager, ErpToEasDAO, ErpToEasMapper, ErpToEasDO>
    implements ErpToEasService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.erp.server.toeas.service.ErpToEasService#insertByBase(com.ecarpo.bms.erp.server.toeas.dto.InsertErpToEasDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Long> save(SaveErpToEasDTO dto) throws Exception {
    return new ResultDTO<Long>(manager.save(dto));
  }

  /* (non-Javadoc)
   * @see com.ecarpo.bms.erp.server.toeas.service.ErpToEasService#sendTOEas()
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> sendTOEas() throws Exception {
    return new ResultDTO<Integer>(manager.sendTOEas());
  }

}
