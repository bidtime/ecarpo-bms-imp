/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.person.entity;

import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/10
 * @PKField
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasPersonDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 人员id
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  @PKField
  private String id;

  /**
   * 身份证开始日期
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date idCardEndDate;

  /**
   * 最后修改者编号
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String lastUpdateUserIdNumber;

  /**
   * 户口类型
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String regresidenceIdNumber;

  /**
   * 国籍名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String nationalityIdName;

  /**
   * 姓名
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String fullNamePingYin;

  /**
   * 家用电话
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String homePhone;

  /**
   * 描述
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String description;

  /**
   * 姓名简拼
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String simpleNamePingYin;

  /**
   * 身份证签证机关
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String idCardIssueOrg;

  /**
   * 实际工龄
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer lenOfActualService;

  /**
   * 性别
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer gender;

  /**
   * 最高职业资格编码名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestCompetencyIdNumber;

  /**
   * 检查状态
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer checkState;

  /**
   * 姓名拼音
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String namePinYin;

  /**
   * 护照号码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String passportNo;

  /**
   * 姓名简拼
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String simpleName;

  /**
   * 记账分类
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String kaClassficationIdNumber;

  /**
   * 顺序号 index
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer idx;

  /**
   * 家庭出身编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String birthIdNumber;

  /**
   * 籍贯
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String nativePlace;

  /**
   * 是否人才后备
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer isStandby;

  /**
   * 手机号码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String cell;

  /**
   * 最高职称编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestTechPostIdNumber;

  /**
   * 户口所在地
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String hjAddress;

  /**
   * 家庭出身名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String birthIdName;

  /**
   * 最高学位
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestSubDegreeIdName;

  /**
   * 人员类型名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employeeClassifyIdName;

  /**
   * 是否后备人才
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer isStandbyCadre;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String controlUnitIdNumber;

  /**
   * 血型
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer bloodType;

  /**
   * 个人成分
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String standingIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String controlUnitIdName;

  /**
   * 身份证 开始日期
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date idCardBeginDate;

  /**
   * 政治面貌编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String politicalFaceIdNumber;

  /**
   * 政治面貌名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String politicalFaceIdName;

  /**
   * 个人成份名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String standingIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date effdt;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String encrypt;

  /**
   * RTX号码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String rtx;

  /**
   * 出生日期
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date birthday;

  /**
   * 婚姻状况名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String wedIdName;

  /**
   * 民族编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String folkIdNumber;

  /**
   * 公司聘任职称编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employTechPostIdNumber;

  /**
   * 失效状态
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Integer deletedStatus;

  /**
   * 历史相互关联字段
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String historyRelateId;

  /**
   * 助记码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String idNum;

  /**
   * 出生地
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String homeplace;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date lastUpdateTime;

  /**
   * 健康状况
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String healthIdName;

  /**
   * 备用手机号码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String backupCell;

  /**
   * 最高学位编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestSubDegreeIdNumber;

  /**
   * 婚姻状况
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String wedIdNumber;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String define;

  /**
   * 电子邮件
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String email;

  /**
   * 员工状态
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employeeTypeIdNumber;

  /**
   * 最高职称名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestTechPostIdName;

  /**
   * 最后修改者名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String lastUpdateUserIdName;

  /**
   * 名称简拼
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String nameShortPinYin;

  /**
   * 最高职业资格名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String highestCompetencyIdName;

  /**
   * 记账分类名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String kaClassficationIdName;

  /**
   * 公司聘任职称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employTechPostIdName;

  /**
   * 创建者
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String creatorIdNumber;

  /**
   * 协议
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String protocol;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Date leffdt;

  /**
   * 身份证号
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String idCardNo;

  /**
   * 拓展字段1
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String extendFieldNumOne;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String creatorIdName;

  /**
   * 户口类型名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String regresidenceIdName;

  /**
   * 办公室电话
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String officePhone;

  /**
   * 员工状态
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employeeTypeIdName;

  /**
   * 曾用名
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String oldName;

  /**
   * 民族名称
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String folkIdName;

  /**
   * 通信地址
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String address;

  /**
   * 备用电子邮件
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String backupEmail;

  /**
   * 人员类型
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String employeeClassifyIdNumber;

  /**
   * 健康状况
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String healthIdNumber;

  /**
   * 国籍编码
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private String nationalityIdNumber;

  /**
   * ERP的用户主键id
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  private Long erpUserId;
}
