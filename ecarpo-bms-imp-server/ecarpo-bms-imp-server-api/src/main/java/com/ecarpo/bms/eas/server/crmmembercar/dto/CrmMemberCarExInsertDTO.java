/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.EASInsertDTO;
import com.ecarpo.framework.common.annotation.InitialValue;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmMemberCarExInsertDTO extends EASInsertDTO {

 /**
  * 对应的经销商ID
  *
  * @mbg.generated 2019-08-05 16:38:00
  */
 //private Integer store_id;
 
 // below is cust

 /**
  * 姓名
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private String name;
 
 /**
  * 客户类型（0潜客1保有客户2会员）
  *
  */
 @InitialValue(value="1")
 private Integer custom_type;


 /**
  * 移动电话
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private String mobile;

 /**
  * 联系地址
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private String address;

 /**
  * 身份证号
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private String idcard;

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
  * 会员积分
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private Integer points;

 /**
  * 工时券可用总额
  *
  * @mbg.generated 2019-08-12 16:07:37
  */
 private BigDecimal working_sum;

 // below is member
 
 // below is car
 
 /**
  * 车牌号
  *
  * @mbg.generated 2019-08-05 16:38:00
  */
 private String plate_no;

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
  * 开票日期,购车日期
  *
  * @mbg.generated 2019-08-05 16:38:00
  */
 private Date invoice_date;

 /**
  * 当前的保险到期日[微信端专用]
  *
  * @mbg.generated 2019-08-05 16:38:00
  */
 private Date insurance_edate;
 
}
