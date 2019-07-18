/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.measureunit.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.measureunit.entity.EasMeasureUnitDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/27
 */
@MapperDesc(value = "eas_measure_unit")
public interface EasMeasureUnitMapper extends BaseMapper<EasMeasureUnitDO> {
  /**
   * 主键获取DO
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/18
   */
  EasMeasureUnitDO selectByPK(@Param("id") String id);
}