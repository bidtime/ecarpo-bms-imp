/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customerorg.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.customerorg.dao.EasCustomerOrgDAO;
import com.ecarpo.bms.eas.server.customerorg.dao.EasCustomerOrgMapper;
import com.ecarpo.bms.eas.server.customerorg.entity.EasCustomerOrgDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasCustomerOrgManager
    extends BaseDAOManager<EasCustomerOrgDAO, EasCustomerOrgMapper, EasCustomerOrgDO> {

  /**
   * 关联主键id 删除
   * 
   * @param userId
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.11
   */
  public Integer deleteByUserId(String userId) throws Exception {
    return dao.deleteByUserId(userId);
  }

}
