/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.dto;

import java.math.BigDecimal;

import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class DmsBuyDetailUpdateDTO extends UpdateDTO {
  /**
   * @mbg.generated 2019-08-06 13:48:14
   */
  private Integer id;

  /**
   * @mbg.generated 2019-08-06 13:48:14
   */
  //private Integer store_id;

  /**
   * 采购单编号，关联dms_buy表中的buy_number
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private String buy_number;

  /**
   * 产品id
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  //private Integer product_id;
  
  private String product_code;

  /**
   * 含税成本价
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private BigDecimal cost_price;

  /**
   * 无税成本价
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private BigDecimal cost_price_notax;

  /**
   * 采购数量
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private BigDecimal buy_count;

  /**
   * 采购价格浮动率
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private Integer add_rate;

  /**
   * 含税金额
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private BigDecimal amount;

  /**
   * 不含税金额
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private BigDecimal amount_notax;

  /**
   * 库房id
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  //private Integer location_id;
  
  private String location_code;

  /**
   * 货位名称
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private String location_name;

  /**
   * 添加时间
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  //private Integer c_time;

  /**
   * 处理状态
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  private Integer status;

  /**
   * 描述
   *
   * @mbg.generated 2019-08-06 13:48:14
   */
  //private String desc;
}
