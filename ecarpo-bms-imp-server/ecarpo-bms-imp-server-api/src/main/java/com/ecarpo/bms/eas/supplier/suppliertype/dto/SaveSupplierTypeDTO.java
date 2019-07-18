/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.supplier.suppliertype.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
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
public class SaveSupplierTypeDTO extends InsertDTO {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 更新或者新增标识(controller 中手动赋值) 1 == 更新,0==新增
   */
  private Integer insertOrUpdateFlag;

  /**
   * 供应商分类id
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @NotBlank(message = "主键id不能为空")
  @JSONField(name = "id")
  private String id;

  /**
   * 分类名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "name")
  private String supplierTypeName;

  /**
   * 分类编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "number")
  private String supplierTypeNumber;

  /**
   * 分类标准编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "csspGroupStandardID_number")
  private String csspGroupStandardidNumber;

  /**
   * 分类标准名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "csspGroupStandardID_name")
  private String csspGroupStandardidName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitidNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitidName;

  /**
   * 上级分类编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "parentID_number")
  private String parentidNumber;

  /**
   * 上级分类级次
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "parentID_level")
  private Integer parentidLevel;

  /**
   * 上级分类名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "parentID_name")
  private String parentidName;

  /**
   * 禁用状态,1 = 普通, 2 = 作废
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "deletedStatus")
  private Integer deletedStatus;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "isLeaf")
  private Integer isLeaf;

  /**
   * 级次
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "level")
  private Integer level;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "longNumber")
  private String longNumber;

  /**
   * 显示名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "displayName")
  private String displayName;

  /**
   * 创建人编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "creatorID_number")
  private String creatoridNumber;

  /**
   * 创建人名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "creatorID_name")
  private String creatoridName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "lastUpdateTime")
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUseridNumber;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUseridName;

}
