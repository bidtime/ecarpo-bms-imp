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
public enum ErpToEasStateEnum implements EnumSource<Integer> {
  // 传输标记(0:暂存,1:传输中,2:传输完成, 3:传输失败)
  
  ZC(0, "暂存"),
  CSZ(1, "传输中"), 
  CSWC(2, "传输完成"), 
  CSSB(3, "传输失败"),
  TS(4, "新增成功,保存失败");

  private Integer value;

  private String name;

  private ErpToEasStateEnum(Integer value, String name) {
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
  private static ErpToEasStateEnum getByValue(Integer value) {
    if (value == null) {
      return null;
    }
    for (ErpToEasStateEnum e : ErpToEasStateEnum.values()) {
      if (e.getValue().equals(value)) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Integer idx) {
    ErpToEasStateEnum e = getByValue(idx);
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
