/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmbaseproduct.service.CrmBaseProductManager;
import com.ecarpo.bms.eas.server.dmsbuydetail.dao.DmsBuyDetailMapper;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.entity.DmsBuyDetailDO;
import com.ecarpo.bms.eas.server.storeroomshelflocation.service.DmsStoreroomShelflocationManager;
import com.ecarpo.framework.common.service.BaseManager;
import com.ecarpo.framework.common.utils.DAOUtils;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsBuyDetailManager extends BaseManager<DmsBuyDetailMapper, DmsBuyDetailDO> {
  
  @Autowired
  private CrmBaseProductManager crmBaseProductManager;
  
  @Autowired
  private DmsStoreroomShelflocationManager dmsStoreroomShelflocationManager;

  public int insertSelective(DmsBuyDetailInsertDTO dto) throws Exception {
    DmsBuyDetailDO u = DAOUtils.cloneBean(DmsBuyDetailDO.class, dto);
    u.setProduct_id(crmBaseProductManager.selectIdByCode(dto.getProduct_code(),
        dto.getStore_id()));
    u.setLocation_id(dmsStoreroomShelflocationManager.selectIdByCode(dto.getLocation_code(),
        dto.getStore_id()));    
    return super.insertSelective(u);
  }
  
}
