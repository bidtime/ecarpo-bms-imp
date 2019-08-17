/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.ecarpo.bms.eas.server.data.EASInsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class DmsHisRepairOrderProductInsertDTO extends EASInsertDTO {
  /**
   * @mbg.generated 2019-08-06 10:33:34
   */
  //private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  //private Integer store_id;

  /**
   * 工单号
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  @NotBlank(message = "工单号不能为空")
  private String order_no;

  /**
   * 配件编码
   *
   * @mbg.generated 2019-08-06 10:33:34
   */
  @NotBlank(message = "配件编码不能为空")
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
  @NotBlank(message = "修理工不能为空")
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
