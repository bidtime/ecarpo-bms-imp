/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.material.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.material.entity.EasMaterialDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/18
 */
@MapperDesc(value = "eas_material")
public interface EasMaterialMapper extends BaseMapper<EasMaterialDO> {

  /**
   * 主键获取DO
   *
   * @param 
   * @return 
   * @throws Exception
   * @author lhf
   * @since 2019/6/18
   */
  EasMaterialDO selectByPK(@Param("id") String id);
}