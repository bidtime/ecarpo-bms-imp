package com.ecarpo.bms.eas.orgadmin.service;

import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminInsertDTO;
import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasOrgAdminService {

  /**
   * 新增职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insert(EasOrgAdminInsertDTO dto) throws Exception;

  /**
   * 更新职位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasOrgAdminUpdateDTO dto) throws Exception;
}

