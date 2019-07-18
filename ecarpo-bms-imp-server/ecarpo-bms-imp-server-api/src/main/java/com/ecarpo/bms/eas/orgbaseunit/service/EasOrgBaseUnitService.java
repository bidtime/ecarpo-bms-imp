package com.ecarpo.bms.eas.orgbaseunit.service;

import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitInsertDTO;
import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasOrgBaseUnitService {

  /**
   * 新增职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insert(EasOrgBaseUnitInsertDTO dto) throws Exception;

  /**
   * 更新职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasOrgBaseUnitUpdateDTO dto) throws Exception;

  /**
   * 组织id 获取EAS对应的组织编码
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  ResultDTO<String> selectByOrgId(Long orgId) throws Exception;
}

