/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.person.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.eas.server.person.entity.EasPersonDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * Created by Mybatis Generator on 2019/05/31
 */
@MapperDesc(value = "eas_person")
public interface EasPersonMapper extends BaseMapper<EasPersonDO> {

  /**
   * 主键获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  EasPersonDO selectByPK(@Param("id") String id);

  /**
   * userId 获取人员信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  EasPersonDO selectInfoByUserId(@Param("erpUserId") Long erpUserId);

}
