/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.enumbean;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author xinbeibei
 * @since 2019.05.28
 */
public enum ErpToEasTableNameEnum implements Serializable {
  // name == 表名  ,  method == eas方法名称
  
  BRAND(0, "ap_car_brand","serBrand"),
  SERIE(1, "ap_car_serie","serSeries"),
  TYPE(2, "ap_car_type","serCarType"),
  CUST(3, "","serCustomer"),
  CAR(3, "","serVehicle"),
  
  
  ;

  private Integer value;

  private String name;
  
  private String method;

  private ErpToEasTableNameEnum(Integer value, String name,String method) {
    this.value = value;
    this.name = name;
    this.method = method;
  }

  public Integer getValue() {
    return this.value;
  }

  public String getName() {
    return this.name;
  }

  public String getMethod() {
    return this.method;
  }
  
  /**
   * Get enum by enum value.
   * 
   * @param value
   * @return enum
   */
  public static ErpToEasTableNameEnum getByValue(Integer value) {
    if (value == null) {
      return null;
    }
    for (ErpToEasTableNameEnum e : ErpToEasTableNameEnum.values()) {
      if (e.getValue().equals(value)) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Integer idx) {
    ErpToEasTableNameEnum e = getByValue(idx);
    if (e == null) {
      return null;
    } else {
      return e.getName();
    }
  }

  /**
   * 获取方法名称
   * 
   * @param name
   * @return
   * @author xinbeibei
   * @since 2019.06.03
   */
  public static String getMethod(String name) {
    if (StringUtils.isBlank(name)) {
      return null;
    }
    for (ErpToEasTableNameEnum e : ErpToEasTableNameEnum.values()) {
      if (e.getName().equals(name)) {
        return e.getMethod();
      }
    }
    return null;
  }
  
  
  
  public boolean equals(Integer n) {
    return this.value.equals(n);
  }

  public boolean equals(String name) {
    return this.name.equals(name);
  }
  
  
}
