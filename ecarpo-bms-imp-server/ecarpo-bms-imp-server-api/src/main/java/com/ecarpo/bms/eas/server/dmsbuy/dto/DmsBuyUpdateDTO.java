/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.dto;

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
public class DmsBuyUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer id;

 /**
  * 采购单编号
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String buyNumber;

 /**
  * 经销商id
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer storeId;

 /**
  * 客户名称
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String contactName;

 /**
  * 客户电话
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String contactPhone;

 /**
  * 采购类型，关联类型表
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer buyTypeId;

 /**
  * 供货商id
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer supplierId;

 /**
  * 要求到货日期
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String requireReachDate;

 /**
  * 结算方式，1现结，2挂账
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer actType;

 /**
  * 是否代销，0否1是
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer isSaleProxy;

 /**
  * 结算人
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String actName;

 /**
  * 创建人
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 //private Integer creator;

 /**
  * 创建时间
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 //private Date cTime;

 /**
  * 入库人
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer buyerId;

 /**
  * 入库时间
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Date buyTime;

 /**
  * 执行人
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer executor;

 /**
  * 执行时间
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Date execTime;

 /**
  * 收银员
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer cashier;

 /**
  * 收银时间
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Date cashierTime;

 /**
  * 发票号
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String receiptsNo;

 /**
  * 采购单状态，1未执行，2待付款，3待入库，4已完成，5作废
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer status;

 /**
  * 原采购计划单号
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String appNumber;

 /**
  * 来源属性（1采购计划申请/2订单补采购/3采购单1-1-3-2/4直接入库）
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String generateFrom;

 /**
  * 原始单据号码
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String originalNumber;

 /**
  * 配送地址
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String deliveryAddress;

 /**
  * 配送方式ID（关联ym_dms_purchase_delivery_way中的ID）
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private Integer deliveryWayId;

 /**
  * 收件人姓名
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String recipientName;

 /**
  * 收件人电话
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String recipientMobile;

 /**
  *
  * @mbg.generated 2019-07-23 11:12:52
  */
 private String desc;
}
