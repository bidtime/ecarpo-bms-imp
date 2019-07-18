/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgsale.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.org.orgsale.entity.EasOrgSaleDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/14
 */
@MapperDesc(value = "eas_org_sale")
public interface EasOrgSaleMapper extends BaseMapper<EasOrgSaleDO> {

  /**
   * id获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  EasOrgSaleDO selectById(@Param("id") String id);
}
