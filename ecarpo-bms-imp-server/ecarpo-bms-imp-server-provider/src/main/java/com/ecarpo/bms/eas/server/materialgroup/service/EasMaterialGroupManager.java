/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.materialgroup.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.materialgroup.dto.EasMaterialGroupSaveDTO;
import com.ecarpo.bms.eas.server.materialgroup.dao.EasMaterialGroupDAO;
import com.ecarpo.bms.eas.server.materialgroup.dao.EasMaterialGroupMapper;
import com.ecarpo.bms.eas.server.materialgroup.entity.EasMaterialGroupDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019/6/14
 */
@Service
public class EasMaterialGroupManager
    extends BaseDAOManager<EasMaterialGroupDAO, EasMaterialGroupMapper, EasMaterialGroupDO> {

/**
 * 保存物料分类
 *
 * @param
 * @return
 * @throws Exception
 * @author lhf
 * @since 2019/6/14
 */
  public Integer save(EasMaterialGroupSaveDTO dto) throws Exception {
    if (dto == null) {
      throw new ManagerException("请求参数为空,请检查后重试");
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
   * 新增物料分类
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/14
   */
  private Integer insertByBase(EasMaterialGroupSaveDTO dto) throws Exception {

    EasMaterialGroupDO easMaterialGroupDO = dao.selectById(dto.getId());
    if (easMaterialGroupDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }
    EasMaterialGroupDO cloneBean = DAOUtils.cloneBean(EasMaterialGroupDO.class, dto);
    return dao.insert(cloneBean);
  }

  /**
   *编辑物料分类
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/14
   */
  private Integer updateByBase(EasMaterialGroupSaveDTO dto) throws Exception {
    EasMaterialGroupDO easMaterialGroupDO = dao.selectById(dto.getId());
    if (easMaterialGroupDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }
    return dao.updateSelective(DAOUtils.cloneBean(easMaterialGroupDO, dto));
  }

}
