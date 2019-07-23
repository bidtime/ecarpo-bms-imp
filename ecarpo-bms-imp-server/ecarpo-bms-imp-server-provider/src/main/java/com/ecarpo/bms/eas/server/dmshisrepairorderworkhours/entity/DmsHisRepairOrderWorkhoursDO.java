/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_his_repair_order_workhours
 *
 * @mbg.generated 2019-07-22 16:44:33
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsHisRepairOrderWorkhoursDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private Integer id;

    /**
     * 经销商ID
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private Integer storeId;

    /**
     * 工单号
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private String orderNo;

    /**
     * 工时编码
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private String workhourCode;

    /**
     * 工时名称
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private String workhourName;

    /**
     * 工时定额
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private BigDecimal ratedWorkhour;

    /**
     * 考核工时单价
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private BigDecimal workPrice;

    /**
     * 修理工
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private String workerName;

    /**
     * 操作人
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private Integer dispatcher;

    /**
     * 操作时间
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    private Date operTime;

    /**
     * 数据导入时间
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    //private Date createTime;
}