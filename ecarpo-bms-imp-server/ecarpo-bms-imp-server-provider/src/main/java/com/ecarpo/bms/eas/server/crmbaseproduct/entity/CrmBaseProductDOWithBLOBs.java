/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_base_product
 *
 * @mbg.generated 2019-07-23 10:54:49
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmBaseProductDOWithBLOBs extends CrmBaseProductDO {
    /**
     * 产品描述
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    private String desc;

    /**
     * 产品备注
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    //private String remark;
}