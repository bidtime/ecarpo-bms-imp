/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.duty.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_duty
 *
 * @mbg.generated 2017-12-07 09:07:38
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApDutyDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 岗位id
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  @PKField
  private Long dutyId;

  /**
   * 部门id
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Long departId;

  /**
   * 岗位类型id
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Long dutyTypeId;

  /**
   * 岗位code
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private String dutyCode;

  /**
   * 岗位名称
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private String dutyName;

  /**
   * 组织id
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Long orgId;

  /**
   * 从属类型: 1: 集团; 2: 店面
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Integer orgType;

  /**
   * 上级岗位id
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Long parentId;

  /**
   * 是否默认内置岗位
   *
   * @mbg.generated 2019-07-15 09:31:50
   */
  private Integer god;
}
