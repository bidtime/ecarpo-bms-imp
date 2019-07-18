/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.enumbean;

import com.ecarpo.framework.constant.EnumSource;

/**
 * 
 * @author xinbeibei
 * @since 2019.05.28
 */
public enum ErpToEasOperTypeEnum implements EnumSource<Integer> {
  // oper类型: 1:insert 0: update
  
  UPDATE(0, "更新"), 
  INSERT(1, "新建");

  private Integer value;

  private String name;

  private ErpToEasOperTypeEnum(Integer value, String name) {
    this.value = value;
    this.name = name;
  }

  @Override
  public Integer getValue() {
    return this.value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Get enum by enum value.
   * 
   * @param value
   * @return enum
   */
  private static ErpToEasOperTypeEnum getByValue(Integer value) {
    if (value == null) {
      return null;
    }
    for (ErpToEasOperTypeEnum e : ErpToEasOperTypeEnum.values()) {
      if (e.getValue().equals(value)) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Integer idx) {
    ErpToEasOperTypeEnum e = getByValue(idx);
    if (e == null) {
      return null;
    } else {
      return e.getName();
    }
  }

  public boolean equals(Integer n) {
    return this.value.equals(n);
  }

}
