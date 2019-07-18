/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgsale.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.org.orgsale.dto.SaveOrgSaleDTO;
import com.ecarpo.bms.eas.server.org.orgsale.dao.EasOrgSaleDAO;
import com.ecarpo.bms.eas.server.org.orgsale.dao.EasOrgSaleMapper;
import com.ecarpo.bms.eas.server.org.orgsale.entity.EasOrgSaleDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgSaleManager
    extends BaseDAOManager<EasOrgSaleDAO, EasOrgSaleMapper, EasOrgSaleDO> {

  //  @Autowired
  //  private EasOrgBaseUnitManager easOrgBaseUnitManager;

  /**
   * 保存销售组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public Integer save(SaveOrgSaleDTO dto) throws Exception {
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
   * 新建
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  private Integer insertByBase(SaveOrgSaleDTO dto) throws Exception {

    EasOrgSaleDO easOrgSaleDO = dao.selectById(dto.getId());
    if (easOrgSaleDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }

    //    EasOrgBaseUnitDO easOrgBaseUnitDO = easOrgBaseUnitManager.selectById(dto.getId());
    //    if (easOrgBaseUnitDO == null) {
    //      throw new ManagerException("新增操作,当前组织的组织单元基类数据不存在");
    //    }

    EasOrgSaleDO cloneBean = DAOUtils.cloneBean(EasOrgSaleDO.class, dto);
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
  private Integer updateByBase(SaveOrgSaleDTO dto) throws Exception {

    EasOrgSaleDO easOrgSaleDO = dao.selectById(dto.getId());
    if (easOrgSaleDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }

    return dao.updateSelective(DAOUtils.cloneBean(easOrgSaleDO, dto));
  }

}
