/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutymenu.entity;

import com.ecarpo.framework.common.annotation.InitialField;
import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_duty_menu
 *
 * @mbg.generated 2017-07-12 23:44:00
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApDutyMenuDO extends DataEntity {

  /**
   * 岗位菜单id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  @PKField
  private Long dutyMenuId;

  /**
   * 模块id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  private Long productId;

  /**
   * 岗位id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  private Long dutyId;

  /**
   * 菜单id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  private Long menuId;

  /**
   * auth: 0: none , 1: user , 2: org , 3: group
   *
   * @mbg.generated 2017-08-08 11:29:56
   */
  @InitialField("0")
  private Integer authCode;

}
