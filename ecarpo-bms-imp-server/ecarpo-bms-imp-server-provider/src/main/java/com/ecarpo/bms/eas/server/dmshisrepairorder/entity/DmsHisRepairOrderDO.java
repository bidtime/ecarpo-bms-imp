/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_his_repair_order
 *
 * @mbg.generated 2019-08-06 10:15:30
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsHisRepairOrderDO extends MyEntity {

  /**
   * @mbg.generated 2019-08-06 10:15:30
   */
  private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private Integer store_id;

  /**
   * 工单号
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String order_no;

  /**
   * 维修类型
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String repair_type;

  /**
   * 客户姓名
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String custom_name;

  /**
   * 客户电话
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String custom_mobile;

  /**
   * 维修日期
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private Date repair_time;

  /**
   * 车牌号
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String plate_no;

  /**
   * 车型名称
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String model_name;

  /**
   * 行驶里程
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private Integer mileage;

  /**
   * 服务顾问
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private String consultant_name;

  /**
   * 配件款
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private BigDecimal product_money;

  /**
   * 工时款
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private BigDecimal workhour_money;

  /**
   * 套餐费
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private BigDecimal package_money;

  /**
   * 附加费
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private BigDecimal additional_money;

  /**
   * 总计费用
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private BigDecimal total_discount;

  /**
   * 预计交车日期
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  private Date predict_date;

  /**
   * 数据导入时间
   *
   * @mbg.generated 2019-08-06 10:15:30
   */
  //private Date create_time;

}
