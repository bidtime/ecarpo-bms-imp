/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.usermenu.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.usermenu.dao.ApUserMenuDAO;
import com.ecarpo.bms.ap.server.auth.usermenu.dao.ApUserMenuMapper;
import com.ecarpo.bms.ap.server.auth.usermenu.entity.ApUserMenuDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class ApUserMenuManager
    extends BaseDAOManager<ApUserMenuDAO, ApUserMenuMapper, ApUserMenuDO> {

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
    return dao.deleteByUserId(userId);
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
    Set<Long> set = dao.getSetProductIdsByUserId(userId);
    if (CollectionUtils.isEmpty(set)) {
      return new HashSet<>(0);
    }
    return set;
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
    return dao.getMenuIdsByProductUserId(userId, productId, delFlag);
  }
  
}
