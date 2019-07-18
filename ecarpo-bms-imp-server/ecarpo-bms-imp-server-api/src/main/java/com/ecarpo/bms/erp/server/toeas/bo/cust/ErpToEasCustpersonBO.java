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
public class ErpToEasCustpersonBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 联系人姓名
   */
  private String person;

  /**
   * 联系人电话
   */
  private String phone;

  /**
   * 主要联系人
   */
  private Integer main;

}
