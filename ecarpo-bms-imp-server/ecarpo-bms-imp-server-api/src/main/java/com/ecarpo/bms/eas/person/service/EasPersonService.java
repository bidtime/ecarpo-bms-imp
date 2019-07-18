package com.ecarpo.bms.eas.person.service;

import com.ecarpo.bms.eas.person.bo.EasPersonInfoBO;
import com.ecarpo.bms.eas.person.dto.EasPersonInfoQO;
import com.ecarpo.bms.eas.person.dto.EasPersonInsertDTO;
import com.ecarpo.bms.eas.person.dto.EasPersonUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasPersonService {

  /**
   * 新增人员
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insertLong(EasPersonInsertDTO dto) throws Exception;

  /**
   * 更新人员
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasPersonUpdateDTO dto) throws Exception;

  /**
   * userId 获取人员编码
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  ResultDTO<String> selectByUserId(Long userId) throws Exception;
  
  /**
   * 获取user对应的EAS 编码 + org编码
   * 
   * @param qo
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.09
   */
  ResultDTO<EasPersonInfoBO> selectByUserInfo(EasPersonInfoQO qo) throws Exception;
  
}

