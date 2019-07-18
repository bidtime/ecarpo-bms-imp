/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasCheckQO;
import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasQO;
import com.ecarpo.bms.erp.server.toeas.entity.ErpToEasDO;
import com.ecarpo.framework.common.dao.CRUDDAO;
import com.ecarpo.framework.data.domain.PageBO;

/**
 * @author xinbeibei
 * @since 2019.05.28
 */
@Repository
public class ErpToEasDAO extends CRUDDAO<ErpToEasMapper, ErpToEasDO> {

  /**
   * 根据表名+主键+ 类型 获取主单信息
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  public ErpToEasDO selectByTableName(ErpToEasCheckQO qo) throws Exception {
    return mapper.selectByTableName(qo);
  }

  /**
   * 批量获取需要推送的数据信息
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  public PageBO<ErpToEasDO> pageByTable(ErpToEasQO qo) throws Exception {
    return mapper.pageByTable(qo);
  }

  
}
