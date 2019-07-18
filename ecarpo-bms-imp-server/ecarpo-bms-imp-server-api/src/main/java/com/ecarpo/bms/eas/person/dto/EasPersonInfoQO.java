/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.person.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class EasPersonInfoQO implements Serializable {

  /**
   * 人员id
   */
  private Long userId;

  /**
   * 组织id
   */
  private Long orgId;

}
