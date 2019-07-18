/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customerorg.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.customerorg.entity.EasCustomerOrgDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasCustomerOrgDAO extends CRUDDAO<EasCustomerOrgMapper, EasCustomerOrgDO> {

  /**
   * 关联主键id 删除
   * 
   * @param userId
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.11
   */
  public Integer deleteByUserId(String userId) throws Exception {
    return mapper.deleteByUserId(userId);
  }
}
