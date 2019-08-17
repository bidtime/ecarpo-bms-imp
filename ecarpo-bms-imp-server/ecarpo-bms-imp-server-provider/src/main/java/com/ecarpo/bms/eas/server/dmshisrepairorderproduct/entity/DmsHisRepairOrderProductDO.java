/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntityInteger;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_his_repair_order_product
 *
 * @mbg.generated 2019-08-06 10:33:34
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsHisRepairOrderProductDO extends MyEntityInteger {
  /**
   * @mbg.generated 2019-08-06 10:33:34
   */
  private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private Integer store_id;

  /**
   * 工单号
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String order_no;

  /**
   * 配件编码
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String product_code;

  /**
   * 配件名称
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String product_name;

  /**
   * 规格型号
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String product_model;

  /**
   * 单价
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private BigDecimal product_price;

  /**
   * 小计
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private BigDecimal product_amount;
  
  private BigDecimal product_num;

  /**
   * 修理工
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String worker_name;

  /**
   * 操作人
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private String dispatcher;

  /**
   * 操作时间
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  private Date oper_time;

  /**
   * 数据导入时间
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  //private Date create_time;
}
