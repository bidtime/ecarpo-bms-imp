/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgspecial.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.org.orgspecial.dto.SaveOrgSpecialDTO;
import com.ecarpo.bms.eas.server.org.orgspecial.dao.EasOrgSpecialDAO;
import com.ecarpo.bms.eas.server.org.orgspecial.dao.EasOrgSpecialMapper;
import com.ecarpo.bms.eas.server.org.orgspecial.entity.EasOrgSpecialDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgSpecialManager
    extends BaseDAOManager<EasOrgSpecialDAO, EasOrgSpecialMapper, EasOrgSpecialDO> {

  //  @Autowired
  //  private EasOrgBaseUnitManager easOrgBaseUnitManager;

  /**
   * 保存 库存组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public Integer save(SaveOrgSpecialDTO dto) throws Exception {

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
   * 新增
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  private Integer insertByBase(SaveOrgSpecialDTO dto) throws Exception {

    EasOrgSpecialDO easOrgSpecialDO = dao.selectById(dto.getId());
    if (easOrgSpecialDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }

    //    EasOrgBaseUnitDO easOrgBaseUnitDO = easOrgBaseUnitManager.selectById(dto.getId());
    //    if (easOrgBaseUnitDO == null) {
    //      throw new ManagerException("新增操作,当前组织的组织单元基类数据不存在");
    //    }

    EasOrgSpecialDO cloneBean = DAOUtils.cloneBean(EasOrgSpecialDO.class, dto);
    return dao.insert(cloneBean);
  }

  /**
   * 更新
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  private Integer updateByBase(SaveOrgSpecialDTO dto) throws Exception {
    EasOrgSpecialDO easOrgSpecialDO = dao.selectById(dto.getId());
    if (easOrgSpecialDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }
    return dao.updateSelective(DAOUtils.cloneBean(easOrgSpecialDO, dto));
  }

}
