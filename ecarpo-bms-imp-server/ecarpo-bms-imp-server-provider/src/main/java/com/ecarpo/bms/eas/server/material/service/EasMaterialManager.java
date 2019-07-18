/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.material.service;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.bs.server.material.entity.BsMaterialDO;
import com.ecarpo.bms.bs.server.material.service.BsMaterialManager;
import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.material.dto.EasMaterialInsertDTO;
import com.ecarpo.bms.eas.material.dto.EasMaterialOtherDTO;
import com.ecarpo.bms.eas.material.dto.EasMaterialUpdateDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.bms.eas.server.group.service.EasGroupManager;
import com.ecarpo.bms.eas.server.material.dao.EasMaterialDAO;
import com.ecarpo.bms.eas.server.material.dao.EasMaterialMapper;
import com.ecarpo.bms.eas.server.material.entity.EasMaterialDO;
import com.ecarpo.bms.eas.server.orgrange.entity.EasOrgRangeDO;
import com.ecarpo.bms.eas.server.orgrange.service.EasOrgRangeManager;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.exception.ManagerException;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasMaterialManager extends BaseDAOManager<EasMaterialDAO, EasMaterialMapper, EasMaterialDO> {

  @Autowired
  private BsMaterialManager bsMaterialManager;

  @Autowired
  private EasOrgRangeManager easOrgRangeManager;

  @Autowired
  private EasGroupManager easGroupManager;

  /**
   * EAS 推送行政组织信息
   *
   * @param dto
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019.06.06
   */
  public Number insertByBase(EasMaterialInsertDTO dto) throws Exception {

    String id = dto.getId();
    if (StringUtils.isBlank(id)) {
      throw new ManagerException("新增操作,EAS主键为空,请检查后重试");
    }
    Integer m = 0;

    EasMaterialDO easMaterialDO = dao.selectByPK(id);
    if (easMaterialDO != null) {
      throw new ManagerException("新增操作,当前EAS主键已存在,请检查后重试");
    }

    //维护 ERP 数据
    BsMaterialDO bsMaterialDO = DAOUtils.cloneBean(BsMaterialDO.class, dto);
    bsMaterialDO.setGroupId(0L);
    bsMaterialDO.setOrgId(0L);
    bsMaterialDO.setMaterialCode(dto.getEncrypt());
    bsMaterialDO.setMaterialName(dto.getDefine());
    bsMaterialDO.setMaterialAlias(dto.getAlias());
    bsMaterialDO.setShortCode(dto.getHelpCode());
    bsMaterialDO.setMaterialTypeId(0L);
    bsMaterialDO.setMaterialTypeName(dto.getMaterialGroupName());
    bsMaterialDO.setBaseUnitId(0L);
    bsMaterialDO.setQrCode("");
    bsMaterialDO.setRegMark(dto.getRegisteredMark());
    bsMaterialDO.setWarrantNo(dto.getWarrantNumber());
    bsMaterialDO.setPicNo(dto.getPictureNumber());
    bsMaterialDO.setAssistAttrCode(dto.getAssistAttrNumber());
    bsMaterialDO.setWeightUnitId(0L);
    bsMaterialDO.setLengthUnitId(0L);
    bsMaterialDO.setVolumeUnitId(0L);
    bsMaterialDO.setUseAssistAttr(dto.getUseAsstAttrRelation());
    bsMaterialDO.setVer(dto.getVersion());
    Long materialId = bsMaterialManager.insertLong(bsMaterialDO).longValue();

    //回写eas主键信息
    //主单
    EasMaterialDO d = DAOUtils.cloneBean(EasMaterialDO.class, dto);
    d.setErpMaterialId(materialId);
    m += dao.insert(d);

    //保存其他信息
    EasMaterialOtherDTO otherInfo = DAOUtils.cloneBean(EasMaterialOtherDTO.class, dto);
    m += this.saveOtherInfo(otherInfo, id);
    return m;
  }

  /**
   * 保存物料其他信息
   *
   * @param
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/6/18
   */
  private Integer saveOtherInfo(EasMaterialOtherDTO otherInfo, String id)
      throws Exception {

    Integer m = 0;

    if (otherInfo == null) {
      return m;
    }

    //供应商分组明细
    if (CollectionUtils.isNotEmpty(otherInfo.getGroups())) {
      for (SaveGroupDTO groupDTO : otherInfo.getGroups()) {
        EasGroupDO cloneBean = DAOUtils.cloneBean(EasGroupDO.class, groupDTO);
        cloneBean.setLinkedId(id);
        easGroupManager.insertLong(cloneBean);
        m++;
      }
    }

    //分配组织信息
    if (CollectionUtils.isNotEmpty(otherInfo.getOrgRanges())) {
      for (SaveOrgRangeDTO orgRang : otherInfo.getOrgRanges()) {
        EasOrgRangeDO cloneBean = DAOUtils.cloneBean(EasOrgRangeDO.class, orgRang);
        cloneBean.setLinkedId(id);
        easOrgRangeManager.insertLong(cloneBean);
        m++;
      }
    }
    return m;
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
  public Number updateByBase(EasMaterialUpdateDTO dto) throws Exception {
    String id = dto.getId();
    Integer m = 0;

    EasMaterialDO easMaterialDO = dao.selectByPK(id);
    if (easMaterialDO == null) {
      throw new ManagerException("更新操作,当前EAS主键未获取到相关信息,请检查后重试");
    }

    //主单
    m += dao.updateSelective(DAOUtils.cloneBean(EasMaterialDO.class, dto));

    //保存其他信息
    m += easGroupManager.deleteByLinkedId(id);
    m += easOrgRangeManager.deleteByLinkedId(id);
    EasMaterialOtherDTO otherInfo = DAOUtils.cloneBean(EasMaterialOtherDTO.class, dto);
    m += this.saveOtherInfo(otherInfo, id);

    //维护 ERP 数据
    Long materialId = easMaterialDO.getErpMaterialId();
    BsMaterialDO bsMaterialDO = DAOUtils.cloneBean(BsMaterialDO.class, dto);
    bsMaterialDO.setMaterialId(materialId);
    bsMaterialDO.setGroupId(0L);
    bsMaterialDO.setOrgId(0L);
    bsMaterialDO.setMaterialCode(dto.getEncrypt());
    bsMaterialDO.setMaterialName(dto.getDefine());
    bsMaterialDO.setMaterialAlias(dto.getAlias());
    bsMaterialDO.setShortCode(dto.getHelpCode());
    bsMaterialDO.setMaterialTypeId(0L);
    bsMaterialDO.setMaterialTypeName(dto.getMaterialGroupName());
    bsMaterialDO.setBaseUnitId(0L);
    bsMaterialDO.setQrCode("");
    bsMaterialDO.setRegMark(dto.getRegisteredMark());
    bsMaterialDO.setWarrantNo(dto.getWarrantNumber());
    bsMaterialDO.setPicNo(dto.getPictureNumber());
    bsMaterialDO.setAssistAttrCode(dto.getAssistAttrNumber());
    bsMaterialDO.setWeightUnitId(0L);
    bsMaterialDO.setLengthUnitId(0L);
    bsMaterialDO.setVolumeUnitId(0L);
    bsMaterialDO.setUseAssistAttr(dto.getUseAsstAttrRelation());
    bsMaterialDO.setVer(dto.getVersion());
    m += bsMaterialManager.updateSelective(bsMaterialDO);
    return m;
  }
}
