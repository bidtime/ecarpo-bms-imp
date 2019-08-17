/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.entity;

import java.math.BigDecimal;

import com.ecarpo.bms.eas.server.data.MyEntityDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_repair_workhour
 *
 * @mbg.generated 2019-08-06 11:17:53
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsRepairWorkhourDO extends MyEntityDate {
  /**
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer store_id;

  /**
   * 工时编码
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private String workhour_code;

  /**
   * 工时名称
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private String workhour_name;

  /**
   * 考核工时
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private BigDecimal review_workhour;

  /**
   * 考核单价
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private BigDecimal review_price;

  /**
   * 额定工时
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private BigDecimal rated_workhour;

  /**
   * 额定单价
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private BigDecimal rated_price;

  /**
   * 是否通用
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer is_universal;

  /**
   * 是否优惠
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer is_discount;

  /**
   * 是否是钣金项目
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer is_sheetmetal;

  /**
   * 检索码
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private String retrieval_code;

  /**
   * 状态
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  //private Integer state;

  /**
   * 工时等级
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private String workhour_level;

  /**
   * 创建人
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  //private Integer creator;

  /**
   * 创建时间
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  //private Date create_time;

  /**
   * 是否洗车(0否1是)
   *
   * @mbg.generated 2019-08-06 11:17:53
   */
  private Integer is_wash_car;
  
  @Override
  public void setState(Integer state) {
    if (state == null) {
      this.state = 0;
    } else {
      this.state = (state == 1) ? 0 : 1;
    }
  }

}
