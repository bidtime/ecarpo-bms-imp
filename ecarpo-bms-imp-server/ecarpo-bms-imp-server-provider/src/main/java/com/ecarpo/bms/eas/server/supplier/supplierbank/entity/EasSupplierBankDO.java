/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.supplierbank.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/05
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasSupplierBankDO extends DataEntity {

  /**
   * EAS 供应商对接银行id
   *
   * @mbg.generated 2019-06-05 15:26:02
   */
  @PKField
  private Long bankId;

  /**
   * 供应商id
   *
   * @mbg.generated 2019-06-05 15:26:02
   */
  private String supplierId;

  /**
   * 开户银行
   *
   * @mbg.generated 2019-06-05 15:26:02
   */
  private String bank;

  /**
   * 银行帐号
   *
   * @mbg.generated 2019-06-05 15:26:02
   */
  private String bankAccount;
}
