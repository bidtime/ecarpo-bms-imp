/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.service;

import com.ecarpo.bms.erp.server.toeas.dto.SaveErpToEasDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * 
 * @author xinbeibei
 * @since 2019.05.28
 */
public interface ErpToEasService {
  
  
  /**
   * 保存erp TO eas 关联数据(保存的会合并)
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  ResultDTO<Long> save(SaveErpToEasDTO dto)throws Exception;
   
  /**
   * 先从数据库获取,定时发送给eas数据
   * 
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.05.28
   */
  ResultDTO<Integer> sendTOEas()throws Exception;
  
}
