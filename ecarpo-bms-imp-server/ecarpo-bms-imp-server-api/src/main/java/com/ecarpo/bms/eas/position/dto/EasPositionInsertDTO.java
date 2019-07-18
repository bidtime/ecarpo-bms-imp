/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.position.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 * {
 * "lastUpdateUserID_number": "20161114016",
 * "valiDate": "",
 * "jobLevel_number": "340",
 * "jobID_number": "JX-03-S06-01",
 * "description": "",
 * "isRespPosition": "1",
 * "domainID_number": "02",
 * "simpleName": "",
 * "index": "0",
 * "lowJobGradeID_name": "7",
 * "productLineID_number": "",
 * "pubProperLdap_number": "",
 * "positionTypeID_number": "",
 * "number": "JX-03-S06-01-000001",
 * "parentID_name": "总监",
 * "highJobGradeID_number": "009",
 * "domainID_name": "否",
 * "controlUnitID_number": "00",
 * "highJobGradeID_name": "9",
 * "controlUnitID_name": "运通集团",
 * "jobLevel_name": "三",
 * "posPlanCount": "",
 * "effdt": "1900-01-01 00:00:00",
 * "parentID_number": "JX-04-M01-00-000001",
 * "createTime": "2017-04-24 09:15:42",
 * "deletedStatus": "1",
 * "historyRelateID": "",
 * "jobID_name": "运营经理",
 * "positionTypeID_name": "",
 * "lastUpdateTime": "2019-05-28 16:36:17",
 * "sortCode": "",
 * "purpose": "",
 * "adminOrgUnitID_number": "00.SP000.04.05.02",
 * "isCreateByJob": "",
 * "adminOrgUnitID_name": "运营部",
 * "id": "ZguZnY+aSjWjxkxaiHMMu3SuYS4=",
 * "name": "运营经理",
 * "pubProperLdap_name": "",
 * "lastUpdateUserID_name": "卢硕",
 * "positionTypeID_level": "",
 * "creatorID_number": "20161114016",
 * "leffdt": "2199-12-31 00:00:00",
 * "lowJobGradeID_number": "007",
 * "hrOrgUnitID_name": "运通集团",
 * "hrOrgUnitID_number": "00",
 * "creatorID_name": "卢硕",
 * "effectDate": "",
 * "productLineID_name": "",
 * "fluCheckTime": "0"
 * }
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasPositionInsertDTO extends InsertDTO {

  /**
   * 最后修改者编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date valiDate;

  /**
   * 职层层级
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "jobLevel_number")
  private String jobLevelNumber;

  /**
   * 职务编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "jobID_number")
  private String jobIdNumber;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private String description;

  /**
   * 是否负责人职位
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Integer isRespPosition;

  /**
   * 领域编号
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "domainID_number")
  private String domainIdNumber;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private String simpleName;

  /**
   * 序号
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "index")
  private Integer idx;


  /**
   * 最低职等名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "lowJobGradeID_name")
  private String lowJobGradeIdName;

  /**
   * 产品线编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "productLineID_number")
  private String productLineIdNumber;

  /**
   * 职位公有属性编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "pubProperLdap_number")
  private String pubProperLdapNumber;

  /**
   * 职位类别编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "positionTypeID_number")
  private String positionTypeIdNumber;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * 上级职位
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "parentID_name")
  private String parentIdName;

  /**
   * 最高职等编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "highJobGradeID_number")
  private String highJobGradeIdNumber;

  /**
   * 领域名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "domainID_name")
  private String domainIdName;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 最高职等名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "highJobGradeID_name")
  private String highJobGradeIdName;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 职层名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "jobLevel_name")
  private String jobLevelName;

  /**
   * 职位编制
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private String posPlanCount;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date effdt;

  /**
   * 上级职位编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "parentID_number")
  private String parentIdNumber;

  private Date createTime;


  /**
   * 失效状态 普通=1，作废=2
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "deletedStatus")
  private Integer deletedStatus;


  /**
   * 历史相互关联字段
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "historyRelateID")
  private String historyRelateId;

  /**
   * 职务名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "jobID_name")
  private String jobIdName;

  /**
   * 职位类别名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "positionTypeID_name")
  private String positionTypeIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date lastUpdateTime;

  /**
   * 职位全集排序码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "sortCode")
  private Integer sortCode;

  /**
   * 职位目的
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private String purpose;


  /**
   * 行政组织编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "adminOrgUnitID_number")
  private String adminOrgUnitIdNumber;

  /**
   * 是否通过职务自动生成
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Integer isCreateByJob;

  /**
   * 行政组织名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "adminOrgUnitID_name")
  private String adminOrgUnitIdName;

  private String id;

  /**
   * 名称
   *
   * @mbg.generated 2019-07-09 14:32:12
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 职位公有属性名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "pubProperLdap_name")
  private String pubProperLdapName;

  /**
   * 最后修改者id
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 职位类别
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "positionTypeID_level")
  private String positionTypeIdLevel;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * sHR失效日期
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date leffdt;

  /**
   * 最低职等名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "lowJobGradeID_number")
  private String lowJobGradeIdNumber;

  /**
   * HR组织名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "hrOrgUnitID_name")
  private String hrOrgUnitIdName;

  /**
   * HR组织编码
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "hrOrgUnitID_number")
  private String hrOrgUnitIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date effectDate;

  /**
   * 产品线名称
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  @JSONField(name = "productLineID_name")
  private String productLineIdName;

  /**
   * 异动考察期
   *
   * @mbg.generated 2019-06-10 10:29:06
   */
  private Date fluCheckTime;
}
