/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.duser.dao;

import com.ecarpo.bms.eas.server.duser.entity.DUserDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "用户所属店")
public interface DUserMapper extends BaseMapper<DUserDO> {

}