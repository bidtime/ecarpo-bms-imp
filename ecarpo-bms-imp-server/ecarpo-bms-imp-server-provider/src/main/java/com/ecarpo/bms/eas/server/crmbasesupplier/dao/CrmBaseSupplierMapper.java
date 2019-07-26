/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.dao;

import com.ecarpo.bms.eas.server.crmbasesupplier.entity.CrmBaseSupplierDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "供货商信息")
public interface CrmBaseSupplierMapper extends BaseMapper<CrmBaseSupplierDO> {
}