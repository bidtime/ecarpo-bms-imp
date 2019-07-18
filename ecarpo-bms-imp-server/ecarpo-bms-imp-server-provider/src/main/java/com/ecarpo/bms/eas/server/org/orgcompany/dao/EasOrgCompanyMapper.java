/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgcompany.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.org.orgcompany.entity.EasOrgCompanyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/13
 */
@MapperDesc(value = "eas_org_company")
public interface EasOrgCompanyMapper extends BaseMapper<EasOrgCompanyDO> {

  /**
   * id获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  EasOrgCompanyDO selectById(@Param("id") String id);

}
