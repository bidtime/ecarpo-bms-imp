/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.dao;

import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "产品设置")
public interface CrmBaseProductMapper extends BaseMapper<CrmBaseProductDO> {
}