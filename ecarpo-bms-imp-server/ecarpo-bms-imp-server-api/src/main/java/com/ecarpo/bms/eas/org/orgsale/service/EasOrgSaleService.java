/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgsale.service;

import com.ecarpo.bms.eas.org.orgsale.dto.SaveOrgSaleDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
public interface EasOrgSaleService {

  /**
   * 保存销售组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  ResultDTO<Integer> save(SaveOrgSaleDTO dto) throws Exception;

}
