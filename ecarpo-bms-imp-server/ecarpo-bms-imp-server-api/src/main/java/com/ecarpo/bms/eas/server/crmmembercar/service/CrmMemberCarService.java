/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.service;

import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarExInsertDTO;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarInsertDTO;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface CrmMemberCarService {
  
  ResultDTO<Integer> insert(CrmMemberCarInsertDTO dto) throws Exception;
  
  ResultDTO<Integer> insert(CrmMemberCarExInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(CrmMemberCarUpdateDTO dto) throws Exception;

}
