/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgspecial.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.org.orgspecial.entity.EasOrgSpecialDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/13
 */
@MapperDesc(value = "eas_org_storage")
public interface EasOrgSpecialMapper extends BaseMapper<EasOrgSpecialDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  EasOrgSpecialDO selectById(@Param("id") String id);

}