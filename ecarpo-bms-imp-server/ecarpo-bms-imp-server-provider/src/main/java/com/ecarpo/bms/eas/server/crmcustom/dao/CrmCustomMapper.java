/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmcustom.dao;

import com.ecarpo.bms.eas.server.crmcustom.entity.CrmCustomDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "客户")
public interface CrmCustomMapper extends BaseMapper<CrmCustomDO> {
  
  CrmCustomDO selectByMobile(String mobile);
  
}