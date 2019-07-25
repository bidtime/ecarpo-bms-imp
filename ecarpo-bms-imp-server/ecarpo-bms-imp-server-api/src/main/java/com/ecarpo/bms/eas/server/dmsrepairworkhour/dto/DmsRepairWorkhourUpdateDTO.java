/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.dto;

import java.math.BigDecimal;

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
public class DmsRepairWorkhourUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer id;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer storeId;

 /**
  * 工时编码
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 @NotBlank(message = "工时编码不能为空")
 private String workhourCode;

 /**
  * 工时名称
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private String workhourName;

 /**
  * 考核工时
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private BigDecimal reviewWorkhour;

 /**
  * 考核单价
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private BigDecimal reviewPrice;

 /**
  * 额定工时
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private BigDecimal ratedWorkhour;

 /**
  * 额定单价
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private BigDecimal ratedPrice;

 /**
  * 是否通用
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer isUniversal;

 /**
  * 是否优惠
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer isDiscount;

 /**
  * 是否是钣金项目
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer isSheetmetal;

 /**
  * 检索码
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private String retrievalCode;

 /**
  * 状态
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 //private Integer state;

 /**
  * 工时等级
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private String workhourLevel;

 /**
  * 创建人
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 //private Integer creator;

 /**
  * 创建时间
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 //private Date createTime;

 /**
  * 是否洗车(0否1是)
  *
  * @mbg.generated 2019-07-22 16:41:30
  */
 private Integer isWashCar;
}
