/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.service;

import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsBuyService {

  ResultDTO<Integer> insert(DmsBuyInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsBuyUpdateDTO dto) throws Exception;

}
