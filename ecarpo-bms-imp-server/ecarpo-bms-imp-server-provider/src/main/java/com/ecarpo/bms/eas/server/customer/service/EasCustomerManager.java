/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customer.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.customer.dao.EasCustomerDAO;
import com.ecarpo.bms.eas.server.customer.dao.EasCustomerMapper;
import com.ecarpo.bms.eas.server.customer.entity.EasCustomerDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasCustomerManager
    extends BaseDAOManager<EasCustomerDAO, EasCustomerMapper, EasCustomerDO> {

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
    return dao.selectByPK(id);
  }

}
