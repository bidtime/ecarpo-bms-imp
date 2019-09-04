/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.service;

import org.apache.commons.lang3.StringUtils;
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
    CrmCustomDO c = customManager.selectByMobile(dto.getMobile(), dto.getStore_id());
    if (c == null) {
      log.info("customer(mobile-{}, storeId-{}) none exists, must be add cust. ", dto.getMobile(), dto.getStore_id());
      c = DAOUtils.cloneBean(CrmCustomDO.class, dto);
      if (StringUtils.isNoneBlank(dto.getMember_name())) {
        log.info("memeber(level-{}) none blank, do memberTypeId. ", dto.getMember_name());
        Integer memberTypeId = memberStoreManager.selectMemberIdByMemberName(dto.getMember_name(),
            dto.getStore_id());
        c.setLevel(memberTypeId);
        c.setCustom_type(2);
      } else {
        log.info("memeber(level-{}) is blank, none do memberTypeId. ", dto.getMember_name());
        c.setCustom_type(1);
      }
      n = customManager.insertSelective(c);
    } else {
      log.info("customer(mobile-{}, storeId-{}, custName-{}, custId-{}) is exists. ", 
          dto.getMobile(), dto.getStore_id(), c.getName(), c.getId());
    }
    // 判断此人是否为会员
    if (!StringUtils.isEmpty(dto.getMember_name())) {
      log.info("memeber(level-{}) none blank, must be process member. ", dto.getMember_name());
      Long l = memberStoreManager.existsByCustId(c.getId());
      if (l == null) {
        log.info("member(custName-{}, custId-{}) none exists, must be add it. ", c.getName(), c.getId());
        CrmMemberStoreDO u = DAOUtils.cloneBean(CrmMemberStoreDO.class, dto);
        //DAOUtils.cloneBean(u, c);
        u.setCstaff(dto.getCreatorId().intValue());
        u.setCustom_id(c.getId());
        n += memberStoreManager.insertSelective(u);
      } else {
        log.info("member(custName-{}, custId-{}) exists, could not be add cust to member. ", c.getName(), c.getId());
      }
    } else {
      log.info("memeber (level-{}) is blank, skip it(could not be add member). ", dto.getMember_name());
    }
    //
    Long l = this.existsByPlateNo(dto.getPlate_no(), dto.getStore_id());
    if (l == null) {
      log.info("memberCar(plate_no-{}, storeId-{}) none exists, must be add car. ", dto.getPlate_no(), dto.getStore_id());
      CrmMemberCarDO memberCar = DAOUtils.cloneBean(CrmMemberCarDO.class, dto);
      memberCar.setCustom_id(c.getId());
      n += super.insertSelective(memberCar);
    } else {
      log.info("memberCar(plate_no-{}, storeId-{}) exists, could not be add car. ", dto.getPlate_no(), dto.getStore_id());
    }
    return n;
  }
  
  public Long existsByPlateNo(String plateNo, Integer store_id) {
    return mapper.existsByPlateNo(plateNo, store_id);
  }

}
