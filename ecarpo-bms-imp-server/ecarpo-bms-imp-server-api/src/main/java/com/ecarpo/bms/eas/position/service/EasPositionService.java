package com.ecarpo.bms.eas.position.service;

import com.ecarpo.bms.eas.position.dto.EasPositionInsertDTO;
import com.ecarpo.bms.eas.position.dto.EasPositionUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasPositionService {

  /**
   * 新增职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insertLong(EasPositionInsertDTO dto) throws Exception;

  /**
   * 更新职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasPositionUpdateDTO dto) throws Exception;
}

