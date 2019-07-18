/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.group.dto;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class SaveGroupDTO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 关联id
   *
   * @mbg.generated 2019-06-13 16:35:36
   */
  private String linkedId;

  /**
   * 供应商分类名称
   *
   * @mbg.generated 2019-06-05 13:37:09
   */
  @JSONField(name = "group_name")
  private String groupName;

  /**
   * 供应商分类编码
   *
   * @mbg.generated 2019-06-05 13:37:09
   */
  @JSONField(name = "group_number")
  private String groupNumber;

  /**
   * 供应商分类标准名称
   *
   * @mbg.generated 2019-06-05 13:37:09
   */
  @JSONField(name = "standard_name")
  private String standardName;

  /**
   * 供应商分类标准编码
   *
   * @mbg.generated 2019-06-05 13:37:09
   */
  @JSONField(name = "standard_number")
  private String standardNumber;

  /**
   * 分类等级
   *
   * @mbg.generated 2019-06-05 13:37:09
   */
  @JSONField(name = "group_level")
  private Integer groupLevel;

}
