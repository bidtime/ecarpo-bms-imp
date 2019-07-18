/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.person.dto;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.bms.eas.personposition.dto.EasPersonPositionDTO;
import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.28
 * {
 * "idCardEndDate": "",
 * "lastUpdateUserID_number": "user",
 * "regresidenceID_number": "01",
 * "nationalityID_name": "",
 * "fullNamePingYin": "fansuwei",
 * "homePhone": "",
 * "description": "",
 * "simpleNamePingYin": "fsw",
 * "idCardIssueOrg": "",
 * "lenOfActualService": "0",
 * "gender": "",
 * "highestCompetencyID_number": "",
 * "checkState": "0",
 * "namePinYin": "",
 * "passportNO": "20060404125",
 * "simpleName": "",
 * "kaClassficationID_number": "",
 * "indexStr": "9999999",
 * "birthID_number": "",
 * "nativePlace": "",
 * "isStandby": "0",
 * "cell": "",
 * "highestTechPostID_number": "",
 * "hjAddress": "",
 * "birthID_name": "",
 * "highestSubDegreeId_name": "",
 * "employeeClassifyID_name": "",
 * "isStandbyCadre": "0",
 * "controlUnitID_number": "00",
 * "bloodType": "0",
 * "standingID_number": "",
 * "controlUnitID_name": "运通集团",
 * "idCardBeginDate": "",
 * "politicalFaceID_number": "13",
 * "politicalFaceID_name": "群众",
 * "standingID_name": "",
 * "effdt": "2006-04-04 00:00:00",
 * "number": "20060404125",
 * "rtx": "",
 * "createTime": "2015-05-06 20:49:48",
 * "birthday": "",
 * "wedID_name": "已婚",
 * "folkID_number": "01",
 * "employTechPostID_number": "",
 * "deletedStatus": "1",
 * "historyRelateID": "",
 * "idNum": "",
 * "homeplace": "",
 * "lastUpdateTime": "2017-08-05 10:32:08",
 * "healthID_name": "良好",
 * "state": "0",
 * "backupCell": "",
 * "id": "w2wYAp6sS12K5eawBFbU84Dvfe0=",
 * "highestSubDegreeId_number": "",
 * "wedID_number": "02",
 * "name": "范素伟",
 * "eMail": "",
 * "employeeTypeID_number": "001",
 * "highestTechPostID_name": "",
 * "lastUpdateUserID_name": "预设用户",
 * "nameShortPinYin": "",
 * "highestCompetencyID_name": "",
 * "kaClassficationID_name": "",
 * "employTechPostID_name": "",
 * "creatorID_number": "user",
 * "protocol": "",
 * "leffdt": "2199-12-31 00:00:00",
 * "idCardNO": "",
 * "extendFieldNumOne": "",
 * "creatorID_name": "预设用户",
 * "regresidenceID_name": "本市城镇",
 * "officePhone": "",
 * "employeeTypeID_name": "正式员工",
 * "oldName": "",
 * "positions": [{
 * "isPrimary": 1,
 * "position_name": "会计",
 * "position_number": "UC001-24"
 * }],
 * "folkID_name": "汉族",
 * "address": "",
 * "backupEMail": "",
 * "employeeClassifyID_number": "",
 * "healthID_number": "01",
 * "nationalityID_number": ""
 * }
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasPersonUpdateDTO extends UpdateDTO {


  /**
   * 身份证开始日期
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date idCardEndDate;

  /**
   * 最后修改者编号
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 户口类型
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "regresidenceID_number")
  private String regresidenceIdNumber;

  /**
   * 国籍名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "nationalityID_name")
  private String nationalityIdName;

  /**
   * 姓名
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String fullNamePingYin;

  /**
   * 家用电话
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String homePhone;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String description;

  /**
   * 姓名简拼
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String simpleNamePingYin;

  /**
   * 身份证签证机关
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String idCardIssueOrg;

  /**
   * 实际工龄
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "lenOfActualService")
  private Integer lenOfActualService;

  /**
   * 性别
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "gender")
  private Integer gender;


  /**
   * 最高职业资格编码名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestCompetencyID_number")
  private String highestCompetencyIdNumber;

  /**
   * 检查状态
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "checkState")
  private Integer checkState;

  /**
   * 姓名拼音
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String namePinYin;

  /**
   * 护照号码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String passportNO;

  /**
   * 姓名简拼
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String simpleName;


  /**
   * 记账分类
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "kaClassficationID_number")
  private String kaClassficationIdNumber;

  /**
   * 顺序号
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "index")
  private Integer idx;

  /**
   * 家庭出身编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "birthID_number")
  private String birthIdNumber;

  /**
   * 籍贯
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String nativePlace;

  /**
   * 是否人才后备
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "isStandby")
  private Integer isStandby;

  /**
   * 手机号码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String cell;


  /**
   * 最高职称编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestTechPostID_number")
  private String highestTechPostIdNumber;

  /**
   * 户口所在地
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String hjAddress;

  /**
   * 家庭出身名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "birthID_name")
  private String birthID_name;

  /**
   * 最高学位
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestSubDegreeId_name")
  private String highestSubDegreeIdName;

  /**
   * 人员类型名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employeeClassifyID_name")
  private String employeeClassifyIdName;

  /**
   * 是否后备人才
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Integer isStandbyCadre;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 血型
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "bloodType")
  private Integer bloodType;


  /**
   * 个人成分
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "standingID_number")
  private String standingIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 身份证 开始日期
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date idCardBeginDate;

  /**
   * 政治面貌编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "politicalFaceID_number")
  private String politicalFaceIdNumber;

  /**
   * 政治面貌名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "politicalFaceID_name")
  private String politicalFaceIdName;

  /**
   * 政治面貌名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "standingID_name")
  private String standingIdName;

  /**
   * 生效日期
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date effdt;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  @JSONField(name = "number")
  private String encrypt;

  /**
   * RTX号码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String rtx;

  private Date createTime;

  /**
   * 出生日期
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date birthday;

  /**
   * 婚姻状况名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "wedID_name")
  private String wedIdName;

  /**
   * 民族编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "folkID_number")
  private String folkIdNumber;

  /**
   * 公司聘任职称编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employTechPostID_number")
  private String employTechPostIdNumber;

  /**
   * 失效状态
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "deletedStatus")
  private Integer deletedStatus;

  /**
   * 历史相互关联字段
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "historyRelateID")
  private String historyRelateId;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String idNum;

  /**
   * 出生地
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String homeplace;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date lastUpdateTime;

  /**
   * 健康状况
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "healthID_name")
  private String healthIdName;

  private String state;

  /**
   * 备用手机号码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String backupCell;

  private String id;

  /**
   * 最高学位编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestSubDegreeId_number")
  private String highestSubDegreeIdNumber;

  /**
   * 婚姻状况
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "wedID_number")
  private String wedIdNumber;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-07-09 14:31:38
   */
  @JSONField(name = "name")
  private String define;


  /**
   * 电子邮件
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String eMail;

  /**
   * 员工状态
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employeeTypeID_number")
  private String employeeTypeIdNumber;

  /**
   * 最高职称名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestTechPostID_name")
  private String highestTechPostIdName;

  /**
   * 最后修改者名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 名称简拼
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String nameShortPinYin;

  /**
   * 最高职业资格名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "highestCompetencyID_name")
  private String highestCompetencyIdName;

  /**
   * 记账分类名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "kaClassficationID_name")
  private String kaClassficationIdName;


  /**
   * 公司聘任职称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employTechPostID_name")
  private String employTechPostIdName;

  /**
   * 创建者
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 协议
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String protocol;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private Date leffdt;

  /**
   * 身份证号
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String idCardNO;


  /**
   * 拓展字段1
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String extendFieldNumOne;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 户口类型名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "regresidenceID_name")
  private String regresidenceIdName;


  /**
   * 办公室电话
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String officePhone;

  /**
   * 员工状态
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employeeTypeID_name")
  private String employeeTypeIdName;

  /**
   * 曾用名
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String oldName;

  /**
   * 民族名称
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "folkID_name")
  private String folkIdName;

  /**
   * 通信地址
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String address;

  /**
   * 备用电子邮件
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  private String backupEMail;

  /**
   * 人员类型
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "employeeClassifyID_number")
  private String employeeClassifyIdNumber;

  /**
   * 健康状况
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "healthID_number")
  private String healthIdNumber;

  /**
   * 国籍编码
   *
   * @mbg.generated 2019-06-10 10:26:20
   */
  @JSONField(name = "nationalityID_number")
  private String nationalityIdNumber;

  private List<EasPersonPositionDTO> positions;

}
