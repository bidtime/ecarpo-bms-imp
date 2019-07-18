/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.org.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.org.entity.ApOrgDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "组织")
public interface ApOrgMapper extends BaseMapper<ApOrgDO> {

  /**
   * 组织编码获取组织信息
   * 
   * @param orgCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  ApOrgDO selectByEasOrgNumber(@Param("orgCode") String orgCode);

}
