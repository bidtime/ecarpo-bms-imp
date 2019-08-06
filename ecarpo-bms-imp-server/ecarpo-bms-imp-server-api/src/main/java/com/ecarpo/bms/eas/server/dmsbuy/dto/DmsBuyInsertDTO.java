/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.dto;

import java.util.Date;

import com.ecarpo.framework.common.annotation.InitialValue;
import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class DmsBuyInsertDTO extends InsertDTO {

  /**
   * @mbg.generated 2019-08-06 13:41:54
   */
  //private Integer id;

  /**
   * 采购单编号
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String buy_number;

  /**
   * 经销商id
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer store_id;

  /**
   * 客户名称
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String contact_name;

  /**
   * 客户电话
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String contact_phone;

  /**
   * 采购类型，关联类型表
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer buy_type_id;

  /**
   * 供货商id
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer supplier_id;

  /**
   * 要求到货日期
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String require_reach_date;

  /**
   * 结算方式，1现结，2挂账
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer act_type;

  /**
   * 是否代销，0否1是
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer is_sale_proxy;

  /**
   * 结算人
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String act_name;

  /**
   * 创建人
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  //private Integer creator;

  /**
   * 创建时间
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  //private Date c_time;

  /**
   * 入库人
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer buyer_id;

  /**
   * 入库时间
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Date buy_time;

  /**
   * 执行人
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer executor;

  /**
   * 执行时间
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Date exec_time;

  /**
   * 收银员
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer cashier;

  /**
   * 收银时间
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Date cashier_time;

  /**
   * 发票号
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String receipts_no;

  /**
   * 采购单状态，1未执行，2待付款，3待入库，4已完成，5作废
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  @InitialValue(value = "3")
  private Integer status;

  /**
   * 原采购计划单号
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String app_number;

  /**
   * 来源属性（1采购计划申请/2订单补采购/3采购单1-1-3-2/4直接入库）
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  @InitialValue(value = "1")
  private String generate_from;

  /**
   * 原始单据号码
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String original_number;

  /**
   * 配送地址
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String delivery_address;

  /**
   * 配送方式ID（关联ym_dms_purchase_delivery_way中的ID）
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private Integer delivery_way_id;

  /**
   * 收件人姓名
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String recipient_name;

  /**
   * 收件人电话
   *
   * @mbg.generated 2019-08-06 13:41:54
   */
  private String recipient_mobile;

  /**
   * @mbg.generated 2019-08-06 13:41:54
   */
  //private String desc;
}
