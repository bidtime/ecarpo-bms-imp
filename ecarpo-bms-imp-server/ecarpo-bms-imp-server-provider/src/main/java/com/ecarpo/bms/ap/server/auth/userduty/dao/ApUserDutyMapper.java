/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userduty.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.userduty.entity.ApUserDutyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@MapperDesc(value = "用户岗位")
public interface ApUserDutyMapper extends BaseMapper<ApUserDutyDO> {

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
   * Query user's duties.
   *
   * @param userId
   * @return
   * @author mgz
   * @since 2017年7月14日
   */
  List<ApUserDutyDO> selectByUserId(Long userId);

  /**
   * Delete all duties by userId and dutyid.
   *
   * @param userId
   * @return
   * @author mgz
   * @since 2017年7月14日
   */
  int deleteByUserDutyDO(ApUserDutyDO userDutyDO);

}
