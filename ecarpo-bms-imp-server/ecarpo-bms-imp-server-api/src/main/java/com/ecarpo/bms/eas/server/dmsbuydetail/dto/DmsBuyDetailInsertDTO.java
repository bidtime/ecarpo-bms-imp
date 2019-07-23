/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.dto;

import java.math.BigDecimal;

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
public class DmsBuyDetailInsertDTO extends InsertDTO {
  /**
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer id;

 /**
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer storeId;

 /**
  * 采购单编号，关联dms_buy表中的buy_number
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private String buyNumber;

 /**
  * 产品id
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer productId;

 /**
  * 含税成本价
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private BigDecimal costPrice;

 /**
  * 无税成本价
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private BigDecimal costPriceNotax;

 /**
  * 采购数量
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private BigDecimal buyCount;

 /**
  * 采购价格浮动率
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer addRate;

 /**
  * 含税金额
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private BigDecimal amount;

 /**
  * 不含税金额
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private BigDecimal amountNotax;

 /**
  * 库房id
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer locationId;

 /**
  * 货位名称
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private String locationName;

 /**
  * 添加时间
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 //private Integer cTime;

 /**
  * 处理状态
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private Integer status;

 /**
  * 描述
  *
  * @mbg.generated 2019-07-23 10:38:13
  */
 private String desc;
}
