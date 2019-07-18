/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.supplierbank.dto;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class SaveSupplierBankDTO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 供应商id
   *
   * @mbg.generated 2019-06-05 13:35:59
   */
  private String supplierId;

  /**
   * 开户银行
   *
   * @mbg.generated 2019-06-05 13:35:59
   */
  @JSONField(name = "bank")
  private String bank;

  /**
   * 银行帐号
   *
   * @mbg.generated 2019-06-05 13:35:59
   */
  @JSONField(name = "bankAccount")
  private String bankAccount;
  
}
