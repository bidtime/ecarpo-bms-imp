/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.org.orgpurchase.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.org.orgpurchase.entity.EasOrgPurchaseDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/14
 */
@MapperDesc(value = "eas_org_purchase")
public interface EasOrgPurchaseMapper extends BaseMapper<EasOrgPurchaseDO> {

  /**
   * id获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  EasOrgPurchaseDO selectById(@Param("id") String id);

}
