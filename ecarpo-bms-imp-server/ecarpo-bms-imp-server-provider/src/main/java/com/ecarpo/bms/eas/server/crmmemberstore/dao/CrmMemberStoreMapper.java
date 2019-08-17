/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.dao;

import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "会员记录")
public interface CrmMemberStoreMapper extends BaseMapper<CrmMemberStoreDO> {
  
  Long existsByCustId(Integer custId);
  
  @TryExcept(cmd = "GET", value = "级别")
  Integer selectMemberIdByMemberName(String memberName);
  
}