/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.entity;

import java.math.BigDecimal;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_buy_detail
 *
 * @mbg.generated 2019-07-23 10:38:13
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsBuyDetailDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer id;

    /**
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer storeId;

    /**
     * 采购单编号，关联dms_buy表中的buy_number
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private String buyNumber;

    /**
     * 产品id
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer productId;

    /**
     * 含税成本价
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private BigDecimal costPrice;

    /**
     * 无税成本价
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private BigDecimal costPriceNotax;

    /**
     * 采购数量
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private BigDecimal buyCount;

    /**
     * 采购价格浮动率
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer addRate;

    /**
     * 含税金额
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private BigDecimal amount;

    /**
     * 不含税金额
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private BigDecimal amountNotax;

    /**
     * 库房id
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer locationId;

    /**
     * 货位名称
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private String locationName;

    /**
     * 添加时间
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    //private Integer cTime;

    /**
     * 处理状态
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private Integer status;

    /**
     * 描述
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    private String desc;
}