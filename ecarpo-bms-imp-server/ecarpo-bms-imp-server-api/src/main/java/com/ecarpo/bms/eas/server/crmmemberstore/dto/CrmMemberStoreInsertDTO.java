/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmMemberStoreInsertDTO extends InsertDTO {
  /**
   * @mbg.generated 2019-08-05 16:58:00
   */
  //private Integer id;

  /**
   * 经销商ID
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer store_id;

  /**
   * 会员ID（如已是会员）
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer custom_id;

  /**
   * 卡号
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private String card_num;

  /**
   * 审批日期
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Date ctime;

  /**
   * 储值金额
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal store_amount;

  /**
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal giving_amount;

  /**
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal total_amount;

  /**
   * 当前总剩余金额
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal now_amount;

  /**
   * 经办人ID（当前登录用户的ID）
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer cstaff;

  /**
   * 规则ID
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer rule_id;

  /**
   * 储值类型（会员储值 || 储值调整 || 店面收银 || 微信商城）
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private String store_type;

  /**
   * 赠送类型：1-赠送储值|2-赠送积分
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private String giving_value_type;

  /**
   * 赠送类型（1等比2非等比）
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer giving_type;

  /**
   * 是否付款（1已付0未付）
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private Integer is_payed;

  /**
   * 现金付款
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal cash_pay;

  /**
   * 挂账付款
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal hang_pay;

  /**
   * POS机付款
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal pos_pay;

  /**
   * 支票付款
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal check_pay;

  /**
   * 拉卡拉支付
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal lakala_pay;

  /**
   * 微信支付
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal weixin_pay;

  /**
   * 支付宝支付
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal alipay_pay;

  /**
   * 转账
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal transfer;

  /**
   * 总付款
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private BigDecimal total_pay;

  /**
   * 备注
   *
   * @mbg.generated 2019-08-05 16:58:00
   */
  private String remark;
}
