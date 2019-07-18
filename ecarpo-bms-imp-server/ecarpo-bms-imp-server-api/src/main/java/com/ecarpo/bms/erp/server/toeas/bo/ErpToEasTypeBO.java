/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.bo;

import java.io.Serializable;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasTypeBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 业务系统品牌id
   */
  private Long brandId;

  /**
   * 车系id
   */
  private Long carserialId;

  /**
   * 车型id
   */
  private Long carTypeId;

  /**
   * 名称
   */
  private String carTypeName;
}
