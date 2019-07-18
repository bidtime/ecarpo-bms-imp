/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.org.entity;

import java.math.BigDecimal;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_org
 *
 * @mbg.generated 2017-07-19 15:28:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApOrgDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 组织id
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  @PKField
  private Long orgId;

  /**
   * 行政区划id，区
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private Long districtId;

  /**
   * 区域字典id
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private Long regionDicId;

  /**
   * 组织代码
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String orgCode;

  /**
   * 组织名称
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String orgName;

  /**
   * 组织全称
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String orgFullName;

  /**
   * 组织类型: 1: 集团; 2: 4S店
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private Integer orgType;

  /**
   * 经营范围
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String bizScope;

  /**
   * 地址
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String orgAddr;

  /**
   * 经度
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private BigDecimal longitude;

  /**
   * 纬度
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private BigDecimal latitude;

  /**
   * 联系人
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String contactPerson;

  /**
   * 联系电话
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String contactTel;

  /**
   * 行政区划id，省
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private Long provinceId;

  /**
   * 行政区划id，省名称
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String provinceName;

  /**
   * 行政区划id，市
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private Long cityId;

  /**
   * 行政区划id，市名称
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String cityName;

  /**
   * 行政区划id，区名称
   *
   * @mbg.generated 2017-07-19 15:28:53
   */
  private String districtName;

}
