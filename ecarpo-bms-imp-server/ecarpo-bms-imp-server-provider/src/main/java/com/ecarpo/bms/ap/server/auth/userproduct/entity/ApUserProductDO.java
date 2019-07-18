/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_user_menu
 *
 * @mbg.generated 2017-07-12 23:44:00
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApUserProductDO extends DataEntity {

  /**
   * 岗位菜单id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  @PKField
  private Long userProductId;

  /**
   * 模块id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  private Long productId;

  /**
   * 用戶id
   *
   * @mbg.generated 2017-07-12 23:44:00
   */
  private Long userId;

}
