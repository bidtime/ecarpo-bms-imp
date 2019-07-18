/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.company.dao;

import org.apache.ibatis.annotations.Param;

import com.ecarpo.bms.bs.server.company.entity.BsCompanyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

/**
 * @author xinbeibei
 * @since 2019.06.06
 */
@MapperDesc(value = "往来单位")
public interface BsCompanyMapper extends BaseMapper<BsCompanyDO> {

  /**
   * 供应商编码 获取ERP相关信息
   * 
   * @param supplierNumber
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  BsCompanyDO selectByEasNumber(@Param("companyCode")String supplierNumber);
  
}
