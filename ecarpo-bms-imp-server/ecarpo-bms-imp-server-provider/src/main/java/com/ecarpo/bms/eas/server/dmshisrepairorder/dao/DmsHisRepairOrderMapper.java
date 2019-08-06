/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.dao;

import com.ecarpo.bms.eas.server.dmshisrepairorder.entity.DmsHisRepairOrderDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "历史维修工单")
public interface DmsHisRepairOrderMapper extends BaseMapper<DmsHisRepairOrderDO> {
}