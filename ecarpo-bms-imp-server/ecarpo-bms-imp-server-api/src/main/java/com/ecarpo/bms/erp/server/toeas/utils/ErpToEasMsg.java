/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.utils;

import java.io.Serializable;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasMsg implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 接口返回   1 == 成功   0 == 失败
   */
  private Integer flag;
  
  /**
   * 接口返回信息
   */
  private String msg;
  

}
