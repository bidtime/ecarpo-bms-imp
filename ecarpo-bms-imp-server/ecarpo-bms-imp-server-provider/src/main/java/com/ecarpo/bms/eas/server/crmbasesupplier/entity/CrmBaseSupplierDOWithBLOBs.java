/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_base_supplier
 *
 * @mbg.generated 2019-07-23 10:52:27
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmBaseSupplierDOWithBLOBs extends CrmBaseSupplierDO {
    /**
     * 经营范围
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String businessScope;

    /**
     * 备注
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    //private String remark;
}