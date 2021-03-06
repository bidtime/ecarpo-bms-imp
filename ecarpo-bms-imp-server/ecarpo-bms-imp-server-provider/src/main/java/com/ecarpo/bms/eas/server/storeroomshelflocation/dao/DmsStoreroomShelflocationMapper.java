/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "库区库位")
public interface DmsStoreroomShelflocationMapper extends BaseMapper<DmsStoreroomShelflocationDO> {

  @TryExcept(cmd = "GET")
  Integer selectIdByCode(@Param("location_code")String code, @Param("store_id")Integer store_id);
  
}