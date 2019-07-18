/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.orgctrlunit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.orgctrlunit.dto.EasOrgCtrlUnitSaveDTO;
import com.ecarpo.bms.eas.orgctrlunit.service.EasOrgCtrlUnitService;
import com.ecarpo.bms.eas.server.orgctrlunit.dao.EasOrgCtrlUnitDAO;
import com.ecarpo.bms.eas.server.orgctrlunit.dao.EasOrgCtrlUnitMapper;
import com.ecarpo.bms.eas.server.orgctrlunit.entity.EasOrgCtrlUnitDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;


/**
 * @author lhf
 * @since 2019/6/14
 */
@Service
public class EasOrgCtrlUnitServiceImpl extends
    BaseServiceImpl<EasOrgCtrlUnitManager, EasOrgCtrlUnitDAO, EasOrgCtrlUnitMapper, EasOrgCtrlUnitDO>
    implements EasOrgCtrlUnitService {

  /* (non-Javadoc)
   *
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(EasOrgCtrlUnitSaveDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
