package com.ecarpo.bms.eas.customer.service;

import com.ecarpo.bms.eas.customer.dto.EasCustomerInsertDTO;
import com.ecarpo.bms.eas.customer.dto.EasCustomerUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasCustomerService {

  /**
   * 新增用户
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insertLong(EasCustomerInsertDTO dto) throws Exception;

  /**
   * 更新用户
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasCustomerUpdateDTO dto) throws Exception;
}

