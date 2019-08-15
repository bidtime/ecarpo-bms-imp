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
    CrmCustomDO c = customManager.selectByMobile(dto.getMobile());
    if (c == null) {
      c = DAOUtils.cloneBean(CrmCustomDO.class, dto);      
    }
    int n = customManager.insertSelective(c);
    // 判断此人是否为会员
    if (dto.getLevel() != null) {
      Long l = memberStoreManager.existsByCustId(c.getId());
      if (l == null) {
        CrmMemberStoreDO u = DAOUtils.cloneBean(CrmMemberStoreDO.class, dto);
        u.setCustom_id(c.getId());
        n += memberStoreManager.insertSelective(u);
      }
    }
    if (existsByPlateNo(dto.getPlate_no())) {
      
    }
    CrmMemberCarDO memberCar = DAOUtils.cloneBean(CrmMemberCarDO.class, dto);
    memberCar.setCustom_id(c.getId());
    n += super.insertSelective(memberCar);
    return n;
  }
  
  public Long existsByPlateNo(Integer plateNo) {
    return mapper.existsByPlateNo(plateNo);
  }

  
}
