/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.measureunit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.measureunit.entity.ApMeasureUnitDO;
import com.ecarpo.bms.ap.server.measureunit.service.ApMeasureUnitManager;
import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitInsertDTO;
import com.ecarpo.bms.eas.measureunit.dto.EasMeasureUnitUpdateDTO;
import com.ecarpo.bms.eas.server.measureunit.dao.EasMeasureUnitDAO;
import com.ecarpo.bms.eas.server.measureunit.dao.EasMeasureUnitMapper;
import com.ecarpo.bms.eas.server.measureunit.entity.EasMeasureUnitDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasMeasureUnitManager
    extends BaseDAOManager<EasMeasureUnitDAO, EasMeasureUnitMapper, EasMeasureUnitDO> {
  @Autowired
  private ApMeasureUnitManager apMeasureUnitManager;

  /**
   * EAS 推送行政组织信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number insertByBase(EasMeasureUnitInsertDTO dto) throws Exception {
    String id = dto.getId();
      Integer m = 0;
      EasMeasureUnitDO easMeasureUnitDO = dao.selectByPK(id);
      if (easMeasureUnitDO != null) {
      throw new ManagerException("新增操作,当前EAS主键已存在,请检查后重试");
    }
    //维护 ERP 数据
    ApMeasureUnitDO apMeasureUnitDO = DAOUtils.cloneBean(ApMeasureUnitDO.class, dto);
    apMeasureUnitDO.setMeasureUnitCode(dto.getEncrypt());
    apMeasureUnitDO.setMeasureUnitName(dto.getDefine());
    apMeasureUnitDO.setBaseUnit(dto.getIsBaseUnit());
    apMeasureUnitDO.setState(dto.getIsDisabled());
    Long measureUnitId = apMeasureUnitManager.insertLong(apMeasureUnitDO).longValue();
    //回写eas主键信息
    //主单
    EasMeasureUnitDO d = DAOUtils.cloneBean(EasMeasureUnitDO.class, dto);
    d.setErpMeasureUnitId(measureUnitId);
    m += dao.insert(d);
    return m;
  }

  /**
   * EAS 推送行政组织信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number updateByBase(EasMeasureUnitUpdateDTO dto) throws Exception {
    String id = dto.getId();
    Integer m = 0;
    EasMeasureUnitDO easMeasureUnitDO = dao.selectByPK(id);
    if (easMeasureUnitDO == null) {
      throw new ManagerException("更新操作,当前EAS主键未获取到相关信息,请检查后重试");
    }
    //主单
    m += dao.updateSelective(DAOUtils.cloneBean(EasMeasureUnitDO.class, dto));
    //维护 ERP 数据
    Long measureUnitId = easMeasureUnitDO.getErpMeasureUnitId();
    ApMeasureUnitDO apMeasureUnitDO = DAOUtils.cloneBean(ApMeasureUnitDO.class, dto);
    apMeasureUnitDO.setMeasureUnitId(measureUnitId);
    apMeasureUnitDO.setMeasureUnitCode(dto.getEncrypt());
    apMeasureUnitDO.setMeasureUnitName(dto.getDefine());
    apMeasureUnitDO.setBaseUnit(dto.getIsBaseUnit());
    apMeasureUnitDO.setState(dto.getIsDisabled());
    m += apMeasureUnitManager.updateSelective(apMeasureUnitDO);
    return m;
  }
}
