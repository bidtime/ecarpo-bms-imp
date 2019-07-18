/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customerorg.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.customerorg.entity.EasCustomerOrgDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/05
 */
@MapperDesc(value = "eas_customer_org")
public interface EasCustomerOrgMapper extends BaseMapper<EasCustomerOrgDO> {

  /**
   * 关联主键id 删除
   * 
   * @param userId
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.11
   */
  Integer deleteByUserId(@Param("userId") String userId);

}
