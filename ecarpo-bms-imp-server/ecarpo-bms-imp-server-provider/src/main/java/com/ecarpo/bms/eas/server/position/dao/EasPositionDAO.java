/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.position.dao;

import org.springframework.stereotype.Repository;
import com.ecarpo.bms.eas.server.position.entity.EasPositionDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasPositionDAO extends CRUDDAO<EasPositionMapper, EasPositionDO> {

  /**
   * EAS 岗位id 获取中间表信息
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.04
   */
  public EasPositionDO selectByEasId(String id) throws Exception {
    return mapper.selectByEasId(id);
  }

  /**
   * 职位编码获取职务信息
   * 
   * @param number
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  public EasPositionDO selectByNumber(String number) throws Exception {
    return mapper.selectByNumber(number);
  }

}
