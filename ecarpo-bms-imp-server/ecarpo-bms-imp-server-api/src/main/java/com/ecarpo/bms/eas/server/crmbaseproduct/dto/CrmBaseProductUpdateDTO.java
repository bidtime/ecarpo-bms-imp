/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmBaseProductUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer id;

 /**
  * 商品类型：material实物商品，virtual虚拟商品，deposit订金商品
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String ptype;

 /**
  * 虚拟产品类别
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer pmodel;

 /**
  * 虚拟产品ID
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer vid;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer storeId;

 /**
  * 供应商ID（对应base_supplier中的id）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer supplierId;

 /**
  * 产品名称
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String name;

 /**
  * 产品名称去掉空格
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String nameTrim;

 /**
  * 产品图片1地址
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String pic1;

 /**
  * 产品图片2地址
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String pic2;

 /**
  * 产品图片3地址
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String pic3;

 /**
  * 产品编码
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String code;

 /**
  * 产品检索码
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String indexCode;

 /**
  * 型号
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String model;

 /**
  * 产品条码
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String barCode;

 /**
  * 产品属性ID（对应base_good_type中的id）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer goodTypeId;

 /**
  * 产品单位（对应base_goods_unit）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer goodUnitId;

 /**
  * 产品大类ID
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer grade1;

 /**
  * 产品中类ID
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer grade2;

 /**
  * 产品小类ID
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer grade3;

 /**
  * 产品产地
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String origin;

 /**
  * 产品启用日期
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Date sdate;

 /**
  * 产品截止日期
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Date edate;

 /**
  * 状态（1正常2停用）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer status;

 /**
  * 原价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal originPrice;

 /**
  * 零售价/销售价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal salesPrice;

 /**
  * 商城价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal mallPrice;

 /**
  * 积分
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer points;

 /**
  * 积分points能抵用的现金值
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal pointsToMoney;

 /**
  * 保养周期（都折成天）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer maintainCycle;

 /**
  * 施工小时数
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer workHour;

 /**
  * 产品英文名称
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String briefDesc;

 /**
  * 是否微信相关（1相关0不相关）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer isWeixin;

 /**
  * 发布微信商城（0，全部，1，网购商城，2，积分商城）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer weixinMallType;

 /**
  * 商品基础数量
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer baseNum;

 /**
  * 产品消费类型（gongshi工时费cailiao材料费other其他）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String costType;

 /**
  * 适用车系
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String applySerie;

 /**
  * 适用车型
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String applyType;

 /**
  * 是否通用，1是，2否
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer isCommon;

 /**
  * 是否参与优惠，1是，2否
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer isFav;

 /**
  * 是否参与根据会员级别进行的折扣
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String isMemberDiscount;

 /**
  * 单位，（舍弃关联表）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String unit;

 /**
  * 最后入库价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal lastPrice;

 /**
  * 最后入库价不含税
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal lastPriceNotax;

 /**
  * 最后一次采购价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal lastBuyPrice;

 /**
  * 销售价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal heavyBuyerPrice;

 /**
  * 维修价
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal repairPrice;

 /**
  * 建档人
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 //private Integer creater;

 /**
  * 建档时间
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 //private Integer cTime;

 /**
  * 累计代销数量
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer proxyCount;

 /**
  * 累计退货数量
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer refundCount;

 /**
  * 累计结算数量
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer actCount;

 /**
  * 车型
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String carModel;

 /**
  * 货位
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String locationName;

 /**
  * 产品类型id，关联dms_product_type表
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer productTypeId;

 /**
  * 库存底限
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal stockLowest;

 /**
  * 产品品牌ID（关联base_product_brand中的ID）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer productBrand;

 /**
  * 花纹（如有）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String figure;

 /**
  * 载重指数
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String loadIndex;

 /**
  * 速度级别
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String speedLevel;

 /**
  * 安装方式（关联ym_dms_purchase_install_way中的ID）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer installWay;

 /**
  * 是否删除（1已删0未删）
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer isDel;

 /**
  * 轮胎_胎面宽度
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String tireWidth;

 /**
  * 轮胎_扁平比
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String tireFlat;

 /**
  * 轮胎_直径
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String tireDiameter;

 /**
  * 轮胎_速度级别
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String tireSpeedLevel;

 /**
  * 机油_粘度
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String oilViscosity;

 /**
  * 机油_容量
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String oilCapacity;

 /**
  * 机油_分类
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private String oilClass;

 /**
  * 尾款，仅对订金商品有效
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private BigDecimal restPayment;

 /**
  * 是否免外送费 0-否，1-是
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer isFree;

 /**
  * 配送类型：0-外送，1-外卖
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer sendType;

 /**
  * 发布平台：1-全部，2-微商城，3-微信点餐
  *
  * @mbg.generated 2019-07-23 10:54:49
  */
 private Integer platform;
 
 private String desc;
 
 private String remark;
}
