/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.person.bo;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class EasPersonInfoBO implements Serializable {

  /**
   * 
   */
  private String userNumber;

  /**
   * 
   */
  private String orgNumber;

}
