/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.orgbaseunit.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasOrgBaseUnitUpdateDTO extends UpdateDTO {

  /**
   * id
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @NotBlank(message = "主键id不能为空,请检查")
  private String id;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 发运组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @JSONField(name = "partTransportID")
  private String partTransportId;

  /**
   * 是否是行政组织
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  private Integer isAdminOrgUnit;

  /**
   * hr组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @JSONField(name = "partHRID")
  private String partHrId;

  /**
   * 上级组织单元层级
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @JSONField(name = "parentID_level")
  private String parentIdLevel;

  /**
   * 成本中心组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  @JSONField(name = "partCostCenterID")
  private String partCostCenterId;

  /**
   * 是否是发运组织单元
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  private Integer isTransportOrgUnit;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-06-06 10:13:56
   */
  private Date invalidDate;

  /**
   * 维护cu
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "maintainCUID_name")
  private String maintainCuIdName;

  /**
   * 层级
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "level")
  private Integer  gradation;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String description;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isLeaf;

  /**
   * 是否是hr组织单元
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isHrOrgUnit;

  /**
   * 是否合并范围
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isUnion;

  /**
   * 行政组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partAdminID")
  private String partAdminId;

  /**
   * 财务组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partFIID")
  private String partFiId;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String simpleName;

  /**
   * 质检组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partQualityID")
  private String partQualityId;

  /**
   * 是否是利润中心
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isProfitOrgUnit;

  /**
   * 编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String code;

  /**
   * 上级组织单元名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "parentID_name")
  private String parentIdName;

  /**
   * 对应的主账簿组织
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "mainOrgID_number")
  private String mainOrgIdNumber;

  /**
   * 英文名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String englishName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 销售组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partSaleID")
  private String partSaleId;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 是否是销售组织
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isSaleOrgUnit;

  /**
   * 是否副账簿组织
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isAssistantOrg;

  /**
   * 是否是库存组织
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isStorageOrgUnit;

  /**
   * 利润中心组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partProfitCenterID")
  private String partProfitCenterId;

  /**
   * 上级组织单元编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "parentID_number")
  private String parentIdNumber;

  /**
   * 版本号
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String versionNumber;

  /**
   * 是否是采购组织
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isPurchaseOrgUnit;

  /**
   * 是否是组
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isGrouping;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Date lastUpdateTime;

  /**
   * 是否启用
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isStart;

  /**
   * 是否冻结
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isFreeze;

  /**
   * 库存组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partStorageID")
  private String partStorageId;

  /**
   * 是否是质检组织单元
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isQualityOrgUnit;

  /**
   * 维护cu编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "maintainCUID_number")
  private String maintainCuIdNumber;

  /**
   * 管理单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partCtrlID")
  private String partCtrlId;

  /**
   * 采购组织单元拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partPurchaseID")
  private String partPurchaseId;

  /**
   * 名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 合并单元组拓展
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "partUnionGroupID")
  private String partUnionGroupId;

  /**
   * 是否是成本中心
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isCostOrgUnit;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 组织类型信息
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String orgTypeStr;

  /**
   * 是否封存
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isOuSealUp;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 对应的主账簿组织名称
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  @JSONField(name = "mainOrgID_name")
  private String mainOrgIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Date effectDate;

  /**
   * 是否是cu
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private Integer isCu;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-06 10:13:57
   */
  private String longNumber;
}
