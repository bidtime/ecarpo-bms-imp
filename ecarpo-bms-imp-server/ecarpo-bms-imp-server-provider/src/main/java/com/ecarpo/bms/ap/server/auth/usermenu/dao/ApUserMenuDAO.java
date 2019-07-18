/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.usermenu.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.ap.server.auth.usermenu.entity.ApUserMenuDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Repository
public class ApUserMenuDAO extends CRUDDAO<ApUserMenuMapper, ApUserMenuDO> {

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
  /**
   * 获取用户菜单对应的模块(去重后)
   * 
   * @param userId
   * @return
   * @author mgz
   * @since 2018.05.16
   */
  public Set<Long> getSetProductIdsByUserId(Long userId) throws Exception {
    return mapper.getSetProductIdsByUserId(userId);
  }

  /**
   * 根据用户id和模块id获取菜单(去重后)
   * 
   * @param userId
   * @param productId
   * @return
   * @author mgz
   * @since 2018.12.26
   */
  public Set<Long> getMenuIdsByProductUserId(Long userId, Long productId, Integer delFlag)
      throws Exception {
    return mapper.getMenuIdsByProductUserId(userId, productId, delFlag);
  }
  
}
