/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.entity;

import java.math.BigDecimal;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_finance_client
 *
 * @mbg.generated 2019-08-06 09:09:27
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsFinanceClientDO extends MyEntity {

  /**
   * @mbg.generated 2019-08-06 09:09:27
   */
  private Integer id;

  /**
   * @mbg.generated 2019-08-06 09:09:27
   */
  private Integer store_id;

  /**
   * 客户编码
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String client_code;

  /**
   * 客户名称
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String client_name;

  /**
   * 客户简称
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String short_name;

  /**
   * 客户检索码
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String retrieval_code;

  /**
   * 地址
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String address;

  /**
   * 邮政编码
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String postcode;

  /**
   * 省ID
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private Integer prov;

  /**
   * 市ID
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private Integer city;

  /**
   * 电话
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String phone;

  /**
   * 传真
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String fax;

  /**
   * 工商注册地
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String register_address;

  /**
   * 实际办公地
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String work_address;

  /**
   * 工商注册号
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String business_register;

  /**
   * 税务登记号
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String tax_register;

  /**
   * 财务联系人
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String finance_name;

  /**
   * 财务联系人电话
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String finance_phone;

  /**
   * 主联系人
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String main_name;

  /**
   * 主联系人电话
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String main_phone;

  /**
   * 主联系人职务
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String main_duty;

  /**
   * 备用联系人
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String reserve_name;

  /**
   * 备用联系人电话
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String reserve_phone;

  /**
   * 备用联系人职务
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String reserve_duty;

  /**
   * 账期
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String account_period;

  /**
   * 临时账期
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String temp_period;

  /**
   * 最大欠款额度
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private BigDecimal max_debt;

  /**
   * 临时额度
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private BigDecimal temp_debt;

  /**
   * 应收款
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private BigDecimal receivable;

  /**
   * 累计应收款
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private BigDecimal acc_receivable;

  /**
   * 累计收款
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private BigDecimal acc_receipt;

  /**
   * 状态
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private Integer status;

  /**
   * 创建人
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  //private Integer creator;

  /**
   * 创建时间
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  //private Date create_time;

  /**
   * 账户开户行
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String account_opener;

  /**
   * 账户名称
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String account_name;

  /**
   * 账号
   *
   * @mbg.generated 2019-08-06 09:09:27
   */
  private String account_num;
}
