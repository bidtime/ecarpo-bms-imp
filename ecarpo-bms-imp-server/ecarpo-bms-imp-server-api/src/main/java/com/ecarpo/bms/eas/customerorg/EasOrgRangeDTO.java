/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.customerorg;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasOrgRangeDTO extends InsertDTO {

  /**
   * id
   *
   * @mbg.generated 2019-06-10 10:23:36
   */
  private String id;

  /**
   * 用户id
   *
   * @mbg.generated 2019-06-10 10:23:36
   */
  private String userId;

  /**
   * 组织
   *
   * @mbg.generated 2019-06-10 10:23:36
   */
  private String orgId;

  /**
   * 类型
   *
   * @mbg.generated 2019-06-10 10:23:36
   */
  @JSONField(name = "typeId")
  private Integer typeId;
}
