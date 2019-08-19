/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmmemberstore.dao.CrmMemberStoreMapper;
import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.framework.common.service.BaseManager;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
@Slf4j
public class CrmMemberStoreManager extends BaseManager<CrmMemberStoreMapper, CrmMemberStoreDO> {

  public Long existsByCustId(Integer custId) {
    return mapper.existsByCustId(custId);
  }
  
  public Integer selectMemberIdByMemberName(String member_name, Integer store_id) {
    Integer memberId = mapper.selectMemberIdByMemberName(member_name, store_id);
    log.debug(": member_name-{}, store_id-{}, memberId-{}", member_name,
        store_id, memberId);
    return memberId;
  }
  
}
