/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.group.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.group.dao.EasGroupDAO;
import com.ecarpo.bms.eas.server.group.dao.EasGroupMapper;
import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasGroupManager extends BaseDAOManager<EasGroupDAO, EasGroupMapper, EasGroupDO> {

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
    return dao.deleteByLinkedId(linkedId);
  }

}
