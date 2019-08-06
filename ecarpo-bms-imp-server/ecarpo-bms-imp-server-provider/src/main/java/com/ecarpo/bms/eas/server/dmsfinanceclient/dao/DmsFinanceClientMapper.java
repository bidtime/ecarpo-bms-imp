/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.dao;

import com.ecarpo.bms.eas.server.dmsfinanceclient.entity.DmsFinanceClientDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "往来客户")
public interface DmsFinanceClientMapper extends BaseMapper<DmsFinanceClientDO> {

}