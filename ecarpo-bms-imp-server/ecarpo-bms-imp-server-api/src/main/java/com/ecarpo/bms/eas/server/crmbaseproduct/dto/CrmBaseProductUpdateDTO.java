/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

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
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer id;

 /**
  * 商品类型：material实物商品，virtual虚拟商品，deposit订金商品
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String ptype;

 /**
  * 虚拟产品类别
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer pmodel;

 /**
  * 虚拟产品ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer vid;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer store_id;

 /**
  * 供应商ID（对应base_supplier中的id）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer supplier_id;

 /**
  * 产品名称
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String name;

 /**
  * 产品名称去掉空格
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String name_trim;

 /**
  * 产品图片1地址
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String pic1;

 /**
  * 产品图片2地址
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String pic2;

 /**
  * 产品图片3地址
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String pic3;

 /**
  * 产品编码
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 @NotBlank(message = "产品编码不能为空")
 private String code;

 /**
  * 产品检索码
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String index_code;

 /**
  * 型号
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String model;

 /**
  * 产品条码
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String bar_code;

 /**
  * 产品属性ID（对应base_good_type中的id）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer good_type_id;

 /**
  * 产品单位（对应base_goods_unit）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer good_unit_id;

 /**
  * 产品大类ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer grade_1;

 /**
  * 产品中类ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer grade_2;

 /**
  * 产品小类ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer grade_3;

 /**
  * 产品产地
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String origin;

 /**
  * 产品启用日期
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Date sdate;

 /**
  * 产品截止日期
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Date edate;

 /**
  * 状态（1正常2停用）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer status;

 /**
  * 原价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal origin_price;

 /**
  * 零售价/销售价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal sales_price;

 /**
  * 商城价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal mall_price;

 /**
  * 积分
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer points;

 /**
  * 积分points能抵用的现金值
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal points_to_money;

 /**
  * 保养周期（都折成天）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer maintain_cycle;

 /**
  * 施工小时数
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer work_hour;

 /**
  * 产品英文名称
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String brief_desc;

 /**
  * 产品描述
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String desc;

 /**
  * 产品备注
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 //private String remark;

 /**
  * 是否微信相关（1相关0不相关）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer is_weixin;

 /**
  * 发布微信商城（0，全部，1，网购商城，2，积分商城）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer weixin_mall_type;

 /**
  * 商品基础数量
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer base_num;

 /**
  * 产品消费类型（gongshi工时费cailiao材料费other其他）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String cost_type;

 /**
  * 适用车系
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String apply_serie;

 /**
  * 适用车型
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String apply_type;

 /**
  * 是否通用，1是，2否
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer is_common;

 /**
  * 是否参与优惠，1是，2否
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer is_fav;

 /**
  * 是否参与根据会员级别进行的折扣
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String is_member_discount;

 /**
  * 单位，（舍弃关联表）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String unit;

 /**
  * 最后入库价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal last_price;

 /**
  * 最后入库价不含税
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal last_price_notax;

 /**
  * 最后一次采购价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal last_buy_price;

 /**
  * 销售价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal heavy_buyer_price;

 /**
  * 维修价
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal repair_price;

 /**
  * 建档人
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 //private Integer creator;

 /**
  * 建档时间
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer c_time;

 /**
  * 累计代销数量
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer proxy_count;

 /**
  * 累计退货数量
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer refund_count;

 /**
  * 累计结算数量
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer act_count;

 /**
  * 车型
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String car_model;

 /**
  * 货位
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String location_name;

 /**
  * 产品类型id，关联dms_product_type表
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer product_type_id;

 /**
  * 库存底限
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal stock_lowest;

 /**
  * 产品品牌ID（关联base_product_brand中的ID）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer product_brand;

 /**
  * 花纹（如有）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String figure;

 /**
  * 载重指数
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String load_index;

 /**
  * 速度级别
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String speed_level;

 /**
  * 安装方式（关联ym_dms_purchase_install_way中的ID）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer install_way;

 /**
  * 是否删除（1已删0未删）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer is_del;

 /**
  * 轮胎_胎面宽度
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String tire_width;

 /**
  * 轮胎_扁平比
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String tire_flat;

 /**
  * 轮胎_直径
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String tire_diameter;

 /**
  * 轮胎_速度级别
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String tire_speed_level;

 /**
  * 机油_粘度
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String oil_viscosity;

 /**
  * 机油_容量
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String oil_capacity;

 /**
  * 机油_分类
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private String oil_class;

 /**
  * 尾款，仅对订金商品有效
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private BigDecimal rest_payment;

 /**
  * 是否免外送费 0-否，1-是
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer is_free;

 /**
  * 配送类型：0-外送，1-外卖
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer send_type;

 /**
  * 发布平台：1-全部，2-微商城，3-微信点餐
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer platform;
}
