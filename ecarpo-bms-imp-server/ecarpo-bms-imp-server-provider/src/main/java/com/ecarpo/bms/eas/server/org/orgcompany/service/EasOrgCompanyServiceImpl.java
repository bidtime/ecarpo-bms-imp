/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgcompany.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.org.orgcompany.dto.SaveOrgCompanyDTO;
import com.ecarpo.bms.eas.org.orgcompany.service.EasOrgCompanyService;
import com.ecarpo.bms.eas.server.org.orgcompany.dao.EasOrgCompanyDAO;
import com.ecarpo.bms.eas.server.org.orgcompany.dao.EasOrgCompanyMapper;
import com.ecarpo.bms.eas.server.org.orgcompany.entity.EasOrgCompanyDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgCompanyServiceImpl extends
    BaseServiceImpl<EasOrgCompanyManager, EasOrgCompanyDAO, EasOrgCompanyMapper, EasOrgCompanyDO>
    implements EasOrgCompanyService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.org.orgcompany.service.EasOrgCompanyService#save(com.ecarpo.bms.eas.org.orgcompany.dto.SaveOrgCompanyDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(SaveOrgCompanyDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
