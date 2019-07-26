/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.numberqueue.service;

import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.numberqueue.dao.SerialNumberQueueMapper;
import com.ecarpo.bms.eas.server.numberqueue.entity.SerialNumberQueueDO;
import com.ecarpo.framework.common.service.BaseManager;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class SerialNumberQueueManager extends BaseManager<SerialNumberQueueMapper, SerialNumberQueueDO> {

  public Integer selectNumberByParams(Date date, Integer storeId, String flag) {
    return mapper.selectNumberByParams(date, storeId, flag);
  }

  public Integer insertReplaceNumber(Date date, Integer storeId, String flag) {
    return mapper.insertReplaceNumber(date, storeId, flag);
  }
  
//  public Integer getNumberByParams(Integer storeId, String flag) throws Exception {
//    return this.getNumberByParams(new Date(), storeId, flag);
//  }
  
  public Integer getNumberByParams(Date date, Integer storeId, String flag) throws Exception {
    Integer n = insertReplaceNumber(date, storeId, flag);
    if (n > 0) {
      return selectNumberByParams(date, storeId, flag);
    } else {
      throw new ManagerException("获取number失败");
    }
  }
  
  public String getStrByParams(Date date, Integer storeId, String flag) throws Exception {
    Integer no = getNumberByParams(date, storeId, flag);
    //
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
    String dateS = dateFormat.format(date); //可以把日期转换转指定格式的字符串
    //
    DecimalFormat serialFormat = new DecimalFormat("0000");
    String sFmt = serialFormat.format(no);
    //
    String s = dateS + sFmt;
    return s;
  }

}
