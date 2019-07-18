/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.supplier.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.bms.eas.supplier.supplierbank.dto.SaveSupplierBankDTO;
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
public class SaveSupplierDTO extends InsertDTO {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 更新或者新增标识(controller 中手动赋值) 1 == 更新,0==新增
   */
  private Integer insertOrUpdateFlag;

  /******************** 供应商主单信息 ***********************/

  /**
   * 供应商id
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @NotBlank(message = "供应商id不能为空")
  @JSONField(name = "id")
  private String supplierId;

  /**
   * 法人代表
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "artificialPerson")
  private String artificialPerson;

  /**
   * 条形码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "barCode")
  private String barCode;

  /**
   * 业务分析编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "bizAnalysisCodeID_number")
  private String bizAnalysisCodeidNumber;

  /**
   * 业务分析名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "bizAnalysisCodeID_name")
  private String bizAnalysisCodeidName;

  /**
   * 供应商基本分类编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "browseGroupID_number")
  private String browseGroupidNumber;

  /**
   * 供应商基本分类名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "browseGroupID_name")
  private String browseGroupidName;

  /**
   * 供应商基本分类级次
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "browseGroupID_level")
  private Integer browseGroupidLevel;

  /**
   * 生产经营许可证
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "busiExequatur")
  private String busiExequatur;

  /**
   * 工商注册号
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "bizRegisterNo")
  private String bizRegisterNo;

  /**
   * 营业执照
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "busiLicence")
  private String busiLicence;

  /**
   * 城市编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "cityID_number")
  private String cityidNumber;

  /**
   * 城市名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "cityID_name")
  private String cityidName;

  /**
   * 国家编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "countryID_number")
  private String countryidNumber;

  /**
   * 国家名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "countryID_name")
  private String countryidName;

  /**
   * 客户组织单元编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "freezeOrgUnit_number")
  private String freezeOrgUnitNumber;

  /**
   * 客户组织单元名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "freezeOrgUnit_name")
  private String freezeOrgUnitName;

  /**
   * GSP认证
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "gspAuthentication")
  private String gspHuthentication;

  /**
   * 行业编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "industryID_number")
  private String industryidNumber;

  /**
   * 行业名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "industryID_name")
  private String industryidName;

  /**
   * 集团内公司编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "internalCompanyID_number")
  private String internalCompanyidNumber;

  /**
   * 集团内公司名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "internalCompanyID_name")
  private String internalCompanyidName;

  /**
   * 是否集团内公司
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "isInternalCompany")
  private Integer isInternalCompany;

  /**
   * 上级供应商编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "parentID_number")
  private String parentidNumber;

  /**
   * 上级供应商名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "parentID_name")
  private String parentidName;

  /**
   * 省编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "provinceID_number")
  private String provinceidNumber;

  /**
   * 省名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "provinceID_name")
  private String provinceidName;

  /**
   * 区编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "regionID_number")
  private String regionidNumber;

  /**
   * 区名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "regionID_name")
  private String regionidName;

  /**
   * 税种编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "taxDataID_number")
  private String taxdataidNumber;

  /**
   * 税种名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "taxDataID_name")
  private String taxdataidName;

  /**
   * 税务登记号
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "taxRegisterNo")
  private String taxRegisterNo;

  /**
   * 状态,核准=1,禁用=2,未核准=0,已删除=3
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "usedStatus")
  private Integer usedStatus;

  /**
   * 版本
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "version")
  private Integer version;

  /**
   * 生效状态,暂存=1,生效=2
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "effectedStatus")
  private Integer effectedStatus;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "mnemonicCode")
  private String mnemonicCode;

  /**
   * 外文名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "foreignName")
  private String foreignName;

  /**
   * 地址
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "address")
  private String address;

  /**
   * 税率
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "taxRate")
  private BigDecimal taxRate;

  /**
   * 是否为多页签复制
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "isMultiCopy")
  private Integer isMultiCopy;

  /**
   * 是否承运商
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "isCarrier")
  private Integer isCarrier;

  /**
   * 委外商
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "isOuter")
  private Integer isOuter;

  /**
   * 旧编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "oldNumber")
  private String oldNumber;

  /**
   * 拼音名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "namePinYin")
  private String namePinYin;

  /**
   * 拼音简称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "nameShortPinYin")
  private String nameShortPinYin;

  /**
   * 纳税人类型,=-1,一般纳税人=0,小规模纳税人=1
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "taxPayerType")
  private Integer taxPayerType;

  /**
   * 公司=0,利润中心=1
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "internalSupplierType")
  private Integer internalSupplierType;

  /**
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "internalProfitCenter_number")
  private String internalProfitCenterNumber;

  /**
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "internalProfitCenter_name")
  private String internalProfitCenterName;

  /**
   * 管理组织编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "adminCUID_number")
  private String admincuidNumber;

  /**
   * 管理组织名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "adminCUID_name")
  private String admincuidName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitidNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitidName;

  /**
   * 名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "name")
  private String supplierName;

  /**
   * 编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "number")
  private String supplierNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "simpleName")
  private String simpleName;

  /**
   * 创建人编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "creatorID_number")
  private String creatoridNumber;

  /**
   * 创建人名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "creatorID_name")
  private String creatoridName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "lastUpdateTime")
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUseridNumber;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-05 13:34:12
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUseridName;

  /******************** 供应商对应银行信息 ***********************/
  @JSONField(name = "banks")
  List<SaveSupplierBankDTO> banks;

  /******************** 供应商对应分组信息 ***********************/
  @JSONField(name = "groups")
  List<SaveGroupDTO> groups;

  /******************** 供应商分配信息 ***********************/
  @JSONField(name = "orgRanges")
  List<SaveOrgRangeDTO> orgRanges;

}
