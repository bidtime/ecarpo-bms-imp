/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.supplier.service;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.allenum.bs.BsCompanyTypeEnum;
import com.ecarpo.bms.bs.server.company.entity.BsCompanyDO;
import com.ecarpo.bms.bs.server.company.service.BsCompanyManager;
import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.bms.eas.server.group.service.EasGroupManager;
import com.ecarpo.bms.eas.server.orgrange.entity.EasOrgRangeDO;
import com.ecarpo.bms.eas.server.orgrange.service.EasOrgRangeManager;
import com.ecarpo.bms.eas.server.supplier.supplier.dao.EasSupplierDAO;
import com.ecarpo.bms.eas.server.supplier.supplier.dao.EasSupplierMapper;
import com.ecarpo.bms.eas.server.supplier.supplier.entity.EasSupplierDO;
import com.ecarpo.bms.eas.server.supplier.supplierbank.entity.EasSupplierBankDO;
import com.ecarpo.bms.eas.server.supplier.supplierbank.service.EasSupplierBankManager;
import com.ecarpo.bms.eas.supplier.supplier.dto.SaveSupplierDTO;
import com.ecarpo.bms.eas.supplier.supplier.dto.SaveSupplierOtherInfo;
import com.ecarpo.bms.eas.supplier.supplierbank.dto.SaveSupplierBankDTO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierManager
    extends BaseDAOManager<EasSupplierDAO, EasSupplierMapper, EasSupplierDO> {

  @Autowired
  private EasGroupManager easGroupManager;

  @Autowired
  private EasSupplierBankManager easSupplierBankManager;

  @Autowired
  private EasOrgRangeManager easOrgRangeManager;

  @Autowired
  private BsCompanyManager bsCompanyManager;

  /**
   * 保存EAS推送的供应商信息
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  public Integer save(SaveSupplierDTO dto) throws Exception {
    Integer m = 0;
    Integer insertOrUpdateFlag = dto.getInsertOrUpdateFlag();

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
   * EAS推送的供应商信息 - 新建
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  private Integer insertByBase(SaveSupplierDTO dto) throws Exception {
    String supplierId = dto.getSupplierId();
    Integer m = 0;

    EasSupplierDO easSupplierDO = dao.selectByPK(supplierId);
    if (easSupplierDO != null) {
      throw new ManagerException("新增操作,当前EAS主键已存在,请检查后重试");
    }

    //维护 ERP 数据

    BsCompanyDO bsCompanyDO = bsCompanyManager.selectByEasNumber(dto.getSupplierNumber());
    Long companyId = null;
    if (bsCompanyDO != null) {
      companyId = bsCompanyDO.getCompanyId();
    } else {
      BsCompanyDO companyDO = DAOUtils.cloneBean(BsCompanyDO.class, dto);
      companyDO.setGroupId(0L);
      companyDO.setOrgId(0L);
      companyDO.setCompanyName(dto.getSimpleName());
      companyDO.setCompanyFullName(dto.getSimpleName());
      companyDO.setProvinceName(dto.getProvinceidName());
      companyDO.setDistrictName(dto.getRegionidName());
      companyDO.setAddr(dto.getAddress());
      companyDO.setTypeId(BsCompanyTypeEnum.SUPPLIER.getValue());
      companyDO.setTypeName(BsCompanyTypeEnum.SUPPLIER.getName());
      companyDO.setRemark("EAS 推送数据");
      companyId = bsCompanyManager.insertLong(companyDO).longValue();
    }
    //主单
    EasSupplierDO cloneBean = DAOUtils.cloneBean(EasSupplierDO.class, dto);
    cloneBean.setErpCompanyId(companyId);
    m += dao.insert(cloneBean);

    //保存其他信息
    SaveSupplierOtherInfo otherInfo = DAOUtils.cloneBean(SaveSupplierOtherInfo.class, dto);
    m += this.saveOtherInfo(otherInfo, supplierId);

    return m;
  }

  /**
   * 保存EAS供应商其他信息
   * 
   * @param otherInfo
   * @param supplierId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  private Integer saveOtherInfo(SaveSupplierOtherInfo otherInfo, String supplierId)
      throws Exception {

    Integer m = 0;

    if (otherInfo == null) {
      return m;
    }

    if (1 == otherInfo.getInsertOrUpdateFlag()) {
      //先删除所有
      m += easGroupManager.deleteByLinkedId(supplierId);
      m += easSupplierBankManager.deleteBySupplierId(supplierId);
      m += easOrgRangeManager.deleteByLinkedId(supplierId);
    }

    //供应商分组明细
    if (CollectionUtils.isNotEmpty(otherInfo.getGroups())) {
      for (SaveGroupDTO groupDTO : otherInfo.getGroups()) {
        EasGroupDO cloneBean = DAOUtils.cloneBean(EasGroupDO.class, groupDTO);
        cloneBean.setLinkedId(supplierId);
        easGroupManager.insertLong(cloneBean);
        m++;
      }
    }

    //银行信息
    if (CollectionUtils.isNotEmpty(otherInfo.getBanks())) {
      for (SaveSupplierBankDTO bankDTO : otherInfo.getBanks()) {
        EasSupplierBankDO cloneBean = DAOUtils.cloneBean(EasSupplierBankDO.class, bankDTO);
        cloneBean.setSupplierId(supplierId);
        easSupplierBankManager.insertLong(cloneBean);
        m++;
      }
    }

    //分配组织信息
    if (CollectionUtils.isNotEmpty(otherInfo.getOrgRanges())) {
      for (SaveOrgRangeDTO orgRang : otherInfo.getOrgRanges()) {
        EasOrgRangeDO cloneBean = DAOUtils.cloneBean(EasOrgRangeDO.class, orgRang);
        cloneBean.setLinkedId(supplierId);
        easOrgRangeManager.insertLong(cloneBean);
        m++;
      }
    }
    return m;
  }

  /**
   * EAS推送的供应商信息 - 更新
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.05
   */
  private Integer updateByBase(SaveSupplierDTO dto) throws Exception {
    dto.setCreateTime(null);
    dto.setCreatorId(null);
    dto.setCreatoridName(null);

    String supplierId = dto.getSupplierId();
    Integer m = 0;

    EasSupplierDO easSupplierDO = dao.selectByPK(supplierId);
    if (easSupplierDO == null) {
      throw new ManagerException("更新操作,当前EAS主键未获取到相关信息,请检查后重试");
    }

    //维护 ERP 数据
    //    Long companyId = easSupplierDO.getErpCompanyId();
    //    BsCompanyDO bsCompanyDO = new BsCompanyDO();
    //    bsCompanyDO.setCompanyId(companyId);
    //    bsCompanyDO.setCompanyName(dto.getSimpleName());
    //    bsCompanyDO.setCompanyFullName(dto.getSimpleName());
    //    bsCompanyDO.setModifyTime(dto.getModifyTime());
    //    bsCompanyDO.setModifierId(dto.getModifierId());
    //    bsCompanyDO.setProvinceName(dto.getProvinceidName());
    //    bsCompanyDO.setDistrictName(dto.getRegionidName());
    //    bsCompanyDO.setAddr(dto.getAddress());
    //    bsCompanyManager.updateSelective(bsCompanyDO);

    BsCompanyDO bsCompanyDO = bsCompanyManager.selectByEasNumber(dto.getSupplierNumber());
    Long erpCompanyId = null;
    if (bsCompanyDO != null) {
      erpCompanyId = bsCompanyDO.getCompanyId();
    }

    //主单
    EasSupplierDO cloneBean = DAOUtils.cloneBean(EasSupplierDO.class, dto);
    cloneBean.setErpCompanyId(erpCompanyId);
    m += dao.updateSelective(cloneBean);

    //保存其他信息
    SaveSupplierOtherInfo otherInfo = DAOUtils.cloneBean(SaveSupplierOtherInfo.class, dto);
    m += this.saveOtherInfo(otherInfo, supplierId);

    return m;
  }

}
