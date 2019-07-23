/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.user.dao.EasUserMapper;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.entity.EasUserDO;
import com.ecarpo.framework.common.service.BaseManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasUserManager extends BaseManager<EasUserMapper, EasUserDO> {

  /**
   * 编码获取人员信息
   * 
   * @param userCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  public EasUserDO selectByEasNumber(String userCode) throws Exception {
    return mapper.selectByEasNumber(userCode);
  }

  public boolean login(UserPwdDTO dto) {
    return true;
  }

}
