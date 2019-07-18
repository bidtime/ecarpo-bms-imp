/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ErpToEasDO extends DataEntity {

  /**
   * toid
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  @PKField
  private Long toId;

  /**
   * primary key
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Long tablePk;

  /**
   * 模块名称
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private String tableName;

  /**
   * 模块全称
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private String context;

  /**
   * oper类型: 1:insert 0: update
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Integer operType;

  /**
   * 上传次数
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Integer uploadNum;

  /**
   * 失败信息
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private String resultMsg;

}
