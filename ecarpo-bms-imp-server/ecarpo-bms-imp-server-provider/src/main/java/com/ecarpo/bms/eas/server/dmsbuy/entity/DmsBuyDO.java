/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.entity;

import com.ecarpo.bms.eas.server.data.MyEntityInteger;
import com.ecarpo.framework.common.annotation.InitialField;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_buy
 *
 * @mbg.generated 2019-08-06 16:18:30
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsBuyDO extends MyEntityInteger {

  /**
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer id;

  /**
   * 采购单编号
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String buy_number;

  /**
   * 经销商id
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer store_id;

  /**
   * 客户名称
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String contact_name;

  /**
   * 客户电话
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String contact_phone;

  /**
   * 采购类型，关联类型表
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer buy_type_id;

  /**
   * 供货商id
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer supplier_id;

  /**
   * 要求到货日期
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String require_reach_date;

  /**
   * 结算方式，1现结，2挂账
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer act_type;

  /**
   * 是否代销，0否1是
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer is_sale_proxy;

  /**
   * 结算人
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String act_name;

  /**
   * 创建人
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  //private Integer creator;

  /**
   * 创建时间
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  //private Integer c_time;

  /**
   * 入库人
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer buyer_id;

  /**
   * 入库时间
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer buy_time;

  /**
   * 执行人
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer executor;

  /**
   * 执行时间
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer exec_time;

  /**
   * 收银员
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer cashier;

  /**
   * 收银时间
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer cashier_time;

  /**
   * 发票号
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String receipts_no;

  /**
   * 采购单状态，1未执行，2待付款，3待入库，4已完成，5作废
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  @InitialField(value="3")
  private Integer status;

  /**
   * @mbg.generated 2019-08-06 16:18:30
   */
  //private String desc;

  /**
   * 原采购计划单号
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String app_number;

  /**
   * 来源属性（1采购计划申请/2订单补采购/3采购单1-1-3-2/4直接入库）
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  @InitialField(value="1")
  private String generate_from;

  /**
   * 原始单据号码
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String original_number;

  /**
   * 配送地址
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String delivery_address;

  /**
   * 配送方式ID（关联ym_dms_purchase_delivery_way中的ID）
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private Integer delivery_way_id;

  /**
   * 收件人姓名
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String recipient_name;

  /**
   * 收件人电话
   *
   * @mbg.generated 2019-08-06 16:18:30
   */
  private String recipient_mobile;

}
