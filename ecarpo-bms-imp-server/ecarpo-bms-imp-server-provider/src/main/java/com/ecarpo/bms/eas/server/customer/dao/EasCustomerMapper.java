/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customer.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.customer.entity.EasCustomerDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/03
 */
@MapperDesc(value = "eas_customer")
public interface EasCustomerMapper extends BaseMapper<EasCustomerDO> {

  /**
   * 主键id 获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.11
   */
  EasCustomerDO selectByPK(@Param("id") String id);

}
