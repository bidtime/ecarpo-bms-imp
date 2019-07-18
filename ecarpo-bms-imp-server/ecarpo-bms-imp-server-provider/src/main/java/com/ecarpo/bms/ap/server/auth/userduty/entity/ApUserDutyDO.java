/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userduty.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mgz
 * @since 2017年7月18日
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApUserDutyDO extends DataEntity {

  /**
   * 用户岗位id
   *
   * @mbg.generated 2017-07-12 23:15:38
   */
  @PKField
  private Long userDutyId;

  /**
   * 用户id
   *
   * @mbg.generated 2017-07-12 23:15:38
   */
  private Long userId;

  /**
   * 部门id
   *
   * @mbg.generated 2017-07-12 23:15:38
   */
  private Long dutyId;

}
