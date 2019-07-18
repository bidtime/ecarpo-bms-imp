/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.group.entity;

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
public class EasGroupDO extends DataEntity {

  /**
   * EAS供应商分类id
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  @PKField
  private Long easGroupId;

  /**
   * 关联id
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String linkedId;

  /**
   * 供应商分类名称
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String groupName;

  /**
   * 供应商分类编码
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String groupNumber;

  /**
   * 供应商分类标准名称
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String standardName;

  /**
   * 供应商分类标准编码
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String standardNumber;

  /**
   * 分类等级
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private Integer groupLevel;
}
