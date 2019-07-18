/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.material.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/26
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BsMaterialDO extends DataEntity {
    /**
     * 物料id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    @PKField
    private Long materialId;

    /**
     * 集团id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long groupId;

    /**
     * 组织id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long orgId;

    /**
     * 物料编码
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String materialCode;

    /**
     * 物料名称
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String materialName;

    /**
     * 物料别名
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String materialAlias;

    /**
     * 物料简称
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String shortName;

    /**
     * 外文名称
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String foreignName;

    /**
     * 速记码
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String shortCode;

    /**
     * 物料基本分类id?
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long materialTypeId;

    /**
     * 物料基本分类名称?
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String materialTypeName;

    /**
     * 规格型号
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String model;

    /**
     * 基本计量单位id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long baseUnitId;

    /**
     * 辅助计量单位id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long assistUnitId;

    /**
     * 单价精度
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Integer pricePrecision;

    /**
     * 条形码
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String barCode;

    /**
     * 二维码
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String qrCode;

    /**
     * 注册商标
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String regMark;

    /**
     * 批准文号
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String warrantNo;

    /**
     * 工程图号
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String picNo;

    /**
     * 辅助属性编码
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private String assistAttrCode;

    /**
     * 毛重
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal grossWeight;

    /**
     * 净重
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal netWeight;

    /**
     * 重量单位
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long weightUnitId;

    /**
     * 长度
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal length;

    /**
     * 宽度
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal width;

    /**
     * 高度
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal height;

    /**
     * 长度单位id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long lengthUnitId;

    /**
     * 体积
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private BigDecimal volume;

    /**
     * 体积单位id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long volumeUnitId;

    /**
     * 是否启用本物料辅助属性
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Integer useAssistAttr;

    /**
     * 删除时间
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Date delTime;

    /**
     * 删除人id
     *
     * @mbg.generated 2019-06-26 11:05:01
     */
    private Long delId;
}