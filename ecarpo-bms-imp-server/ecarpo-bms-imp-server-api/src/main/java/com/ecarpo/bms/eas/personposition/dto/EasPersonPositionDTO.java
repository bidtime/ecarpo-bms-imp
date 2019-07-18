/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.personposition.dto;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.28
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasPersonPositionDTO extends InsertDTO {


  /**
   * 是否主要职位 传递0或1
   *
   * @mbg.generated 2019-06-10 10:14:38
   */
  private Integer isPrimary;

  @JSONField(name = "position_name")
  private String positionName;

  @JSONField(name = "position_number")
  private String positionNumber;
}
