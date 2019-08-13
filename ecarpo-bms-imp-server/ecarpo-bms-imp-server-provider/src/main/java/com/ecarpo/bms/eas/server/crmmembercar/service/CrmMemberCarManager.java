/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmcustom.entity.CrmCustomDO;
import com.ecarpo.bms.eas.server.crmcustom.service.CrmCustomManager;
import com.ecarpo.bms.eas.server.crmmembercar.dao.CrmMemberCarMapper;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarExInsertDTO;
import com.ecarpo.bms.eas.server.crmmembercar.entity.CrmMemberCarDO;
import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.bms.eas.server.crmmemberstore.service.CrmMemberStoreManager;
import com.ecarpo.framework.common.service.BaseManager;
import com.ecarpo.framework.common.utils.DAOUtils;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmMemberCarManager extends BaseManager<CrmMemberCarMapper, CrmMemberCarDO> {

  @Autowired
  private CrmMemberStoreManager memberStoreManager;

  @Autowired
  private CrmCustomManager customManager;
  
  public int insertSelective(CrmMemberCarExInsertDTO dto) throws Exception {
    CrmCustomDO c = DAOUtils.cloneBean(CrmCustomDO.class, dto);
    int n = customManager.insertSelective(c);
    // TODO 判断此人是否为会员
    //if (u.get) {
      CrmMemberStoreDO u = DAOUtils.cloneBean(CrmMemberStoreDO.class, dto);
      u.setCustom_id(c.getId());
    //}
    n += memberStoreManager.insertSelective(u);
    CrmMemberCarDO m = DAOUtils.cloneBean(CrmMemberCarDO.class, dto);
    m.setCustom_id(u.getId());
    n += super.insertSelective(m);
    return n;
  }
  
}
