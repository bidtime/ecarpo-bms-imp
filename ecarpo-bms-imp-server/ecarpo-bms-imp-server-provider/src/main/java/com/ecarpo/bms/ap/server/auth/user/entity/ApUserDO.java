/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.user.entity;

import java.util.Date;

import com.ecarpo.framework.common.annotation.InitialField;
import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table ap_user
 *
 * @mbg.generated 2018-08-17 17:55:27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApUserDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 用户id
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  @PKField
  private Long userId;

  /**
   * 部门id
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Long departId;

  /**
   * 组织id
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Long orgId;

  /**
   * 从属类型: 1:平台,2:集团,3:店面
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Integer orgType;

  /**
   * 用户编号
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String userCode;

  /**
   * 用户姓名
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String userName;

  /**
   * 账号
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String account;

  /**
   * 密码
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String pwd;

  /**
   * 性别字典id, dic_cls_id=100001
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Long sex;

  /**
   * 证件类型字典id, dic_cls_id=100002
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Long certDicId;

  /**
   * 证件号码
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String certNo;

  /**
   * 联系方式
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String contactPhone;

  /**
   * 入职日期
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Date entryDate;

  /**
   * 是否转正
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Integer formal;

  /**
   * 转正日期
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Date formalDate;

  /**
   * 是否参加评测
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Integer evaluate;

  /**
   * 职务名称
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String jobName;

  /**
   * 职务编号
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String jobCode;

  /**
   * 微信账号
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  @InitialField("")
  private String wechat;

  /**
   * 是否默认内置用户
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Integer god;

  /**
   * 最后登录时间
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private Date lastLogin;

  /**
   * email
   *
   * @mbg.generated 2018-08-13 20:54:11
   */
  private String email;

  /**
   * 头像
   *
   * @mbg.generated 2018-08-17 17:55:27
   */
  private String avatar;

  /**
   * 是否设定特殊管理范围
   *
   * @mbg.generated 2018-11-14 10:44:39
   */
  private Integer authOrgFlag;

}
