/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.orgrange.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.orgrange.dao.EasOrgRangeDAO;
import com.ecarpo.bms.eas.server.orgrange.dao.EasOrgRangeMapper;
import com.ecarpo.bms.eas.server.orgrange.entity.EasOrgRangeDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasOrgRangeManager
    extends BaseDAOManager<EasOrgRangeDAO, EasOrgRangeMapper, EasOrgRangeDO> {

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
