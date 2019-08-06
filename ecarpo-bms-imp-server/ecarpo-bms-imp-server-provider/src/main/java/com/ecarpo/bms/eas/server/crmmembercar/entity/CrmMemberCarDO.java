/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_member_car
 *
 * @mbg.generated 2019-08-05 16:38:00
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmMemberCarDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer id;

    /**
     * 对应的会员ID
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer custom_id;

    /**
     * 对应的经销商ID
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer store_id;

    /**
     * 车牌号
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String plate_no;

    /**
     * 省份ID
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer province_id;

    /**
     * VIN号
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String vin_num;

    /**
     * 变速箱
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String transmission;

    /**
     * 排放标准
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String emissions_standards;

    /**
     * 对应的品牌ID
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer brand;

    /**
     * 品牌名称，当brand为0时，读取此字段
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String brand_name;

    /**
     * 车系
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer car_series;

    /**
     * 车系名称，当car_series为0时，读取此字段
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String series_name;

    /**
     * 车型
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer car_model;

    /**
     * 车型名称，当car_model为0时，读取此字段
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String model_name;

    /**
     * 车身颜色
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String color;

    /**
     * 车架号
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String car_frame_num;

    /**
     * 发动机号
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String engine_num;

    /**
     * 开票日期,购车日期
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date invoice_date;

    /**
     * 购车金额
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private BigDecimal cost;

    /**
     * 上牌日期
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date plate_install_date;

    /**
     * 用车区域（省）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer use_car_province;

    /**
     * 用车区域（城市）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer use_car_city;

    /**
     * 用车区域（城市名称）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String use_car_city_name;

    /**
     * 销售渠道ID
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer sales_channels;

    /**
     * 是否延保（1是）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer is_ext_maintain;

    /**
     * 延保开始日期
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date maintain_sdate;

    /**
     * 年检日期
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date inspection_date;

    /**
     * 预计下次保养日期[微信端专用]
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date next_mdate;

    /**
     * 保险公司
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String insurance_company;

    /**
     * 当前的保险到期日[微信端专用]
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date insurance_edate;

    /**
     * 结束里程，最后里程
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer end_mileage;

    /**
     * 换表里程，一般保养时用到
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer change_odograph_mileage;

    /**
     * 备注
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String remark;

    /**
     * 是否意向车型（1是0不是）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer is_intention;

    /**
     * 任务ID（供任务管理模块使用）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer task_id;

    /**
     * 是否二手置换车（1是0不是）
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer is_replace;

    /**
     * 是否在本部投保(1是)
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer is_shop_insurance;

    /**
     * 保险金额
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private BigDecimal insurance_money;

    /**
     * 上次保险办理时间
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Date insurance_time;

    /**
     * 保险办理人
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private Integer insurance_creator;

    /**
     * 车源编号
     *
     * @mbg.generated 2019-08-05 16:38:00
     */
    private String carsource_num;
}