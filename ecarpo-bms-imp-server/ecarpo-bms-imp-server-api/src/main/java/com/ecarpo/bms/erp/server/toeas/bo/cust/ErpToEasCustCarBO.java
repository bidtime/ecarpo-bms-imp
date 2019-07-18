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
public class ErpToEasCustCarBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 车辆档案Id
   */
  private Long carId;

  /**
   * 车型
   */
  private Long carTypeId;

  /**
   * 当前公司
   */
  private String companyNumber;

}
