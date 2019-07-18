/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.usermenu.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.usermenu.entity.ApUserMenuDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@MapperDesc(value = "用户菜单")
public interface ApUserMenuMapper extends BaseMapper<ApUserMenuDO> {

  /**
   * userId 删除记录
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  Integer deleteByUserId(@Param("userId") Long userId);
  
  /**
   * 获取用户菜单对应的模块(去重后)
   * 
   * @param userId
   * @return
   * @author mgz
   * @since 2018.05.16
   */
  Set<Long> getSetProductIdsByUserId(Long userId);
  
  /**
   * 根据用户id和模块id获取菜单(去重后)
   * 
   * @param userId
   * @param productId
   * @return
   * @author mgz
   * @since 2018.12.26
   */
  Set<Long> getMenuIdsByProductUserId(@Param("userId") Long userId,
      @Param("productId") Long productId, @Param("delFlag") Integer delFlag);
  
}
