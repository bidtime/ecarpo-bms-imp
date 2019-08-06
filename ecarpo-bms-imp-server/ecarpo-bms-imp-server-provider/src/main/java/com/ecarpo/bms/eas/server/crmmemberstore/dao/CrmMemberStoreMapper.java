/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.dao;

import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "储值记录")
public interface CrmMemberStoreMapper extends BaseMapper<CrmMemberStoreDO> {
}