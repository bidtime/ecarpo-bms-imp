/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.dmsbuy.dao.DmsBuyMapper;
import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuy.entity.DmsBuyDO;
import com.ecarpo.bms.eas.server.numberqueue.service.SerialNumberQueueManager;
import com.ecarpo.framework.common.service.BaseManager;
import com.ecarpo.framework.common.utils.DAOUtils2;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class DmsBuyManager extends BaseManager<DmsBuyMapper, DmsBuyDO> {
  
  @Autowired
  private SerialNumberQueueManager serialNumberQueueManager;
  
  public String insertSelective(DmsBuyInsertDTO dto) throws Exception {
    DmsBuyDO u = DAOUtils2.cloneBean(DmsBuyDO.class, dto);
    Date dateSql = new java.sql.Date(new java.util.Date().getTime());
    String buyNo = serialNumberQueueManager.getStrByParams(dateSql, dto.getStore_id(), "rk");
    u.setBuy_number(buyNo);
    if (super.insertSelective(u)>0) {
      return buyNo;
    } else {
      return null;
    }
  }

}
