/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.dao;

import com.ecarpo.bms.eas.server.dmsbuy.entity.DmsBuyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "DMS采购")
public interface DmsBuyMapper extends BaseMapper<DmsBuyDO> {
}