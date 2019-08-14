/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.user.dao.IUserMapper;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.entity.IUserDO;
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.framework.common.service.BaseImplement;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasUserServiceImpl extends
  BaseImplement<IUserManager, IUserMapper, IUserDO> implements IEasUserService {

  @Override
  public ResultDTO<Integer> login(UserPwdDTO dto) {
    return new ResultDTO<>(manager.login(dto) ? 1:0);
  }
  
  @Override
  public ResultDTO<IdNameQO> getStoresByUserId(Integer userId) {
    return new ResultDTO<>(manager.getStoresByUserId(userId));
  }

}
