/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_his_repair_order_workhours
 *
 * @mbg.generated 2019-08-06 10:39:52
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsHisRepairOrderWorkhoursDO extends MyEntity {
  /**
   * @mbg.generated 2019-08-06 10:39:52
   */
  private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private Integer store_id;

  /**
   * 工单号
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private String order_no;

  /**
   * 工时编码
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private String workhour_code;

  /**
   * 工时名称
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private String workhour_name;

  /**
   * 工时定额
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private BigDecimal rated_workhour;

  /**
   * 考核工时单价
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private BigDecimal work_price;

  /**
   * 修理工
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private String worker_name;

  /**
   * 操作人
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private Integer dispatcher;

  /**
   * 操作时间
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  private Date oper_time;

  /**
   * 数据导入时间
   *
   * @mbg.generated 2019-08-06 10:39:52
   */
  //private Date create_time;
}
