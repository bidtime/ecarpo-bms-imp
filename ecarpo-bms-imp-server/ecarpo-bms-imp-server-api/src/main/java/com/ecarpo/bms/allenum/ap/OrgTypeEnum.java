/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.allenum.ap;

/**
 * Created by jss on 2016/03/28.
 */
public enum OrgTypeEnum {
  NONE(0, "N/A"), // NL
  AP(1, "平台"), // NL
  GROUP(2, "集团"), // NL
  DEALER(3, "经销商");

  OrgTypeEnum(Integer state, String stateName) {
    this.state = state;
    this.stateName = stateName;
  }

  protected Integer state;

  protected String stateName;

  public static String getNameOrg(Integer idx) {
    return getName(idx, "组织");
  }

  public static String getNameUser(Integer idx) {
    return getName(idx, "用户");
  }

  public static String getName(Integer idx, String ext) {
    String name = getName(idx);
    if (name == null || name.length() == 0) {
      return null;
    } else {
      return name + ext;
    }
  }

  public static String getName(Integer idx) {
    if (idx == null) {
      return null;
    }
    for (OrgTypeEnum c : OrgTypeEnum.values()) {
      if (c.getState() == idx) {
        return c.getStateName();
      }
    }
    return null;
  }

  public static OrgTypeEnum getEnum(Integer idx) {
    if (idx == null) {
      return null;
    }
    for (OrgTypeEnum c : OrgTypeEnum.values()) {
      if (c.getState() == idx) {
        return c;
      }
    }
    return null;
  }

  public int getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public static boolean isDealer(Integer orgType) {
    return (orgType != null && orgType == DEALER.getState()) ? true : false;
  }

  public static boolean isAP(Integer orgType) {
    return (orgType != null && orgType == AP.getState()) ? true : false;
  }

  /**
   * 是否为集团
   * 
   * @param orgType
   * @return
   * @author mgz
   * @since 2018.07.20
   */
  public static boolean isGroup(Integer orgType) {
    return (orgType != null && orgType == GROUP.getState()) ? true : false;
  }

}
