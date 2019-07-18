/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.orgrange.dto;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class SaveOrgRangeDTO implements Serializable {

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
   * 分配组织编码
   *
   * @mbg.generated 2019-06-05 14:41:07
   */
  @JSONField(name = "assign_number")
  private String assignNumber;

  /**
   * 分配组织名称
   *
   * @mbg.generated 2019-06-05 14:41:07
   */
  @JSONField(name = "assign_name")
  private String assignName;
  
}
