/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

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
public class DmsHisRepairOrderProductInsertDTO extends InsertDTO {
  /**
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 //private Integer id;

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private Integer storeId;

 /**
  * 工单号
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 @NotBlank(message = "工单号不能为空")
 private String orderNo;

 /**
  * 配件编码
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 @NotBlank(message = "配件编码不能为空")
 private String productCode;

 /**
  * 配件名称
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private String productName;

 /**
  * 规格型号
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private String productModel;

 /**
  * 单价
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private BigDecimal productPrice;

 /**
  * 小计
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private BigDecimal productAmount;

 /**
  * 修理工
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 @NotBlank(message = "修理工不能为空")
 private String workerName;

 /**
  * 操作人
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private Integer dispatcher;

 /**
  * 操作时间
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 private Date operTime;

 /**
  * 数据导入时间
  *
  * @mbg.generated 2019-07-22 16:50:45
  */
 //private Date createTime;
}
