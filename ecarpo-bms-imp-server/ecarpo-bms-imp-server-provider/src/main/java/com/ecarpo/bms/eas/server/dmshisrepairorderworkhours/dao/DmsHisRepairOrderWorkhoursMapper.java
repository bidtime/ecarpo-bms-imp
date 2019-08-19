/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dao;

import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.entity.DmsHisRepairOrderWorkhoursDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "历史工时表")
public interface DmsHisRepairOrderWorkhoursMapper extends BaseMapper<DmsHisRepairOrderWorkhoursDO> {
}