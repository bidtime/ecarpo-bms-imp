/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.supplier.suppliertype.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/05
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasSupplierTypeDO extends DataEntity {

  /**
   * 供应商分类id
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  @PKField
  private String id;

  /**
   * 分类名称
   *
   * @mbg.generated 2019-06-12 16:19:08
   */
  private String supplierTypeName;

  /**
   * 分类编码
   *
   * @mbg.generated 2019-06-12 16:19:08
   */
  private String supplierTypeNumber;

  /**
   * 分类标准编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String csspGroupStandardidNumber;

  /**
   * 分类标准名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String csspGroupStandardidName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String controlUnitidNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String controlUnitidName;

  /**
   * 上级分类编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String parentidNumber;

  /**
   * 上级分类级次
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private Integer parentidLevel;

  /**
   * 上级分类名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String parentidName;

  /**
   * 禁用状态,1 = 普通, 2 = 作废
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private Integer deletedStatus;

  /**
   * 是否叶子节点
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private Integer isLeaf;

  /**
   * 级次
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private Integer level;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String longNumber;

  /**
   * 显示名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String displayName;

  /**
   * 创建人编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String creatoridNumber;

  /**
   * 创建人名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String creatoridName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private Date lastUpdateTime;

  /**
   * 最后修改人编码
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String lastUpdateUseridNumber;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-05 13:37:35
   */
  private String lastUpdateUseridName;
}
