/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgctrlunit.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.orgctrlunit.entity.EasOrgCtrlUnitDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/14
 */
@MapperDesc(value = "eas_org_ctrl_unit")
public interface EasOrgCtrlUnitMapper extends BaseMapper<EasOrgCtrlUnitDO> {

  /**
   * 主键获取DO
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/14
   */
  EasOrgCtrlUnitDO selectById(@Param("id") String id);
}