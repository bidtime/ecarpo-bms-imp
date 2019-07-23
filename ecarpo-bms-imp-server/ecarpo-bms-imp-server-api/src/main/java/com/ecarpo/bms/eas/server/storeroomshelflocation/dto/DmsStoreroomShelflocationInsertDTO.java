/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.dto;

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
public class DmsStoreroomShelflocationInsertDTO extends InsertDTO {
  /**
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer id;

 /**
  * 经销商id
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer storeId;

 /**
  * 货位编码
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private String locationCode;

 /**
  * 库房名称
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private String locationName;

 /**
  * 所在区域
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private String locationArea;

 /**
  * 功能分类(1三包件2正品3残次品4劳保及工具5其他)
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer functionType;

 /**
  * 占用状态(1占用0空闲)
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer occupyStatus;

 /**
  * 库房属性
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private String roomType;

 /**
  * 归属dealer_id
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer fromStoreId;

 /**
  * 备注说明
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private String remark;

 /**
  * 状态(1停用0启用)
  *
  * @mbg.generated 2019-07-19 10:57:57
  */
 private Integer status;
}
