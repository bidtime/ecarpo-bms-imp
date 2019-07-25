/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

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
public class DmsHisRepairOrderUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private Integer id;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private Integer storeId;

 /**
  * 工单号
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 @NotBlank(message = "工单号不能为空")
 private String orderNo;

 /**
  * 维修类型
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private String repairType;

 /**
  * 客户姓名
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private String customName;

 /**
  * 客户电话
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private String customMobile;

 /**
  * 维修日期
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 @NotNull(message = "维修日期不能为空")
 private Date repairTime;

 /**
  * 车牌号
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 @NotBlank(message = "车牌号不能为空")
 private String plateNo;

 /**
  * 车型名称
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private String modelName;

 /**
  * 行驶里程
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 @NotNull(message = "行驶里程不能为空")
 private Integer mileage;

 /**
  * 服务顾问
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private String consultantName;

 /**
  * 配件款
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private BigDecimal productMoney;

 /**
  * 工时款
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private BigDecimal workhourMoney;

 /**
  * 套餐费
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private BigDecimal packageMoney;

 /**
  * 附加费
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private BigDecimal additionalMoney;

 /**
  * 总计费用
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private BigDecimal totalDiscount;

 /**
  * 预计交车日期
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 private Date predictDate;

 /**
  * 数据导入时间
  *
  * @mbg.generated 2019-07-22 16:52:54
  */
 //private Date createTime;
}
