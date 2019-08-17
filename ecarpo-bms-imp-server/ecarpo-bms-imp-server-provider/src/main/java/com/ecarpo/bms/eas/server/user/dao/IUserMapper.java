/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.user.entity.IUserDO;
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "用户")
public interface IUserMapper extends BaseMapper<IUserDO> {
  
  Long existsUserByPwd(@Param("username") String username, @Param("pwd") String pwd);
  
  Integer selectUserIdByPwd(@Param("username") String username, @Param("pwd") String pwd);
  
  IdNameQO getStoresByUserId(Integer userId);

}