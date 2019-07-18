package com.ecarpo.bms.eas.material.service;

import com.ecarpo.bms.eas.material.dto.EasMaterialInsertDTO;
import com.ecarpo.bms.eas.material.dto.EasMaterialUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasMaterialService {

  /**
   * 新增物料
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insert(EasMaterialInsertDTO dto) throws Exception;

  /**
   * 更新物料
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasMaterialUpdateDTO dto) throws Exception;
}

