/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.position.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/10
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasPositionDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @mbg.generated 2019-07-09 14:32:12
   */
  @PKField
  private String id;

  /**
   * 岗位id
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Long erpDutyId;

  /**
   * 最后修改者编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String lastUpdateUserIdNumber;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date valiDate;

  /**
   * 职层层级
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String jobLevelNumber;

  /**
   * 职务编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String jobIdNumber;

  /**
   * 描述
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String description;

  /**
   * 是否负责人职位
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Integer isRespPosition;

  /**
   * 领域编号
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String domainIdNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String simpleName;

  /**
   * 序号 index
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Integer idx;

  /**
   * 最低职等名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String lowJobGradeIdName;

  /**
   * 产品线编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String productLineIdNumber;

  /**
   * 职位公有属性编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String pubProperLdapNumber;

  /**
   * 职位类别编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String positionTypeIdNumber;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String encrypt;

  /**
   * 上级职位
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String parentIdName;

  /**
   * 最高职等编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String highJobGradeIdNumber;

  /**
   * 领域名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String domainIdName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String controlUnitIdNumber;

  /**
   * 最高职等名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String highJobGradeIdName;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String controlUnitIdName;

  /**
   * 职层名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String jobLevelName;

  /**
   * 职位编制
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String posPlanCount;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date effdt;

  /**
   * 上级职位编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String parentIdNumber;

  /**
   * 失效状态 普通=1，作废=2
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Integer deletedStatus;

  /**
   * 历史相互关联字段
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String historyRelateId;

  /**
   * 职务名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String jobIdName;

  /**
   * 职位类别名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String positionTypeIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date lastUpdateTime;

  /**
   * 职位全集排序码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Integer sortCode;

  /**
   * 职位目的
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String purpose;

  /**
   * 行政组织编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String adminOrgUnitIdNumber;

  /**
   * 是否通过职务自动生成
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Integer isCreateByJob;

  /**
   * 行政组织名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String adminOrgUnitIdName;

  /**
   * 名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String define;

  /**
   * 职位公有属性名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String pubProperLdapName;

  /**
   * 最后修改者id
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String lastUpdateUserIdName;

  /**
   * 职位类别
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String positionTypeIdLevel;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String creatorIdNumber;

  /**
   * sHR失效日期
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date leffdt;

  /**
   * 最低职等名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String lowJobGradeIdNumber;

  /**
   * HR组织名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String hrOrgUnitIdName;

  /**
   * HR组织编码
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String hrOrgUnitIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String creatorIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date effectDate;

  /**
   * 产品线名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private String productLineIdName;

  /**
   * 异动考察期
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  private Date fluCheckTime;
}
