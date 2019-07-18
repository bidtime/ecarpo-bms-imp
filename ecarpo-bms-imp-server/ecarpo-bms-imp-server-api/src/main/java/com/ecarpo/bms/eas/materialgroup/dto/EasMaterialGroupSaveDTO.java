/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.materialgroup.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * @mbg.generated 2019/06/14
 * @PKField
 */
@Data
public class EasMaterialGroupSaveDTO implements Serializable {

  /**
   * 更新或者新增标识(controller 中手动赋值) 1 == 更新,0==新增
   */
  private Integer insertOrUpdateFlag;

  /**
   * id
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @NotBlank(message = "物料类型id不能为空")
  private String id;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * 级次 level
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "level")
  private Integer gradation;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 分类标准编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "groupStandardID_number")
  private String groupStandardIdNumber;

  /**
   * 分类标准名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "groupStandardID_name")
  private String groupStandardIdName;

  /**
   * @mbg.generated 2019-06-14 14:02:57
   */
  private Integer deletedStatus;

  /**
   * 上级组织层级
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "parentID_level")
  private Integer parentIdLevel;

  /**
   * 上级组织名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "parentID_name")
  private String parentIdName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private String description;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private Integer isLeaf;

  /**
   * 上级组织编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  @JSONField(name = "parentID_number")
  private String parentIdNumber;

  /**
   * 显示名称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private String displayName;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private String longNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-14 14:02:57
   */
  private String simpleName;
}