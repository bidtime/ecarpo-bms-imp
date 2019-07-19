/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.service;

import com.ecarpo.bms.eas.server.crmmemberstore.dto.CrmMemberStoreInsertDTO;
import com.ecarpo.bms.eas.server.crmmemberstore.dto.CrmMemberStoreUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface CrmMemberStoreService {

  ResultDTO<Number> insertLong(CrmMemberStoreInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(CrmMemberStoreUpdateDTO dto) throws Exception;

}
