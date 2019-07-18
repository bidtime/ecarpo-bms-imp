/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.allenum.bs;

import org.apache.commons.lang3.StringUtils;

import com.ecarpo.framework.constant.EnumSource;

/**
 * BooleanEnum
 * 
 * @author Jades.He
 * @since 2017.07.12
 */
public enum BooleanEnum implements EnumSource<Integer> {
  TRUE(1, "是"), // 
  FALSE(0, "否");

  private Integer value;

  private String name;

  private BooleanEnum(Integer value, String name) {
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

  public static boolean getTrue(Number value) {
    return (value != null && value.equals(TRUE.value)) ? true : false;
  }

  public static boolean getFalse(Number value) {
    return (value != null && value.equals(FALSE.value)) ? true : false;
  }

  /**
   * Get enum by enum value.
   * 
   * @param value
   * @return enum
   */
  public static BooleanEnum getByValue(Integer value) {
    if (value == null) {
      return null;
    }
    for (BooleanEnum e : BooleanEnum.values()) {
      if (e.getValue().equals(value)) {
        return e;
      }
    }
    return null;
  }

  public static BooleanEnum getByName(String name) {
    if (StringUtils.isBlank(name)) {
      return null;
    }
    for (BooleanEnum e : BooleanEnum.values()) {
      if (e.getName().equals(name)) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Integer idx) {
    BooleanEnum e = getByValue(idx);
    if (e == null) {
      return null;
    } else {
      return e.getName();
    }
  }

  /**
   * 根据name获取id
   * 
   * @param name
   * @return
   * @author mgz
   * @since 2018年2月28日
   */
  public static Integer getValueByName(String name) {
    BooleanEnum e = getByName(name);
    if (e == null) {
      return 0;
    } else {
      return e.getValue();
    }
  }

  /**
   * 根据boolean获取value
   * 
   * @param bl
   * @return
   * @author guanzhongxuan
   * @since 2018.07.13
   */
  public static Integer getValueByEnum(Boolean bl) {
    if (bl) {
      return BooleanEnum.TRUE.getValue();
    } else {
      return BooleanEnum.FALSE.getValue();
    }
  }

  public boolean equals(Integer n) {
    return this.value.equals(n);
  }

  /**
   * 判断是否购买衍生,有购买衍生，返回true 否则 false
   * 
   * @param values
   * @return
   * @author xinbeibei
   * @since 2018.07.07
   */
  public static boolean validApvState(Integer... values) {
    for (Integer value : values) {
      if (TRUE.equals(value)) {
        return true;
      }
    }
    return false;
  }

}
