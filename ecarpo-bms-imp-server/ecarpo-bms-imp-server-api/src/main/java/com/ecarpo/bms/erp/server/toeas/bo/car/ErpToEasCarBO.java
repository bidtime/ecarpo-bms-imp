/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.bo.car;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasCarBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 车辆id
   */
  private Long carId;

  /**
   * 车架号
   */
  private String vin;

  /**
   * 车辆类型
   */
  private Long carTypeId;

  /**
   * 财务组织编码
   */
  private String company;

  /**
   * 客户编码
   */
  private String customer;

  /**
   * 关联售后信息
   */
  private List<ErpToEasServiceCarBO> services;
}
