/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgbaseunit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.org.entity.ApOrgDO;
import com.ecarpo.bms.ap.server.auth.org.service.ApOrgManager;
import com.ecarpo.bms.bs.server.dealer.entity.BsDealerDO;
import com.ecarpo.bms.bs.server.dealer.service.BsDealerManager;
import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitInsertDTO;
import com.ecarpo.bms.eas.orgbaseunit.dto.EasOrgBaseUnitUpdateDTO;
import com.ecarpo.bms.eas.server.orgbaseunit.dao.EasOrgBaseUnitDAO;
import com.ecarpo.bms.eas.server.orgbaseunit.dao.EasOrgBaseUnitMapper;
import com.ecarpo.bms.eas.server.orgbaseunit.entity.EasOrgBaseUnitDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasOrgBaseUnitManager
    extends BaseDAOManager<EasOrgBaseUnitDAO, EasOrgBaseUnitMapper, EasOrgBaseUnitDO> {

  @Autowired
  private ApOrgManager apOrgManager;

  @Autowired
  private BsDealerManager bsDealerManager;

  /**
   * EAS 推送组织单元基类信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number insertByBase(EasOrgBaseUnitInsertDTO dto) throws Exception {
    // dao.selectByPrimaryKey("",false);

    EasOrgBaseUnitDO baseUnitDO = dao.selectById(dto.getId());
    if (baseUnitDO != null) {
      throw new ManagerException("当前主键对应信息已存在,新增失败");
    }

    //推送数据到_ap_org + bs_dealer,维护组织基类的org_id
    //    if (dto.get) {
    //      
    //    }
    //    ApOrgDO apOrgDO = DAOUtils.cloneBean(ApOrgDO.class, dto);
    //    apOrgDO.setOrgName(dto.getDefine());
    //    apOrgDO.setOrgCode(dto.getEncrypt());
    //    apOrgDO.setOrgType(3);
    //    Long orgId = apOrgManager.insertLong(apOrgDO).longValue();
    //
    //    BsDealerDO bsDealerDO = new BsDealerDO();
    //    bsDealerDO.setDealerId(orgId);
    //    bsDealerDO.setGroupId(82803175605706752L);
    //    bsDealerDO.setBrandId(0L);
    //    bsDealerDO.setBrandName("");
    //    bsDealerDO.setGaCreated(0);
    //    bsDealerManager.insert(bsDealerDO);

    ApOrgDO apOrgDO = apOrgManager.selectByEasOrgNumber(dto.getEncrypt());

    //    if (apOrgDO == null) {
    //      throw new ManagerException("组织单元编码未获取到ERP组织信息,请联系管理员");
    //    }

    Long orgId = null;
    if (apOrgDO == null) {
      //将数据推送到ERP
      ApOrgDO orgDO = DAOUtils.cloneBean(ApOrgDO.class, dto);
      String define = dto.getDefine();
      if (define == null) {
        throw new ManagerException("组织单元基类的名称不能为空");
      }
      String substring =define.length()>18?define.substring(0, 18) : define;
      orgDO.setOrgName(substring);
      orgDO.setOrgCode(dto.getEncrypt());
      orgDO.setOrgType(3);
      orgDO.setOrgFullName(substring);
      orgDO.setRemark("EAS推送数据");
      orgId = apOrgManager.insertLong(orgDO).longValue();

      BsDealerDO bsDealerDO = new BsDealerDO();
      bsDealerDO.setDealerId(orgId);
      bsDealerDO.setGroupId(82803175605706752L);
      bsDealerDO.setBrandId(0L);
      bsDealerDO.setBrandName("");
      bsDealerDO.setGaCreated(0);
      bsDealerDO.setRemark("EAS推送数据");
      bsDealerManager.insert(bsDealerDO);
    } else {
      orgId = apOrgDO.getOrgId();
    }

    EasOrgBaseUnitDO cloneBean = DAOUtils.cloneBean(EasOrgBaseUnitDO.class, dto);
    cloneBean.setOrgId(orgId);
    int n = dao.insert(cloneBean);

    return n;
  }

  /**
   * EAS 推送组织单元基类信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number updateByBase(EasOrgBaseUnitUpdateDTO dto) throws Exception {

    EasOrgBaseUnitDO baseUnitDO = dao.selectById(dto.getId());
    if (baseUnitDO == null) {
      throw new ManagerException("当前主键对应信息不存在,更新失败");
    }

    EasOrgBaseUnitDO d = DAOUtils.cloneBean(EasOrgBaseUnitDO.class, dto);
    int n = dao.updateSelective(d);

    return n;
  }

  /**
   * 组织编码获取组织基类信息
   * 
   * @param encrypt
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.12
   */
  public EasOrgBaseUnitDO selectByNumber(String encrypt) throws Exception {
    return dao.selectByNumber(encrypt);
  }

  /**
   * id 获取DO
   * 
   * @param id
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.14
   */
  public EasOrgBaseUnitDO selectById(String id) throws Exception {
    return dao.selectById(id);
  }

  /**
   * 组织id 获取EAS对应的组织编码
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public String selectByOrgId(Long orgId) throws Exception {
    EasOrgBaseUnitDO easOrgBaseUnitDO = this.selectInfoByOrgId(orgId);

    if (easOrgBaseUnitDO != null) {
      return easOrgBaseUnitDO.getEncrypt();
    }
    return null;
  }

  /**
   * 组织id 获取EAS对应的组织信息
   * 
   * @param orgId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.01
   */
  public EasOrgBaseUnitDO selectInfoByOrgId(Long orgId) throws Exception {
    return dao.selectInfoByOrgId(orgId);
  }

}
