/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmmembercar.dao.CrmMemberCarMapper;
import com.ecarpo.bms.eas.server.crmmembercar.dto.CrmMemberCarInsertDTO;
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
  
  public int insertSelective(CrmMemberCarInsertDTO dto) throws Exception {
    CrmMemberStoreDO u = DAOUtils.cloneBean(CrmMemberStoreDO.class, dto);
    int n = memberStoreManager.insertSelective(u);
    if (n > 0) {
      CrmMemberCarDO m = DAOUtils.cloneBean(CrmMemberCarDO.class, dto);
      m.setCustomId(u.getId());
      n += super.insertSelective(m);
    }
    return n;
  }
  
}
