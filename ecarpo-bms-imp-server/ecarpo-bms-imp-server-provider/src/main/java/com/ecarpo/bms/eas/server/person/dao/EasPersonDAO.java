/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.person.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.person.entity.EasPersonDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasPersonDAO extends CRUDDAO<EasPersonMapper, EasPersonDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public EasPersonDO selectByPK(String id) throws Exception {
    return mapper.selectByPK(id);
  }

  /**
   * userId 获取人员信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public EasPersonDO selectInfoByUserId(Long userId) {
    return mapper.selectInfoByUserId(userId);
  }

}
