/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.service;

import java.util.List;

import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
public interface EasUserService {
  
  ResultDTO<Integer> login(UserPwdDTO dto);
  
  ResultDTO<List<IdNameQO>> getStoresByUserId(Long userId);
  
}
