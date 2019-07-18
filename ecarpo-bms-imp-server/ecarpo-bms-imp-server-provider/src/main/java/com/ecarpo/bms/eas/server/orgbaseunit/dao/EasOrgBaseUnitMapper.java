/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgbaseunit.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.orgbaseunit.entity.EasOrgBaseUnitDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/12
 */
@MapperDesc(value = "eas_org_base_unit")
public interface EasOrgBaseUnitMapper extends BaseMapper<EasOrgBaseUnitDO> {

  /**
   * 组织编码获取组织基类信息
   * 
   * @param encrypt
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  EasOrgBaseUnitDO selectByNumber(@Param("encrypt") String encrypt);

  /**
   * id 获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.14
   */
  EasOrgBaseUnitDO selectById(@Param("id") String id);

  /**
   * 组织id 获取EAS对应的组织信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  EasOrgBaseUnitDO selectInfoByOrgId(@Param("orgId") Long orgId);

}
