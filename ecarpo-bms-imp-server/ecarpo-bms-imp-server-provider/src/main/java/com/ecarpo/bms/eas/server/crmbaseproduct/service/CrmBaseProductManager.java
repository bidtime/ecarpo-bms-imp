/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmbaseproduct.dao.CrmBaseProductMapper;
import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.framework.common.service.BaseManager;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmBaseProductManager extends BaseManager<CrmBaseProductMapper, CrmBaseProductDO> {

  public Integer selectIdByCode(String code) {
    return mapper.selectIdByCode(code);
  }

}
