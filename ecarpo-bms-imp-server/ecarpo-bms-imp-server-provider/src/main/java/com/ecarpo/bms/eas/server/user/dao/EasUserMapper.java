/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.user.entity.EasUserDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@MapperDesc(value = "用户")
public interface EasUserMapper extends BaseMapper<EasUserDO> {

  /**
   * 编码获取人员信息
   * 
   * @param userCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  EasUserDO selectByEasNumber(@Param("userCode") String userCode);

}
