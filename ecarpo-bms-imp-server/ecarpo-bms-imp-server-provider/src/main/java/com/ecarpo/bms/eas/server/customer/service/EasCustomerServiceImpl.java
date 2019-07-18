/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customer.service;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.customer.dto.EasCustomerInsertDTO;
import com.ecarpo.bms.eas.customer.dto.EasCustomerUpdateDTO;
import com.ecarpo.bms.eas.customer.service.EasCustomerService;
import com.ecarpo.bms.eas.customerorg.EasOrgRangeDTO;
import com.ecarpo.bms.eas.customerorg.EasSubOrgRangeDTO;
import com.ecarpo.bms.eas.server.customer.dao.EasCustomerDAO;
import com.ecarpo.bms.eas.server.customer.dao.EasCustomerMapper;
import com.ecarpo.bms.eas.server.customer.entity.EasCustomerDO;
import com.ecarpo.bms.eas.server.customerorg.entity.EasCustomerOrgDO;
import com.ecarpo.bms.eas.server.customerorg.service.EasCustomerOrgManager;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ServiceException;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasCustomerServiceImpl
    extends BaseServiceImpl<EasCustomerManager, EasCustomerDAO, EasCustomerMapper, EasCustomerDO>
    implements EasCustomerService {

  @Autowired
  private EasCustomerOrgManager easCustomerOrgManager;

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insertLong(EasCustomerInsertDTO dto) throws Exception {
    EasCustomerDO EasCustomerDO = manager.selectByPK(dto.getId());
    if (EasCustomerDO != null) {
      throw new ServiceException("新增操作,当前主键id已存在相关信息,请联系管理员");
    }
    List<EasOrgRangeDTO> orgRanges = dto.getOrgRanges();
    List<EasSubOrgRangeDTO> subOrgRanges = dto.getSubOrgRanges();
    if (CollectionUtils.isNotEmpty(orgRanges)) {
      orgRanges.forEach(orgRange -> {
        try {
          EasCustomerOrgDO rd = DAOUtils.cloneBean(EasCustomerOrgDO.class, orgRange);
          rd.setUserId(dto.getId());
          easCustomerOrgManager.insertLong(rd);
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }
    if (CollectionUtils.isNotEmpty(subOrgRanges)) {
      subOrgRanges.forEach(subOrgRange -> {
        try {
          EasCustomerOrgDO rsd = DAOUtils.cloneBean(EasCustomerOrgDO.class, subOrgRange);
          rsd.setUserId(dto.getId());
          easCustomerOrgManager.insertLong(rsd);
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }
    return new ResultDTO<>(manager.insert(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasCustomerUpdateDTO dto) throws Exception {
    
    EasCustomerDO EasCustomerDO = manager.selectByPK(dto.getId());
    if (EasCustomerDO == null) {
      throw new ServiceException("更新操作,当前主键id,未获取到相关信息,请联系管理员");
    }
    
    EasCustomerDO d = DAOUtils.cloneBean(EasCustomerDO.class, dto);
    List<EasOrgRangeDTO> orgRanges = dto.getOrgRanges();
    List<EasSubOrgRangeDTO> subOrgRanges = dto.getSubOrgRanges();
    
    easCustomerOrgManager.deleteByUserId(dto.getId());
    
    if (CollectionUtils.isNotEmpty(orgRanges)) {
      orgRanges.forEach(orgRange -> {
        try {
          EasCustomerOrgDO rd = DAOUtils.cloneBean(EasCustomerOrgDO.class, orgRange);
          rd.setUserId(dto.getId());
          easCustomerOrgManager.insertLong(rd);
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }
    if (CollectionUtils.isNotEmpty(subOrgRanges)) {
      subOrgRanges.forEach(subOrgRange -> {
        try {
          EasCustomerOrgDO rsd = DAOUtils.cloneBean(EasCustomerOrgDO.class, subOrgRange);
          rsd.setUserId(dto.getId());
          easCustomerOrgManager.insertLong(rsd);
        } catch (Exception e) {
          e.printStackTrace();
        }
      });
    }
    return new ResultDTO<>(manager.updateSelective(d));
  }
}
