/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.allenum.ap;

import org.apache.commons.lang3.StringUtils;

import com.ecarpo.framework.constant.EnumSource;

/**
 * @author mgz
 * @since 2017年10月9日
 */
public enum ApSexEnum implements EnumSource<Long> {
  // 性别, 1: 男, 2: 女，, 3:保密
  MALE(100001L, "男"), // NL
  FEMALE(100002L, "女"), // NL
  SECRECY(100003L, "保密");

  private Long value;

  private String name;

  private ApSexEnum(Long value, String name) {
    this.value = value;
    this.name = name;
  }

  @Override
  public Long getValue() {
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
  private static ApSexEnum getByValue(Long value) {
    if (value == null) {
      return null;
    }
    for (ApSexEnum e : ApSexEnum.values()) {
      if (value.equals(e.getValue())) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Long idx) {
    ApSexEnum e = getByValue(idx);
    if (e == null) {
      return null;
    } else {
      return e.getName();
    }
  }
  
  
  
  public static Long getValueByName(String name) {
    ApSexEnum e = getByName(name);
    if (e == null) {
      return null;
    } else {
      return e.getValue();
    }
  }
  
  public static ApSexEnum getByName(String name) {
    if (StringUtils.isBlank(name)) {
      return null;
    }
    for (ApSexEnum e : ApSexEnum.values()) {
      if (e.getName().equals(name)) {
        return e;
      }
    }
    return null;
  }
}
