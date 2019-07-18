/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgpurchase.service;

import com.ecarpo.bms.eas.org.orgpurchase.dto.SaveOrgPurchaseDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
public interface EasOrgPurchaseService {

  /**
   * 保存采购组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  ResultDTO<Integer> save(SaveOrgPurchaseDTO dto) throws Exception;

}
