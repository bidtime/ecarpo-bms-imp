/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.org.orgcompany.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.org.orgcompany.dto.SaveOrgCompanyDTO;
import com.ecarpo.bms.eas.server.org.orgcompany.dao.EasOrgCompanyDAO;
import com.ecarpo.bms.eas.server.org.orgcompany.dao.EasOrgCompanyMapper;
import com.ecarpo.bms.eas.server.org.orgcompany.entity.EasOrgCompanyDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
@Service
public class EasOrgCompanyManager
    extends BaseDAOManager<EasOrgCompanyDAO, EasOrgCompanyMapper, EasOrgCompanyDO> {

//  @Autowired
//  private EasOrgBaseUnitManager easOrgBaseUnitManager;

  //  @Autowired
  //  private ApOrgManager apOrgManager;
  //
  //  @Autowired
  //  private BsDealerManager bsDealerManager;

  /**
   * 保存财务组织
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  public Integer save(SaveOrgCompanyDTO dto) throws Exception {

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
   * 新建
   * 
   * @param dto
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.13
   */
  private Integer insertByBase(SaveOrgCompanyDTO dto) throws Exception {

    EasOrgCompanyDO easOrgCompanyDO = dao.selectById(dto.getId());
    if (easOrgCompanyDO != null) {
      throw new ManagerException("新增操作,当前主键已存在信息,请联系管理员");
    }

    //校验组织单元基类
    //    EasOrgBaseUnitDO easOrgBaseUnitDO = easOrgBaseUnitManager.selectById(dto.getId());
    //    if (easOrgBaseUnitDO == null) {
    //      throw new ManagerException("新增操作,当前组织的组织单元基类数据不存在");
    //    }

    //推送数据到_ap_org + bs_dealer,维护组织基类的org_id
    //    ApOrgDO apOrgDO = DAOUtils.cloneBean(ApOrgDO.class, dto);
    //    apOrgDO.setOrgName(dto.getDefine());
    //    apOrgDO.setOrgCode(dto.getEncrypt());
    //    apOrgDO.setOrgType(dto.getIsGroup() == 1 ? 2 : 3);
    //    Long orgId = apOrgManager.insertLong(apOrgDO).longValue();
    //
    //    BsDealerDO bsDealerDO = new BsDealerDO();
    //    bsDealerDO.setDealerId(orgId);
    //    bsDealerDO.setGroupId(82803175605706752L);
    //    bsDealerDO.setBrandId(0L);
    //    bsDealerDO.setBrandName("");
    //    bsDealerDO.setGaCreated(0);
    //    bsDealerManager.insert(bsDealerDO);
    //
    //    easOrgBaseUnitDO.setOrgId(orgId);
    //    easOrgBaseUnitManager.updateSelective(easOrgBaseUnitDO);
    //

    EasOrgCompanyDO cloneBean = DAOUtils.cloneBean(EasOrgCompanyDO.class, dto);
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
  private Integer updateByBase(SaveOrgCompanyDTO dto) throws Exception {

    EasOrgCompanyDO easOrgCompanyDO = dao.selectById(dto.getId());
    if (easOrgCompanyDO == null) {
      throw new ManagerException("更新操作,当前主键未获取到相关信息,请联系管理员");
    }

    //维护ap_org + bs_dealer

//    Long orgId = easOrgBaseUnitDO.getOrgId();
//
//    if (orgId != null) {
//      ApOrgDO apOrgDO = DAOUtils.cloneBean(ApOrgDO.class, dto);
//      apOrgDO.setOrgId(orgId);
//      apOrgDO.setOrgName(dto.getDefine());
//      apOrgDO.setOrgCode(dto.getEncrypt());
//      apOrgDO.setOrgType(dto.getIsGroup() == 1 ? 2 : 3);
//      apOrgManager.updateSelective(apOrgDO);
//    }

    return dao.updateSelective(DAOUtils.cloneBean(easOrgCompanyDO, dto));
  }

}
