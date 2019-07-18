/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.position.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.position.entity.EasPositionDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/05/31
 */
@MapperDesc(value = "eas_position")
public interface EasPositionMapper extends BaseMapper<EasPositionDO> {

  /**
   * EAS 岗位id 获取中间表信息
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.04
   */
  EasPositionDO selectByEasId(@Param("id") String id);

  /**
   * 职位编码获取职务信息
   * 
   * @param number
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  EasPositionDO selectByNumber(@Param("encrypt") String encrypt);

}
