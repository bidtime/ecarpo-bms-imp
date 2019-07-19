/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.service;

import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductInsertDTO;
import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface CrmBaseProductService {

  ResultDTO<Number> insertLong(CrmBaseProductInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(CrmBaseProductUpdateDTO dto) throws Exception;
  
}
