/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dto;

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
public class DmsHisRepairOrderWorkhoursUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private Integer id;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private Integer storeId;

 /**
  * 工单号
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 @NotBlank(message = "工单号不能为空")
 private String orderNo;

 /**
  * 工时编码
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 @NotBlank(message = "工时编码不能为空")
 private String workhourCode;

 /**
  * 工时名称
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private String workhourName;

 /**
  * 工时定额
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private BigDecimal ratedWorkhour;

 /**
  * 考核工时单价
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private BigDecimal workPrice;

 /**
  * 修理工
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 @NotBlank(message = "修理工不能为空")
 private String workerName;

 /**
  * 操作人
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private Integer dispatcher;

 /**
  * 操作时间
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 private Date operTime;

 /**
  * 数据导入时间
  *
  * @mbg.generated 2019-07-22 16:44:33
  */
 //private Date createTime;
}
