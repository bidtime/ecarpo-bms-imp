/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.orgctrlunit.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@Data
public class EasOrgCtrlUnitSaveDTO implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * 更新或者新增标识(controller 中手动赋值) 1 == 更新,0==新增
   */
  private Integer insertOrUpdateFlag;


  /**
   * id
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String id;

  /**
   * 是否是采购组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isPurchaseOrgUnit;

  /**
   * 是否是组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isGrouping;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 是否冻结
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isFreeze;

  /**
   * 是否启用
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isStart;

  /**
   * 是否是行政组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isAdminOrgUnit;

  /**
   * 是否是发运组织单元
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isTransportOrgUnit;

  /**
   * 是否是质检组织单元
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isQualityOrgUnit;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Date invalidDate;

  /**
   * 级次 level
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "level")
  private Integer gradation;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String description;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isLeaf;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 是否是财务组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isCompanyOrgUnit;

  /**
   * 是否是hr组织单元
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "isHROrgUnit")
  private Integer isHrOrgUnit;

  /**
   * 是否合并范围
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isUnion;

  /**
   * 是否是成本中心
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isCostOrgUnit;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String simpleName;

  /**
   * ou是否封存
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "isOUSealUp")
  private Integer isOuSealUp;

  /**
   * 组织类型信息
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String orgTypeStr;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Date effectDate;

  /**
   * 是否是利润中心
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isProfitOrgUnit;

  /**
   * 是否是cu
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "isCU")
  private Integer isCu;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "parentID_name")
  private String parentIdName;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String code;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 是否是销售组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isSaleOrgUnit;

  /**
   * 是否是库存组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isStorageOrgUnit;

  /**
   * 上级组织编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "parentID_number")
  private String parentIdNumber;

  /**
   * 显示名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String displayName;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String longNumber;

  /**
   * 版本号
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String versionNumber;
}
