/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.personpositon.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.personpositon.entity.EasPersonPositonDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
* Created by Mybatis Generator on 2019/06/03
*/
@MapperDesc(value = "eas_person_positon")
public interface EasPersonPositonMapper extends BaseMapper<EasPersonPositonDO> {
  /**
   * 删除中间表信息
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/7/11
   */
  Long deleteByPersonId(@Param("personId") String personId);
}