/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.duty.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.ap.server.auth.duty.entity.ApDutyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@MapperDesc(value = "岗位")
public interface ApDutyMapper extends BaseMapper<ApDutyDO> {

  /**
   * 岗位编码获取岗位信息
   * 
   * @param dutyCode
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.15
   */
  ApDutyDO selectByEasNumber(@Param("dutyCode") String dutyCode);

}
