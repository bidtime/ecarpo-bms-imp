/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgsale.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.org.orgsale.dto.SaveOrgSaleDTO;
import com.ecarpo.bms.eas.org.orgsale.service.EasOrgSaleService;
import com.ecarpo.bms.eas.server.org.orgsale.dao.EasOrgSaleDAO;
import com.ecarpo.bms.eas.server.org.orgsale.dao.EasOrgSaleMapper;
import com.ecarpo.bms.eas.server.org.orgsale.entity.EasOrgSaleDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgSaleServiceImpl
    extends BaseServiceImpl<EasOrgSaleManager, EasOrgSaleDAO, EasOrgSaleMapper, EasOrgSaleDO>
    implements EasOrgSaleService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.org.OrgSale.service.EasOrgSaleService#save(com.ecarpo.bms.eas.org.OrgSale.dto.SaveOrgSaleDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(SaveOrgSaleDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
