/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.userproduct.entity.ApUserProductDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "用户模块")
public interface ApUserProductMapper extends BaseMapper<ApUserProductDO> {

  /**
   * userId 删除记录
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  Integer deleteByUserId(@Param("userId") Long userId);

}
