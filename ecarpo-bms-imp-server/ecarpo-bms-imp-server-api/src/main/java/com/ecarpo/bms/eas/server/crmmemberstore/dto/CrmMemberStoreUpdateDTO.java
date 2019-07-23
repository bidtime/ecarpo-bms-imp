/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.dto;

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
public class CrmMemberStoreUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer id;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer storeId;

 /**
  * 会员ID（如已是会员）
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer customId;

 /**
  * 卡号
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private String cardNum;

 /**
  * 审批日期
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Date ctime;
 
 /**
  * 储值金额
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal storeAmount;

 /**
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal givingAmount;

 /**
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal totalAmount;

 /**
  * 当前总剩余金额
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal nowAmount;

 /**
  * 经办人ID（当前登录用户的ID）
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer cstaff;

 /**
  * 规则ID
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer ruleId;

 /**
  * 储值类型（会员储值 || 储值调整 || 店面收银 || 微信商城）
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private String storeType;

 /**
  * 赠送类型：1-赠送储值|2-赠送积分
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private String givingValueType;

 /**
  * 赠送类型（1等比2非等比）
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer givingType;

 /**
  * 是否付款（1已付0未付）
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private Integer isPayed;

 /**
  * 现金付款
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal cashPay;

 /**
  * 挂账付款
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal hangPay;

 /**
  * POS机付款
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal posPay;

 /**
  * 支票付款
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal checkPay;

 /**
  * 拉卡拉支付
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal lakalaPay;

 /**
  * 微信支付
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal weixinPay;

 /**
  * 支付宝支付
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal alipayPay;

 /**
  * 转账
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal transfer;

 /**
  * 总付款
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private BigDecimal totalPay;

 /**
  * 备注
  *
  * @mbg.generated 2019-07-23 10:44:25
  */
 private String remark;
}
