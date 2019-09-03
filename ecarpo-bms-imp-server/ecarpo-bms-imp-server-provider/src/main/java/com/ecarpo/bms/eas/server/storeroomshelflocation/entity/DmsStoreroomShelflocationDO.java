/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.storeroomshelflocation.entity;

import com.ecarpo.bms.eas.server.data.MyEntityInteger;
import com.ecarpo.framework.common.annotation.InitialField;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table dms_storeroom_shelflocation
 *
 * @mbg.generated 2019-08-06 11:42:27
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DmsStoreroomShelflocationDO extends MyEntityInteger {
  /**
   * @mbg.generated 2019-08-06 11:42:27
   */
  private Integer id;

  /**
   * 经销商id
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private Integer store_id;

  /**
   * 货位编码
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private String location_code;

  /**
   * 库房名称
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private String location_name;

  /**
   * 所在区域
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private String location_area;

  /**
   * 功能分类(1三包件2正品3残次品4劳保及工具5其他)
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private Integer function_type;

  /**
   * 占用状态(1占用0空闲)
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private Integer occupy_status;

  /**
   * 库房属性
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private String room_type;

  /**
   * 归属dealer_id
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  private Integer from_store_id;

  /**
   * 备注说明
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  //private String remark;

  /**
   * 状态(1停用0启用)
   *
   * @mbg.generated 2019-08-06 11:42:27
   */
  @InitialField( value = "0")
  private Integer status;
  
}
