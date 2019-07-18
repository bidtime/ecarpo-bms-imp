/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgrange.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/13
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasOrgRangeDO extends DataEntity {

  /**
   * EAS供应商分配组织id
   *
   * @mbg.generated 2019-06-13 16:36:30
   */
  @PKField
  private Long easOrgRangeId;

  /**
   * 关联id
   *
   * @mbg.generated 2019-06-13 16:36:30
   */
  private String linkedId;

  /**
   * 分配组织编码
   *
   * @mbg.generated 2019-06-13 16:36:30
   */
  private String assignNumber;

  /**
   * 分配组织名称
   *
   * @mbg.generated 2019-06-13 16:36:30
   */
  private String assignName;
}
