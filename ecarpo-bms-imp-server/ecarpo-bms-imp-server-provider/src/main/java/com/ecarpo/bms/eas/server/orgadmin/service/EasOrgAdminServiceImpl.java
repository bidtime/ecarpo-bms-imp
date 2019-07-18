/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgadmin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminInsertDTO;
import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminUpdateDTO;
import com.ecarpo.bms.eas.orgadmin.service.EasOrgAdminService;
import com.ecarpo.bms.eas.server.orgadmin.dao.EasOrgAdminDAO;
import com.ecarpo.bms.eas.server.orgadmin.dao.EasOrgAdminMapper;
import com.ecarpo.bms.eas.server.orgadmin.entity.EasOrgAdminDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasOrgAdminServiceImpl extends BaseServiceImpl<EasOrgAdminManager, EasOrgAdminDAO, EasOrgAdminMapper, EasOrgAdminDO> implements EasOrgAdminService {
  /*
   * (non-Javadoc)
   */
  @Transactional(rollbackFor = Exception.class)
  @Override
  public ResultDTO<Number> insert(EasOrgAdminInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Transactional(rollbackFor = Exception.class)
  @Override
  public ResultDTO<?> update(EasOrgAdminUpdateDTO dto) throws Exception {
    return new ResultDTO<>(manager.updateByBase(dto));
  }


}
