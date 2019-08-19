/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmcustom.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.crmcustom.entity.CrmCustomDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "客户")
public interface CrmCustomMapper extends BaseMapper<CrmCustomDO> {
  
//  @TryExcept(cmd = "GET")
//  Integer selectIdByCode(@Param("code")String code, @Param("store_id")Integer store_id);
  
  CrmCustomDO selectByMobile(@Param("mobile")String mobile, @Param("store_id")Integer store_id);
  
}