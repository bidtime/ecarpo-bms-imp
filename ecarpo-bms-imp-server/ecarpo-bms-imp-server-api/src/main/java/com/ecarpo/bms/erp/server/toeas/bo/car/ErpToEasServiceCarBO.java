/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.bo.car;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasServiceCarBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 行政组织编码
   */
  private String orgUnit;

  /**
   * 人员编码
   */
  private String person;

  /**
   * 转入服务日期
   */
  private Date serviceDate;

}
