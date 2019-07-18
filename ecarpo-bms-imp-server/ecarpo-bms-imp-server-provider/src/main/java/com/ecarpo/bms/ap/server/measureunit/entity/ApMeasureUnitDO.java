/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.measureunit.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/27
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApMeasureUnitDO extends DataEntity {
    /**
     * 计量单位id
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    @PKField
    private Long measureUnitId;

    /**
     * 计量单位编码
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private String measureUnitCode;

    /**
     * 计量单位名称
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private String measureUnitName;

    /**
     * 速记码
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private String shortCode;

    /**
     * 是否为基本单位
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private Integer baseUnit;

    /**
     * 数量精度
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private Integer qtyPrecision;

    /**
     * 描述
     *
     * @mbg.generated 2019-06-27 16:49:31
     */
    private String description;
}