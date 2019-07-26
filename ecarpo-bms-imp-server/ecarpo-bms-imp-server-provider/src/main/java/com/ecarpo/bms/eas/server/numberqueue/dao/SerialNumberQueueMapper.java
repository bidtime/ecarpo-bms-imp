/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.numberqueue.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.numberqueue.entity.SerialNumberQueueDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.annotation.TryExcept;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "库区库位")
public interface SerialNumberQueueMapper extends BaseMapper<SerialNumberQueueDO> {
  
  @TryExcept(cmd = "get")
  Integer selectNumberByParams(@Param("date")Date date,
      @Param("storeId")Integer storeId, @Param("flag") String flag);
  
  Integer insertReplaceNumber(@Param("date")Date date,
      @Param("storeId")Integer storeId, @Param("flag") String flag);
  
}