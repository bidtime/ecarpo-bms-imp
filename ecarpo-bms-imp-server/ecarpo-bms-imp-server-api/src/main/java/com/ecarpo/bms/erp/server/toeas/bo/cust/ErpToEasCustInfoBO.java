/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.bo.cust;

import java.io.Serializable;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasCustInfoBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 客户名称
   *
   * @mbg.generated 2018-03-20 16:21:13
   */
  private String custName;
  
  /**
   * 手机（主联系方式）
   *
   * @mbg.generated 2018-03-20 16:21:13
   */
  private String mobile;
  
  
}
