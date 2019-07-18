/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgcompany.service;

import com.ecarpo.bms.eas.org.orgcompany.dto.SaveOrgCompanyDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
public interface EasOrgCompanyService {

  /**
   * 保存财务组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  ResultDTO<Integer> save(SaveOrgCompanyDTO dto) throws Exception;

}
