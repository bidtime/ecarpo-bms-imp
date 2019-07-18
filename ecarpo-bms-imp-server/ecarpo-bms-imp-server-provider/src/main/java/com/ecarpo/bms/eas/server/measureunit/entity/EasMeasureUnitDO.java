/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.measureunit.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/07/10
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasMeasureUnitDO extends DataEntity {
    /**
     * ID
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    @PKField
    private String id;

    /**
     *erp计量单位id
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Long erpMeasureUnitId;

    /**
     * 换算单位
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private BigDecimal coefficient;

    /**
     * 是否是基本单位
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Integer isBaseUnit;

    /**
     * 失效日期
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Date disabledDate;

    /**
     * 禁用
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Integer isDisabled;

    /**
     * 计量单位组编号
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String groupIdNumber;

    /**
     * 机灵单位组名称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String groupIdName;

    /**
     * 计量单位组层级
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Integer groupIdLevel;

    /**
     * 数量精度
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Integer qtyPrecision;

    /**
     * 名称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String define;

    /**
     * 编码
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String encrypt;

    /**
     * 描述
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String description;

    /**
     * 简称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String simpleName;

    /**
     * 创建者编号
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String creatorIdNumber;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String creatorIdName;

    /**
     * 最后修改者编号
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String lastUpdateUserIdNumber;

    /**
     * 最后修改者名称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String lastUpdateUserIdName;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private Date lastUpdateTime;

    /**
     * 控制单元编号
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String controlUnitIdNumber;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-07-10 10:00:04
     */
    private String controlUnitIdName;
}