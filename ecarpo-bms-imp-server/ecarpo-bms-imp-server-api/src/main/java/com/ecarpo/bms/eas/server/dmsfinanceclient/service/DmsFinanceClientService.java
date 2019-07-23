/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.service;

import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientInsertDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface DmsFinanceClientService {
  
  ResultDTO<Integer> insert(DmsFinanceClientInsertDTO dto) throws Exception;

  ResultDTO<Integer> update(DmsFinanceClientUpdateDTO dto) throws Exception;

}
