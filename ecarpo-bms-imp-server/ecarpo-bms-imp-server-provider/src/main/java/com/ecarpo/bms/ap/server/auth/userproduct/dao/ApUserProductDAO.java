/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.userproduct.entity.ApUserProductDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Repository
public class ApUserProductDAO extends CRUDDAO<ApUserProductMapper, ApUserProductDO> {

  /**
   * userId 删除记录
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  public Integer deleteByUserId(Long userId) throws Exception {
    return mapper.deleteByUserId(userId);
  }

}
