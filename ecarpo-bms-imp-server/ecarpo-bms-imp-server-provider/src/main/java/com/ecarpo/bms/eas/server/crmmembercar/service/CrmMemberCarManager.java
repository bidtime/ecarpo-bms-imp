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

import lombok.extern.slf4j.Slf4j;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
@Slf4j
public class CrmMemberCarManager extends BaseManager<CrmMemberCarMapper, CrmMemberCarDO> {

  @Autowired
  private CrmMemberStoreManager memberStoreManager;

  @Autowired
  private CrmCustomManager customManager;
  
  public int insertSelective(CrmMemberCarExInsertDTO dto) throws Exception {
    int n = 0;
    CrmCustomDO c = customManager.selectByMobile(dto.getMobile());
    if (c == null) {
      c = DAOUtils.cloneBean(CrmCustomDO.class, dto);
      if (dto.getMember_name() != null) {
        Integer memberTypeId = memberStoreManager.selectMemberIdByMemberName(dto.getMember_name(),
            dto.getStore_id());
        c.setLevel(memberTypeId);
      }
      n = customManager.insertSelective(c);
    } else {
      log.info("customer({}, {}) is exists. ", c.getName(), c.getId());
    }
    // 判断此人是否为会员
    if (dto.getMember_name() != null) {
      Long l = memberStoreManager.existsByCustId(c.getId());
      if (l == null) {
        CrmMemberStoreDO u = DAOUtils.cloneBean(CrmMemberStoreDO.class, dto);
        //DAOUtils.cloneBean(u, c);
        u.setCstaff(dto.getCreatorId().intValue());
        u.setCustom_id(c.getId());
        n += memberStoreManager.insertSelective(u);
      } else {
        log.info("member({}, {}) is exists. ", c.getName(), c.getId());
      }
    } else {
      log.info("memeber level is null, couldn't add member. ");
    }
    if (this.existsByPlateNo(dto.getPlate_no()) != null) {
      log.info("plate_no({}) is exists, couldn't add car. ", dto.getPlate_no());
    } else {
      CrmMemberCarDO memberCar = DAOUtils.cloneBean(CrmMemberCarDO.class, dto);
      memberCar.setCustom_id(c.getId());
      n += super.insertSelective(memberCar);
    }
    return n;
  }
  
  public Long existsByPlateNo(String plateNo) {
    return mapper.existsByPlateNo(plateNo);
  }

  
}
