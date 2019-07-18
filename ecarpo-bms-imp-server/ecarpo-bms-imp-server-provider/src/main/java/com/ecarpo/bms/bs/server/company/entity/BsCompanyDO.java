/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.company.entity;

import java.math.BigDecimal;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table bs_company
 *
 * @mbg.generated 2017-07-17 18:06:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BsCompanyDO extends DataEntity {

  /**
   * 往来单位id
   *
   * @mbg.generated 2017-07-17 18:06:53
   */
  @PKField
  private Long companyId;

  /**
   * 集团id
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long groupId;

  /**
   * 组织id
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long orgId;

  /**
   * 上级id
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long parentId;

  /**
   * 往来单位代码
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String companyCode;

  /**
   * 往来单位名称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String companyName;

  /**
   * 往来单位全称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String companyFullName;

  /**
   * 往来单位简码
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String shortCode;

  /**
   * 单位类型字典id
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long typeId;

  /**
   * 单位类型字典名称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String typeName;

  /**
   * 行政区划id，省
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long provinceId;

  /**
   * 行政区划id，市
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long cityId;

  /**
   * 行政区划id，区
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private Long districtId;

  /**
   * 行政区划id，省名称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String provinceName;

  /**
   * 行政区划id，市名称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String cityName;

  /**
   * 行政区划id，区名称
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String districtName;

  /**
   * 往来单位地址
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String addr;

  /**
   * 经度
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private BigDecimal longitude;

  /**
   * 纬度
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private BigDecimal latitude;

  /**
   * 联系人
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String contactPerson;

  /**
   * 联系方式
   *
   * @mbg.generated 2017-07-17 18:06:54
   */
  private String contactWay;
}
