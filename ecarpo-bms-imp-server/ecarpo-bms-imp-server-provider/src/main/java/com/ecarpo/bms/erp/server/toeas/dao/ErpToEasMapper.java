/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.dao;

import org.springframework.context.annotation.Description;

import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasCheckQO;
import com.ecarpo.bms.erp.server.toeas.dto.ErpToEasQO;
import com.ecarpo.bms.erp.server.toeas.entity.ErpToEasDO;
import com.ecarpo.framework.common.mapper.BaseMapper;
import com.ecarpo.framework.data.domain.PageBO;

@Description("erp_to_eas")
public interface ErpToEasMapper extends BaseMapper<ErpToEasDO> {

  /**
   * 根据表名+主键+ 类型 获取主单信息
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  ErpToEasDO selectByTableName(ErpToEasCheckQO qo);

  /**
   * 批量获取需要推送的数据信息
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  PageBO<ErpToEasDO> pageByTable(ErpToEasQO qo);

}
