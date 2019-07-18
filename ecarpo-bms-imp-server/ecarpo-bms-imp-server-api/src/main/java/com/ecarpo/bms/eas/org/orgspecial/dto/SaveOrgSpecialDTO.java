/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgspecial.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class SaveOrgSpecialDTO implements Serializable {

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
  @NotBlank(message = "主键id不能为空")
  private String id;

  /**
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String location;

  /**
   * 业务状态 正常使用=0,冻结入库=1,冻结出库=2,冻结出入库=3,封存=4
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer status;

  /**
   * 库存组织类型
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer type;

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
   * 组织封存时间
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Date propertySealUpDate;

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
   * 上级组织层级
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "parentID_level")
  private Integer parentIdLevel;

  /**
   * 地址名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "addressID_name")
  private String addressIdName;

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
   * 是否封存
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isSealUp;

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
   * 负责人名称
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "leader_name")
  private String leaderName;

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
   * 领导人编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "leader_number")
  private String leaderNumber;

  /**
   * 是否合并范围
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isUnion;

  /**
   * 是否实体组织
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private Integer isBizUnit;

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
   * 地址编码
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  @JSONField(name = "addressID_number")
  private String addressIdNumber;

  /**
   * 版本号
   *
   * @mbg.generated 2019-06-13 08:50:05
   */
  private String versionNumber;

}
