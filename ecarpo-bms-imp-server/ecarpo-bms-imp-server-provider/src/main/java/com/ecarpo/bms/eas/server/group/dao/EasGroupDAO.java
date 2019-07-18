/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.group.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Repository
public class EasGroupDAO extends CRUDDAO<EasGroupMapper, EasGroupDO> {

  /**
   * 关联id 删除
   * 
   * @param linkedId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public Integer deleteByLinkedId(String linkedId) throws Exception {
    return mapper.deleteByLinkedId(linkedId);
  }

}
