/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmcustom.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;
import com.ecarpo.framework.common.annotation.InitialField;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_custom
 *
 * @mbg.generated 2019-08-12 16:07:37
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmCustomDO extends MyEntity {

  /**
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer id;

  /**
   * 在线聊天用户ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String chatid;

  /**
   * 对应的经销商ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer store_id;

  /**
   * 省份ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer province_id;

  /**
   * 城市ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer city_id;

  /**
   * 区县ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer district_id;

  /**
   * 客户组别
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer cgroup;

  /**
   * 客户类型
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer ccategory;

  /**
   * 姓名
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String name;

  /**
   * 出生日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date birth;

  /**
   * 性别（1男2女3其它0保密）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer sex;

  /**
   * 身份证号
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String idcard;

  /**
   * 固定电话
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String tel;

  /**
   * 传真
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String fax;

  /**
   * 联系地址
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String address;

  /**
   * 邮政编码
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String postcode;

  /**
   * 移动电话
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String mobile;

  /**
   * 客户密码(md5)
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String pwd;

  /**
   * 电子邮箱
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String mail;

  /**
   * 微信号
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String weixin;

  /**
   * 是否微信绑定
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_weixin_bind;

  /**
   * 是否初次绑定（1是0不是）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_weixin_first_bind;

  /**
   * APP密码
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String appsec;

  /**
   * 销售顾问（多个顾问id，中间用半角逗号隔开）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String consultant;

  /**
   * 业务员（与顾问共用同样的ID）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer salesman;

  /**
   * 推荐人
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String intro;

  /**
   * 潜客级别（HABC）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String custom_level;

  /**
   * 线索（对应ym_crm_clues中的tag）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String clues;

  /**
   * 客户来源ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer source_id;

  /**
   * 职业ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer jobs_id;

  /**
   * 行业ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer business_type_id;

  /**
   * 公司单位
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String company;

  /**
   * 职务
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String role;

  /**
   * 是否关键岗位（1是0不是）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_keyrole;

  /**
   * 家庭收入级别
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer income;

  /**
   * 家庭状况
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer home_status;

  /**
   * 教育状况
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer edu_id;

  /**
   * 建档时间
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Date ctime;

  /**
   * 建档日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date cdate;

  /**
   * 入会日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date join_date;

  /**
   * 会员积分
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer points;

  /**
   * 备注
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String remark;

  /**
   * 驾照领取日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date license_issue_date;

  /**
   * 驾照到期日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Date license_expire_date;

  /**
   * 希望联系方式
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer contact_style;

  /**
   * 希望联系时间
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer contact_time;

  /**
   * 结婚日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date wedding_date;

  /**
   * 客户类型（0潜客1保有客户2会员）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer custom_type;

  /**
   * 优惠券
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal vouchers;

  /**
   * 充值/储值余额
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal top_up;

  /**
   * 预收款金额
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal pre_top_up;

  /**
   * 折扣券
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal discount;

  /**
   * 工时折扣
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer working_discount;

  /**
   * 工时券额度
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal wording_coupon;

  /**
   * 配件折扣
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer acc_discount;

  /**
   * 材料券额度
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal acc_coupon;

  /**
   * 已消费额
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal has_payed;

  /**
   * 会员级别/卡级别id
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer level;

  /**
   * 会员卡号
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String card_num;

  /**
   * 实体会员卡卡号
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String entity_card_num;

  /**
   * 实收会费
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer actual_cost;

  /**
   * 入会审核（0：未审核，1：已审核）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer admission;

  /**
   * 卡号的密码
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String card_pwd;

  /**
   * 是否实体卡(1是、0不是)
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_entity;

  /**
   * 卡状态
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer card_status;

  /**
   * 卡的开始有效期（入会日期）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date card_s_valid;

  /**
   * 卡的结束有效期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date card_e_valid;

  /**
   * 卡激活日期
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  @InitialField
  private Date card_alive;

  /**
   * 是否退卡(1是、0不是)
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_cancel;

  /**
   * 退卡原因对应的ID
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer cancel_reason_id;

  /**
   * 如果cancel_reason_id是零则需要写入具体原因
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String cancel_reason;

  /**
   * 工时券可用总额
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal working_sum;

  /**
   * 经办人user_id
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer staff;

  /**
   * 微信来源， 1：会员绑定，2：微信领券（该字段只用于微信）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer wx_source;

  /**
   * dms标记为特殊客户-1是，0不是
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String dms_mark;

  /**
   * dms特殊客户备注
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String dms_remark;

  /**
   * 客户累计挂账（累计欠款）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal cumulative_debts;

  /**
   * 客户累计付款
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal cumulative_pay;

  /**
   * 客户当前欠款
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private BigDecimal current_debts;

  /**
   * 是否是大客户（1是0不是）
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private Integer is_big_custom;

  /**
   * 客户来源名称
   *
   * @mbg.generated 2019-08-12 16:07:37
   */
  private String source_name;
}
