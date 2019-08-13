/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.service;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ecarpo.bms.eas.server.user.dao.IUserMapper;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.entity.IUserDO;
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.framework.common.service.BaseManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class IUserManager extends BaseManager<IUserMapper, IUserDO> {

  /**
   * 编码获取人员信息
   * 
   * @param userCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  public IUserDO selectByEasNumber(String userCode) throws Exception {
    //return mapper.selectByEasNumber(userCode);
    return null;
  }

  public boolean login(UserPwdDTO dto) {
    String pwd_md5 = DigestUtils.md5DigestAsHex(dto.getPwd().getBytes()).toLowerCase();
    Long l = mapper.existsUserByPwd(dto.getUser(), pwd_md5);
    return (l != null && l == 1) ? true : false;
  }
  
  public IdNameQO getStoresByUserId(Long userId) {
    return mapper.getStoresByUserId(userId);
  }

}
