/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.user.dao.EasUserMapper;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.entity.EasUserDO;
import com.ecarpo.framework.common.service.BaseServiceImpl2;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasUserServiceImpl extends
  BaseServiceImpl2<EasUserManager, EasUserMapper, EasUserDO> implements EasUserService {

  @Override
  public ResultDTO<Integer> login(UserPwdDTO dto) {
    return new ResultDTO<>(manager.login(dto) ? 1:0);
  }

}
