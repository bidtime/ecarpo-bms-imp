/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgadmin.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.orgadmin.entity.EasOrgAdminDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
* Created by Mybatis Generator on 2019/06/13
*/
@MapperDesc(value = "eas_org_admin")
public interface EasOrgAdminMapper extends BaseMapper<EasOrgAdminDO> {

  /**
   * id获取DO
   *
   * @param id
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.13
   */
  EasOrgAdminDO selectById(@Param("id") String id);
}