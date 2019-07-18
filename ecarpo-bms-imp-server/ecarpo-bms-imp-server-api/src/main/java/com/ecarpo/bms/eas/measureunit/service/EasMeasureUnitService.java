package com.ecarpo.bms.eas.measureunit.service;

import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitInsertDTO;
import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitUpdateDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
public interface EasMeasureUnitService {

  /**
   * 新增计量单位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<Number> insertLong(EasMeasureUnitInsertDTO dto) throws Exception;

  /**
   * 更新计量单位
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/28
   */
  ResultDTO<?> update(EasMeasureUnitUpdateDTO dto) throws Exception;
}

