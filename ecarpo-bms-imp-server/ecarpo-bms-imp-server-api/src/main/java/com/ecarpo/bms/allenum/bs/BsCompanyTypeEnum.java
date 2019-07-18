/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.allenum.bs;

import com.ecarpo.framework.constant.EnumSource;

/**
 * @author guanzhongxuan
 * @since 2018.03.30
 */
public enum BsCompanyTypeEnum implements EnumSource<Long> {

  SUPPLIER(100043L, "供应商"), // NL
  HOSTPLANT(100044L, "主机厂"), // NL
  INSURANCE(100045L, "保险公司"), // NL
  FI(100062L, "金融公司"), // NL
  SPAREPART(100063L, "备件供应商"), // NL
  BANK(100064L, "银行"), // NL
  GUARANTEE(100065L, "担保公司"), // NL
  FE(100066L, "延保公司");

  private Long value;

  private String name;

  private BsCompanyTypeEnum(Long value, String name) {
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
  private static BsCompanyTypeEnum getByValue(Long value) {
    if (value == null) {
      return null;
    }
    for (BsCompanyTypeEnum e : BsCompanyTypeEnum.values()) {
      if (e.getValue().equals(value)) {
        return e;
      }
    }
    return null;
  }

  public static String getName(Long idx) {
    BsCompanyTypeEnum e = getByValue(idx);
    if (e == null) {
      return null;
    } else {
      return e.getName();
    }
  }

  public boolean equals(Long n) {
    return this.value.equals(n);
  }
}
