/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.dto;

import java.util.Date;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SaveErpToEasDTO extends InsertDTO {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * toid
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
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
   * 传输标记
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Integer state;

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

  /**
   * 创建人id
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Long creatorId;

  /**
   * 创建时间
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Date createTime;

  /**
   * 修改时间
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Date modifyTime;

  /**
   * 修改人id
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Long modifierId;

}
