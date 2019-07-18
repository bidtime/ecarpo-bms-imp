/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.group.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/06/13
 */
@MapperDesc(value = "eas_group")
public interface EasGroupMapper extends BaseMapper<EasGroupDO> {

  /**
   * 关联id 删除
   * 
   * @param linkedId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  Integer deleteByLinkedId(@Param("linkedId") String linkedId);

}
