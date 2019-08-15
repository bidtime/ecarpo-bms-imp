/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.dao;

import com.ecarpo.bms.eas.server.crmmembercar.entity.CrmMemberCarDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "会员车辆")
public interface CrmMemberCarMapper extends BaseMapper<CrmMemberCarDO> {
  
  Long existsByPlateNo(Integer plateNo);

}