/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customer.dao;

import org.springframework.stereotype.Repository;
import com.ecarpo.bms.eas.server.customer.entity.EasCustomerDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasCustomerDAO extends CRUDDAO<EasCustomerMapper, EasCustomerDO> {

  /**
   * 主键id 获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.11
   */
  public EasCustomerDO selectByPK(String id) throws Exception {
    return mapper.selectByPK(id);
  }
}
