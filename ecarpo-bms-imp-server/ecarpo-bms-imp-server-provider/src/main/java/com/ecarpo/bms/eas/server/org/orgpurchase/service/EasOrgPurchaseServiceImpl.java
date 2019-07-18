/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgpurchase.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.org.orgpurchase.dto.SaveOrgPurchaseDTO;
import com.ecarpo.bms.eas.org.orgpurchase.service.EasOrgPurchaseService;
import com.ecarpo.bms.eas.server.org.orgpurchase.dao.EasOrgPurchaseDAO;
import com.ecarpo.bms.eas.server.org.orgpurchase.dao.EasOrgPurchaseMapper;
import com.ecarpo.bms.eas.server.org.orgpurchase.entity.EasOrgPurchaseDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgPurchaseServiceImpl extends
    BaseServiceImpl<EasOrgPurchaseManager, EasOrgPurchaseDAO, EasOrgPurchaseMapper, EasOrgPurchaseDO>
    implements EasOrgPurchaseService {

  /* (non-Javadoc)
   * @see com.ecarpo.bms.eas.org.orgcompany.service.EasOrgPurchaseService#save(com.ecarpo.bms.eas.org.orgcompany.dto.SaveOrgCompanyDTO)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(SaveOrgPurchaseDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
