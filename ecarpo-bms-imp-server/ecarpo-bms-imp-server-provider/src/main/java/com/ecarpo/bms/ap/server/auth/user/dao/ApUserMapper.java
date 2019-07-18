/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.user.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.user.entity.ApUserDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@MapperDesc(value = "用户")
public interface ApUserMapper extends BaseMapper<ApUserDO> {

  /**
   * 编码获取人员信息
   * 
   * @param userCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  ApUserDO selectByEasNumber(@Param("userCode") String userCode);

}
