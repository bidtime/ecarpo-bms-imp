/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.material.entity;

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
public class EasMaterialDO extends DataEntity {
    /**
     * id
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    @PKField
    private String id;

    /**
     * 编码 number
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String encrypt;

    /**
     * 名称 name
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String define;

    /**
     * 最后修改者编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String lastUpdateUserIdNumber;

    /**
     * 暂存或保存
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer effectedStatus;

    /**
     * 基本计量单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String baseUnitName;

    /**
     * 体积单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String volumnUnitNumber;

    /**
     * 外协件
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer isOutsourcedPart;

    /**
     * 高度
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal height;

    /**
     * 描述
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String description;

    /**
     * 辅助计量单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String assistUnitName;

    /**
     * 物料基本分类层级
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer materialGroupLevel;

    /**
     * 单价精度
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer pricePrecision;

    /**
     * 条形码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String barCode;

    /**
     * 辅助计量单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String assistUnitNumber;

    /**
     * 禁用组织名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String freezeOrgUnitName;

    /**
     * 设备属性 =-1,设备=0,备件=1,工具=2
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer equipProperty;

    /**
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String namePinYin;

    /**
     * 简称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String simpleName;

    /**
     * 物料状态 未核准=0,核准=1,禁用=2,已删除=3
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer status;

    /**
     * 编码（全文索引使用）
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String number4idx;

    /**
     * 材料牌号名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String materialTrademarkName;

    /**
     * 宽度
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal width;

    /**
     * 长度单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String lengthUnitName;

    /**
     * 毛重
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal grossWeight;

    /**
     * 物料基本分类名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String materialGroupName;

    /**
     * 禁用组织编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String freezeOrgUnitNumber;

    /**
     * 控制单元编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String controlUnitIdNumber;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String controlUnitIdName;

    /**
     * 工程图号
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String pictureNumber;

    /**
     * 重量单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String weightUnitNumber;

    /**
     * 是否检斤
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer isWeighted;

    /**
     * 物料基本分类编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String materialGroupNumber;

    /**
     * 材料牌号编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String materialTrademarkNumber;

    /**
     * 规格型号
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String model;

    /**
     * 名称（全文索引使用）
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String name4idx;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Date lastUpdateTime;

    /**
     * 辅助属性类别名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String assistAttrName;

    /**
     * 是否商品
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer isGoods;

    /**
     * 辅助属性类别编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String assistAttrNumber;

    /**
     * 修改版本
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer version;

    /**
     * 管理组织编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String adminCuIdNumber;

    /**
     * 启用本物料设置的辅助属性
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer useAsstAttrRelation;

    /**
     * 是否同步到成本对象
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Integer isSynochronous;

    /**
     * 批准文号
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String warrantNumber;

    /**
     * 长度
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal length;

    /**
     * 注册商标
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String registeredMark;

    /**
     * 最后修改人名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String lastUpdateUserIdName;

    /**
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String nameShortPinYin;

    /**
     * 体积单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String volumnUnitName;

    /**
     * 创建者编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String creatorIdNumber;

    /**
     * 外文名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String foreignAme;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String creatorIdName;

    /**
     * 别名
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String alias;

    /**
     * 基本计量单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String baseUnitNumber;

    /**
     * 长度单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String lengthUnitNumber;

    /**
     * 重量单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String weightUnitName;

    /**
     * 序列号计量单位名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String seqUnitName;

    /**
     * 净重
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal netWeight;

    /**
     * 序列号计量单位编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String seqUnitNumber;

    /**
     * 旧编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String oldNumber;

    /**
     * 体积
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private BigDecimal volume;

    /**
     * 助记码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String helpCode;

    /**
     * 简称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String shortName;

    /**
     * 长编码
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String longNumber;

    /**
     * 管理组织名称
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private String adminCuIdName;

    /**
     * erp物料id
     *
     * @mbg.generated 2019-07-10 10:36:01
     */
    private Long erpMaterialId;
}