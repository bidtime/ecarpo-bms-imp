/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.supplier.dto;

import java.util.List;

import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.bms.eas.supplier.supplierbank.dto.SaveSupplierBankDTO;
import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SaveSupplierOtherInfo extends InsertDTO {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 更新或者新增标识(controller 中手动赋值) 1 == 更新,0==新增
   */
  private Integer insertOrUpdateFlag;

  /******************** 供应商对应银行信息 ***********************/
  List<SaveSupplierBankDTO> banks;

  /******************** 供应商对应分组信息 ***********************/
  List<SaveGroupDTO> groups;

  /******************** 供应商分配信息 ***********************/
  List<SaveOrgRangeDTO> orgRanges;

}
