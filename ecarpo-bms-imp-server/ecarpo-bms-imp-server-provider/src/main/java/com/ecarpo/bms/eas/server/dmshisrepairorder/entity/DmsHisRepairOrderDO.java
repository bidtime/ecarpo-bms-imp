/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_his_repair_order
 *
 * @mbg.generated 2019-07-22 16:52:54
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsHisRepairOrderDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private Integer id;

    /**
     * 经销商ID
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private Integer storeId;

    /**
     * 工单号
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String orderNo;

    /**
     * 维修类型
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String repairType;

    /**
     * 客户姓名
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String customName;

    /**
     * 客户电话
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String customMobile;

    /**
     * 维修日期
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private Date repairTime;

    /**
     * 车牌号
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String plateNo;

    /**
     * 车型名称
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String modelName;

    /**
     * 行驶里程
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private Integer mileage;

    /**
     * 服务顾问
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private String consultantName;

    /**
     * 配件款
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private BigDecimal productMoney;

    /**
     * 工时款
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private BigDecimal workhourMoney;

    /**
     * 套餐费
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private BigDecimal packageMoney;

    /**
     * 附加费
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private BigDecimal additionalMoney;

    /**
     * 总计费用
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private BigDecimal totalDiscount;

    /**
     * 预计交车日期
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    private Date predictDate;

    /**
     * 数据导入时间
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    //private Date createTime;
}