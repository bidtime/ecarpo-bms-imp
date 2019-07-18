/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.suppliertype.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.supplier.suppliertype.dao.EasSupplierTypeDAO;
import com.ecarpo.bms.eas.server.supplier.suppliertype.dao.EasSupplierTypeMapper;
import com.ecarpo.bms.eas.server.supplier.suppliertype.entity.EasSupplierTypeDO;
import com.ecarpo.bms.eas.supplier.suppliertype.dto.SaveSupplierTypeDTO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierTypeManager
    extends BaseDAOManager<EasSupplierTypeDAO, EasSupplierTypeMapper, EasSupplierTypeDO> {

  /**
   * 保存EAS 推送供应商分类信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public Integer save(SaveSupplierTypeDTO dto) throws Exception {

    Integer insertOrUpdateFlag = dto.getInsertOrUpdateFlag();
    Integer m = 0;
    if (1 == insertOrUpdateFlag) {
      //更新
      m += this.updateByBase(dto);
    } else {
      //新增
      m += this.insertByBase(dto);
    }
    return m;
  }

  /**
   * EAS推送供应商分类 -- 新建
   * 
   * @param dto
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  private Integer insertByBase(SaveSupplierTypeDTO dto) throws Exception {
    String id = dto.getId();
    if (StringUtils.isBlank(id)) {
      throw new ManagerException("新增供应商分类操作,EAS主键不能为空,请检查后重试");
    }
    
    EasSupplierTypeDO easSupplierTypeDO = dao.selectByPK(id);
    if (easSupplierTypeDO!=null) {
      throw new ManagerException("新增供应商分类操作,当前EAS主键已存在,请检查后重试");
    }
    
    return dao.insert(dto);
  }

  /**
   * EAS推送供应商分类 -- 更新
   * 
   * @param dto
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  private Integer updateByBase(SaveSupplierTypeDTO dto) throws Exception {
    dto.setCreateTime(null);
    dto.setCreatorId(null);
    dto.setCreatoridName(null);
    String id = dto.getId();
    if (StringUtils.isBlank(id)) {
      throw new ManagerException("更新供应商分类操作,EAS主键不能为空,请检查后重试");
    }

    EasSupplierTypeDO easSupplierTypeDO = dao.selectByPK(id);
    if (easSupplierTypeDO==null) {
      throw new ManagerException("更新供应商分类操作,当前EAS主键未获取到相关信息,请检查后重试");
    }
    
    
    return dao.updateSelective(DAOUtils.cloneBean(EasSupplierTypeDO.class, dto));
  }

}
