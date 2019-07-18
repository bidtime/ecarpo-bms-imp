/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.usermenu.entity;

import com.ecarpo.framework.common.annotation.InitialField;
import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_user_menu
 *
 * @mbg.generated 2017-10-09 10:42:57
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApUserMenuDO extends DataEntity {

  /**
   * 用户菜单id
   *
   * @mbg.generated 2017-10-09 10:42:57
   */
  @PKField
  private Long userMenuId;

  /**
   * 模块id
   *
   * @mbg.generated 2017-10-09 10:42:57
   */
  private Long productId;

  /**
   * 用户id
   *
   * @mbg.generated 2017-10-09 10:42:57
   */
  private Long userId;

  /**
   * 菜单id
   *
   * @mbg.generated 2017-10-09 10:42:57
   */
  private Long menuId;

  /**
   * 手工标识: 0:默认, 1:增加
   *
   * @mbg.generated 2017-10-09 10:42:57
   */
  private Integer manualFlag = 1;

  /**
   * authCode: 0: none, 1: user, 2: org, 3: group
   */
  @InitialField("0")
  private Integer authCode;

}
