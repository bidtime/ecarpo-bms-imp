/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplier.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasSupplierDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 供应商id
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  @PKField
  private String supplierId;

  /**
   * 法人代表
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String artificialPerson;

  /**
   * 条形码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String barCode;

  /**
   * 业务分析编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String bizAnalysisCodeidNumber;

  /**
   * 业务分析名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String bizAnalysisCodeidName;

  /**
   * 供应商基本分类编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String browseGroupidNumber;

  /**
   * 供应商基本分类名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String browseGroupidName;

  /**
   * 供应商基本分类级次
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer browseGroupidLevel;

  /**
   * 生产经营许可证
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String busiExequatur;

  /**
   * 工商注册号
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String bizRegisterNo;

  /**
   * 营业执照
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String busiLicence;

  /**
   * 城市编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String cityidNumber;

  /**
   * 城市名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String cityidName;

  /**
   * 国家编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String countryidNumber;

  /**
   * 国家名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String countryidName;

  /**
   * 客户组织单元编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String freezeOrgUnitNumber;

  /**
   * 客户组织单元名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String freezeOrgUnitName;

  /**
   * GSP认证
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String gspHuthentication;

  /**
   * 行业编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String industryidNumber;

  /**
   * 行业名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String industryidName;

  /**
   * 集团内公司编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String internalCompanyidNumber;

  /**
   * 集团内公司名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String internalCompanyidName;

  /**
   * 是否集团内公司
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer isInternalCompany;

  /**
   * 上级供应商编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String parentidNumber;

  /**
   * 上级供应商名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String parentidName;

  /**
   * 省编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String provinceidNumber;

  /**
   * 省名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String provinceidName;

  /**
   * 区编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String regionidNumber;

  /**
   * 区名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String regionidName;

  /**
   * 税种编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String taxdataidNumber;

  /**
   * 税种名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String taxdataidName;

  /**
   * 税务登记号
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String taxRegisterNo;

  /**
   * 状态,核准=1,禁用=2,未核准=0,已删除=3
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer usedStatus;

  /**
   * 版本
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer version;

  /**
   * 生效状态,暂存=1,生效=2
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer effectedStatus;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String mnemonicCode;

  /**
   * 外文名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String foreignName;

  /**
   * 地址
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String address;

  /**
   * 税率
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private BigDecimal taxRate;

  /**
   * 是否为多页签复制
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer isMultiCopy;

  /**
   * 是否承运商
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer isCarrier;

  /**
   * 委外商
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer isOuter;

  /**
   * 旧编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String oldNumber;

  /**
   * 拼音名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String namePinYin;

  /**
   * 拼音简称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String nameShortPinYin;

  /**
   * 纳税人类型,=-1,一般纳税人=0,小规模纳税人=1
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer taxPayerType;

  /**
   * 公司=0,利润中心=1
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Integer internalSupplierType;

  /**
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String internalProfitCenterNumber;

  /**
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String internalProfitCenterName;

  /**
   * 管理组织编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String admincuidNumber;

  /**
   * 管理组织名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String admincuidName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String controlUnitidNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String controlUnitidName;

  /**
   * 名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String supplierName;

  /**
   * 编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String supplierNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String simpleName;

  /**
   * 往来单位id
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Long erpCompanyId;

  /**
   * 创建人编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String creatoridNumber;

  /**
   * 创建人名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String creatoridName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String lastUpdateUseridNumber;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-12 16:21:44
   */
  private String lastUpdateUseridName;
}
