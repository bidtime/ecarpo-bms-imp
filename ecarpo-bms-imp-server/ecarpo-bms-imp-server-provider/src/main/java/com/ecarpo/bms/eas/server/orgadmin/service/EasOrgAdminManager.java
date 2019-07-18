/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgadmin.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminInsertDTO;
import com.ecarpo.bms.eas.orgadmin.dto.EasOrgAdminUpdateDTO;
import com.ecarpo.bms.eas.server.orgadmin.dao.EasOrgAdminDAO;
import com.ecarpo.bms.eas.server.orgadmin.dao.EasOrgAdminMapper;
import com.ecarpo.bms.eas.server.orgadmin.entity.EasOrgAdminDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasOrgAdminManager
    extends BaseDAOManager<EasOrgAdminDAO, EasOrgAdminMapper, EasOrgAdminDO> {


  //  @Autowired
  //  private EasOrgBaseUnitManager easOrgBaseUnitManager;
  
  /**
   * EAS 推送行政组织信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number insertByBase(EasOrgAdminInsertDTO dto) throws Exception {

    EasOrgAdminDO easOrgAdminDO = dao.selectById(dto.getId());
    if (easOrgAdminDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }
    //    EasOrgBaseUnitDO easOrgBaseUnitDO = easOrgBaseUnitManager.selectById(dto.getId());
    //    if (easOrgBaseUnitDO == null) {
    //      throw new ManagerException("新增操作,当前组织的组织单元基类数据不存在");
    //    }
    
    int n = dao.insert(dto);
    return n;
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
  public Number updateByBase(EasOrgAdminUpdateDTO dto) throws Exception {
    EasOrgAdminDO easOrgAdminDO = dao.selectById(dto.getId());
    if (easOrgAdminDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }
    EasOrgAdminDO d = DAOUtils.cloneBean(EasOrgAdminDO.class, dto);
    int n = dao.updateSelective(d);
    return n;
  }

  /**
   * 组织编码获取行政组织信息
   * 
   * @param encrypt
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
//  public EasOrgAdminDO selectByNumber(String encrypt) throws Exception {
//    return dao.selectByNumber(encrypt);
//  }
}
