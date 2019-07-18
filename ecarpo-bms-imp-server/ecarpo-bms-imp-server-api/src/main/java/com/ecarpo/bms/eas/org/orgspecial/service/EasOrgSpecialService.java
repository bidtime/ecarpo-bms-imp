/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgspecial.service;

import com.ecarpo.bms.eas.org.orgspecial.dto.SaveOrgSpecialDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
public interface EasOrgSpecialService {

  /**
   * 保存库存组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  ResultDTO<Integer> save(SaveOrgSpecialDTO dto) throws Exception;

}
