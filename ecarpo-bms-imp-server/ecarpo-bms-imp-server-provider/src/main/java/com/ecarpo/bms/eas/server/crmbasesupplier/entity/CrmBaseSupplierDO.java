/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntityInteger;
import com.ecarpo.framework.common.annotation.InitialField;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_base_supplier
 *
 * @mbg.generated 2019-08-05 16:24:17
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmBaseSupplierDO extends MyEntityInteger {

  /**
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer store_id;

  /**
   * 供货商的dealer_id
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer supplier_store_id;

  /**
   * 供货商名称
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String name;

  /**
   * 供货商编码（唯一）
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String code;

  /**
   * 手机
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private String tel;

  /**
   * 电话
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private String mobile;

  /**
   * 传真
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String fax;

  /**
   * 邮箱
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String mail;

  /**
   * 加入日期
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private Date cdate;

  /**
   * 邮政编码
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String postcode;

  /**
   * 网址
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String website;

  /**
   * 联系人
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String linkman;

  /**
   * 所属行业
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer business_id;

  /**
   * 工商注册号
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String business_num;

  /**
   * 法定代表人
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String boss;

  /**
   * 省
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer province;

  /**
   * 市
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer city;

  /**
   * 地址
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private String address;

  /**
   * 开户银行
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String bank;

  /**
   * 银行账号
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private String account;

  /**
   * 开业日期
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private Date open_date;

  /**
   * 经营范围
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  @InitialField
  private String business_scope;

  /**
   * 应付款
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private BigDecimal payable;

  /**
   * 累计应付款
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private BigDecimal acc_payable;

  /**
   * 累计付款
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private BigDecimal acc_payment;

  /**
   * 备注
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  //private String remark;

  /**
   * 状态
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer status;

  /**
   * 删除状态（1已删2未删）
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  //private Integer is_del;

  /**
   * 供应商类型：1集团统采，2协议供货商，3临时采购
   *
   * @mbg.generated 2019-08-05 16:24:17
   */
  private Integer type;
}
