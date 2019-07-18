/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutymenu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.dutymenu.entity.ApDutyMenuDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@MapperDesc(value = "岗位菜单")
public interface ApDutyMenuMapper extends BaseMapper<ApDutyMenuDO> {

  /**
   * 按岗位id获取模块id
   * 
   * @param dutyId
   * @return
   * @author shimingkang
   * @since 2017年9月27日
   */
  public List<Long> selectListByDutyId(@Param("dutyId") Long dutyId);

  /**
   * 按岗位id获取模块菜单id
   * 
   * @param dutyId
   * @return
   * @author shimingkang
   * @since 2017年9月27日
   */
  public List<ApDutyMenuDO> listProductMenuIdByDutyId(Long dutyId);
  
}
