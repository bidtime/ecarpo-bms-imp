/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.org.orgcompany.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SaveOrgCompanyDTO extends InsertDTO {

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
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String id;

  /**
   * 地址
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String taxAddress;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 是否是行政组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isAdminOrgUnit;

  /**
   * 是否是发运组织单元
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isTransportOrgUnit;

  /**
   * 营业有效期
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date endUpDate;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date invalidDate;

  /**
   * 报告货币折算方式 =2,本位币结算=3,原币结算=1
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String reportConvertMode;

  /**
   * 注册资本
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private BigDecimal registeredCapital;

  /**
   * 地区名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "region_name")
  private String regionName;

  /**
   * 级次 level
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "level")
  private Integer gradation;

  /**
   * 会计期间类型编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountPeriodID_number")
  private String accountPeriodIdNumber;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String description;

  /**
   * 是否封存
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isSealUp;

  /**
   * 银行名称名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "bankName_name")
  private String bankNameName;

  /**
   * 银行名称编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "bankName_number")
  private String bankNameNumber;

  /**
   * 银行账户编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "bankID_number")
  private String bankIdNumber;

  /**
   * 银行账户名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "bankID_name")
  private String bankIdName;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isLeaf;

  /**
   * 是否是hr组织单元
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isHrOrgUnit;

  /**
   * 是否是财务组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isCompanyOrgUnit;

  /**
   * 所属行业编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "industry_number")
  private String industryNumber;

  /**
   * 所属行业名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "industry_name")
  private String industryName;

  /**
   * 是否境内
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isChurchyard;

  /**
   * 是否合并范围
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isUnion;

  /**
   * 基本核算汇率表名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "baseExgTableID_name")
  private String baseExgTableIdName;

  /**
   * 本位币编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "baseExgTableID_number")
  private String baseCurrencyIdNumber;

  /**
   * 本位币名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "baseCurrencyID_name")
  private String baseCurrencIdName;

  /**
   * 基本核算汇率表编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "baseCurrencyID_number")
  private String baseExgTableIdNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String simpleName;

  /**
   * 期末调汇汇率表编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "adjustExgTableID_number")
  private String adjustExgTableIdNumber;

  /**
   * 期末调汇汇率表名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "adjustExgTableID_name")
  private String adjustExgTableIdName;

  /**
   * 是否是利润中心
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isProfitOrgUnit;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * 开票机号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String invoiceNumber;

  /**
   * 分开票机数
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String invoiceCount;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String code;

  /**
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "parentID_name")
  private String parentIdName;

  /**
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "mainOrgID_number")
  private Integer mainOrgIdNumber;

  /**
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "mainOrgID_name")
  private String mainOrgIdName;

  /**
   * 地区编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "region_number")
  private String regionNumber;

  /**
   * 法人代表编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "juridicalPersonID_number")
  private String juridicalPersonIdNumber;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 科目表名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountTableID_name")
  private String accountTableIdName;

  /**
   * 报告货币编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "reportCurrencyID_number")
  private String reportCurrencyIdNumber;

  /**
   * 法人代表名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "juridicalPersonID_name")
  private String juridicalPersonIdName;

  /**
   * 是否是销售组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isSaleOrgUnit;

  /**
   * 报告货币名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "reportCurrencyID_name")
  private String reportCurrencyIdName;

  /**
   * 是否副账簿组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isAssistantOrg;

  /**
   * 账簿方案编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountSchemeID_number")
  private String accountSchemeIdNumber;

  /**
   * 账簿方案名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountSchemeID_name")
  private String accountSchemeIdName;

  /**
   * 是否是库存组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isStorageOrgUnit;

  /**
   * 上级组织编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "parentID_number")
  private String parentIdNumber;

  /**
   * 版本号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String versionNumber;

  /**
   * 是否是采购组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isPurchaseOrgUnit;

  /**
   * 是否是组织
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isgrouping;

  /**
   * 报告货币折算汇率表编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "reportExgTableID_number")
  private String reportExgTableIdNumber;

  /**
   * 地区
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String territory;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date lastUpdateTime;

  /**
   * 是否启用
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isStart;

  /**
   * 是否冻结
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isFreeze;

  /**
   * 是否是质检组织单元
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isQualityOrgUnit;

  /**
   * 地址名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "addressID_name")
  private String addressIdName;

  /**
   * 地址编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "addressID_number")
  private String addressIdNumber;

  /**
   * 科目表编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountTableID_number")
  private String accountTableIdNumber;

  /**
   * 注册登记号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String registeredCode;

  /**
   * 授权码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String authorizationCode;

  /**
   * 是否仅用于集团合并
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isOnlyUnion;

  /**
   * 联系人
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String contact;

  /**
   * 成立日期
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date setUpDate;

  /**
   * 会计期间类型名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "accountPeriodID_name")
  private String accountPeriodIdName;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 是否为集团公司
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isGroup;

  /**
   * 报告货币折算汇率表名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "reportExgTableID_name")
  private String reportExgTableIdName;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 是否是成本中心
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isCostOrgUnit;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 组织类型信息
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String orgTypeStr;

  /**
   * ou是否封存
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer isOuSealUp;

  /**
   * 授权秘钥
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String authorizationKey;

  /**
   * 联系电话
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String contactPhone;

  /**
   * 税务登记号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String taxNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date effectDate;

  /**
   * 是否是cu
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "isCU")
  private Integer isCu;

  /**
   * 注册税务名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String taxRegisterName;

  /**
   * 经济类型
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Integer economicType;

  /**
   * 纳税编号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String taxCode;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private Date activityDate;

  /**
   * 纳税人类型 =0,一般纳税人=D301,小规模纳税人=2
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "taxType")
  private Integer taxYpe;

  /**
   * 显示名称
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  private String displayName;

  /**
   * 纳税人识别号
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "taxpayerID")
  private Integer taxpayerId;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "longNumber")
  private String longNumber;

  /**
   * 银行账户
   *
   * @mbg.generated 2019-06-13 14:35:06
   */
  @JSONField(name = "bankAccount")
  private String bankaccount;

}
