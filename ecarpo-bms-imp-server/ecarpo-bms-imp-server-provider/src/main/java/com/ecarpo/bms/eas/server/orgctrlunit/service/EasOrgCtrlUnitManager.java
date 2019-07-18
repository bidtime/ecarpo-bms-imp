/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.orgctrlunit.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.orgctrlunit.dto.EasOrgCtrlUnitSaveDTO;
import com.ecarpo.bms.eas.server.orgctrlunit.dao.EasOrgCtrlUnitDAO;
import com.ecarpo.bms.eas.server.orgctrlunit.dao.EasOrgCtrlUnitMapper;
import com.ecarpo.bms.eas.server.orgctrlunit.entity.EasOrgCtrlUnitDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019/6/14
 */
@Service
public class EasOrgCtrlUnitManager
    extends BaseDAOManager<EasOrgCtrlUnitDAO, EasOrgCtrlUnitMapper, EasOrgCtrlUnitDO> {

 /**
  *保存管理单元
  *
  * @param
  * @return
  * @throws Exception
  * @author lhf
  * @since 2019/6/14
  */
  public Integer save(EasOrgCtrlUnitSaveDTO dto) throws Exception {
    if (dto == null) {
      throw new ManagerException("请求参数为空,请检查后重试");
    }

    if (StringUtils.isBlank(dto.getId())) {
      throw new ManagerException("保存数据主键id不能为空,请检查后重试");
    }
    Integer insertOrUpdateFlag = dto.getInsertOrUpdateFlag();

    if (1 == insertOrUpdateFlag) {
      //更新
      return this.updateByBase(dto);
    } else {
      //新增 
      return this.insertByBase(dto);
    }
  }

  /**
   *新增管理单元
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/14
   */
  private Integer insertByBase(EasOrgCtrlUnitSaveDTO dto) throws Exception {

    EasOrgCtrlUnitDO easOrgCtrlUnitDO = dao.selectById(dto.getId());
    if (easOrgCtrlUnitDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }
    EasOrgCtrlUnitDO cloneBean = DAOUtils.cloneBean(EasOrgCtrlUnitDO.class, dto);
    return dao.insert(cloneBean);
  }

  /**
   *编辑管理单元
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/14
   */
  private Integer updateByBase(EasOrgCtrlUnitSaveDTO dto) throws Exception {
    EasOrgCtrlUnitDO easOrgCtrlUnitDO = dao.selectById(dto.getId());
    if (easOrgCtrlUnitDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }
    return dao.updateSelective(DAOUtils.cloneBean(easOrgCtrlUnitDO, dto));
  }

}
