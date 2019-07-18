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
public class ErpToEasCustSalerBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 销售顾问
   */
  private String saler;

  /**
   * 公司
   */
  private String orgUnitNumber;

  /**
   * 品牌Id
   */
  private Long brandId;

}
