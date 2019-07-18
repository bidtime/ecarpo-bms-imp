/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgspecial.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.org.orgspecial.dto.SaveOrgSpecialDTO;
import com.ecarpo.bms.eas.org.orgspecial.service.EasOrgSpecialService;
import com.ecarpo.bms.eas.server.org.orgspecial.dao.EasOrgSpecialDAO;
import com.ecarpo.bms.eas.server.org.orgspecial.dao.EasOrgSpecialMapper;
import com.ecarpo.bms.eas.server.org.orgspecial.entity.EasOrgSpecialDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgSpecialServiceImpl extends
    BaseServiceImpl<EasOrgSpecialManager, EasOrgSpecialDAO, EasOrgSpecialMapper, EasOrgSpecialDO>
    implements EasOrgSpecialService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.org.orgspecial.service.EasOrgSpecialService#saveOrgSpecial(com.ecarpo.bms.eas.org.orgspecial.dto.SaveOrgSpecialDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(SaveOrgSpecialDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
