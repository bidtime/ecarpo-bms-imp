/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "产品信息")
public interface CrmBaseProductMapper extends BaseMapper<CrmBaseProductDO> {
  
  @TryExcept(cmd = "GET")
  Integer selectIdByCode(String code);
  
  @TryExcept(cmd = "GET", value = "类型")
  Integer selectProductIdByProductName(@Param("type_name")String type_name, @Param("store_id")Integer store_id);
  
}