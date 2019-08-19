/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.crmmembercar.entity.CrmMemberCarDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "会员车辆")
public interface CrmMemberCarMapper extends BaseMapper<CrmMemberCarDO> {
  
//  @TryExcept(cmd = "GET")
//  Integer selectIdByCode(@Param("code")String code, @Param("store_id")Integer store_id);

  @TryExcept(cmd = "GET")
  Long existsByPlateNo(@Param("plate_no")String plateNo, @Param("store_id")Integer store_id);

}