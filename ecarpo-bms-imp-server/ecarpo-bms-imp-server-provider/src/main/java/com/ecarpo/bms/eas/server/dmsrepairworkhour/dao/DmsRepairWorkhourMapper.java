/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.dao;

import com.ecarpo.bms.eas.server.storeroomshelflocation.entity.DmsStoreroomShelflocationDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "工时信息")
public interface DmsRepairWorkhourMapper extends BaseMapper<DmsStoreroomShelflocationDO> {

}
