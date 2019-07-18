/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customerorg.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/10
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasCustomerOrgDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @mbg.generated 2019-07-11 14:21:00
   */
  @PKField
  private Long easUserOrgId;

  /**
   * 组织
   *
   * @mbg.generated 2019-07-11 14:21:00
   */
  private String orgId;

  /**
   * 类型
   *
   * @mbg.generated 2019-07-11 14:21:00
   */
  private Integer typeId;

  /**
   * 是否包含下级
   *
   * @mbg.generated 2019-07-11 14:21:00
   */
  private Integer isIncludeSubOrg;

  /**
   * id
   *
   * @mbg.generated 2019-07-11 14:21:00
   */
  private String id;

  /**
   * 用户id
   *
   * @mbg.generated 2019-07-11 14:21:00
   */
  private String userId;
}
