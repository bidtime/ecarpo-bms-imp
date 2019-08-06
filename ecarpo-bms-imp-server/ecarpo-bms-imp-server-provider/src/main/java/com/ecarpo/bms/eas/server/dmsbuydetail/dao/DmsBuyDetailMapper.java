/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.dao;

import com.ecarpo.bms.eas.server.dmsbuydetail.entity.DmsBuyDetailDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "采购单明细")
public interface DmsBuyDetailMapper extends BaseMapper<DmsBuyDetailDO> {
}