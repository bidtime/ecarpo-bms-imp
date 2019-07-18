/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgbaseunit.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.orgbaseunit.entity.EasOrgBaseUnitDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasOrgBaseUnitDAO extends CRUDDAO<EasOrgBaseUnitMapper, EasOrgBaseUnitDO> {

  /**
   * 组织编码获取组织基类信息
   * 
   * @param encrypt
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  public EasOrgBaseUnitDO selectByNumber(String encrypt) {
    return mapper.selectByNumber(encrypt);
  }

  /**
   * id 获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.14
   */
  public EasOrgBaseUnitDO selectById(String id) {
    return mapper.selectById(id);
  }

  /**
   * 组织id 获取EAS对应的组织信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public EasOrgBaseUnitDO selectInfoByOrgId(Long orgId) {
    return mapper.selectInfoByOrgId(orgId);
  }

  /**
   * EAS 岗位id 获取中间表信息
   * 
   * @param id
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  //  public EasOrgBaseUnitDO selectByEasId(String id) throws Exception {
  //    return mapper.selectByEasId(id);
  //  }
}
