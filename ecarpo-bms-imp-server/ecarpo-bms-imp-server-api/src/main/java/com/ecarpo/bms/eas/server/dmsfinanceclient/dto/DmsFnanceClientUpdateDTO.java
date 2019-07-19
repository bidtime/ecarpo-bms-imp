/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class DmsFnanceClientUpdateDTO extends UpdateDTO {

  /**
   * 云平台id
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String uid;

  /**
   * 是否修改过密码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isChangedPW")
  private Integer isChangedPw;

  /**
   * 登陆错误次数
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "errCount")
  private Integer errCount;

  /**
   * 引用id
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String referId;

  /**
   * 最后修改者编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 是否为业务管理员
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isBizAdmin")
  private Integer isBizAdmin;

  /**
   * 类型 系统用户=10,职员=20,客户=30,供应商=40,其他=50,认证管理员=60,审计管理员=70
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "type")
  private Integer type;

  /**
   * 密码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String password;

  /**
   * 家庭电话
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String homePhone;

  /**
   * 是否注册
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isRegister")
  private Integer isRegister;

  /**
   * 是否已经删除
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isDelete")
  private Integer isDelete;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String description;

  /**
   * 密码策略名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "securityId_name")
  private String securityIdName;

  /**
   * 手机号码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String cell;

  /**
   * 密码策略编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "securityId_number")
  private String securityIdNumber;

  /**
   * 编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "number")
  private String encrypt;
  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 密码生效日期
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String pweffectiveDate;

  /**
   * 电子邮件
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String email;

  /**
   * 是否锁定
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private Date lockedTime;

  /**
   * 所属用户编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "groupID_number")
  private String groupIdNumber;

  /**
   * 失效时间
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private Date invalidationDate;

  /**
   * 客户id
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "customerID")
  private String customerID;

  /**
   * 缺省使用语言
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String defaultLocale;

  private Date createTime;

  /**
   * 供应商id
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "supplierID")
  private String supplierID;

  /**
   * 主要角色编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "mainRoleID_number")
  private String mainRoleIdNumber;

  /**
   * 所属用户组名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "groupID_name")
  private String groupIdName;

  /**
   * 对应的操作人
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "personId_name")
  private String personIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private Date lastUpdateTime;

  /**
   * id
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String id;

  /**
   * 名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "name")
  private String define;

  /**
   * 对应的操作人编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "personId_number")
  private String personIdNumber;

  /**
   * 最后修改者名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 缺省组织编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "defOrgUnitID_number")
  private String defOrgUnitIdNumber;

  /**
   * 有效日期
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private Date effectiveDate;

  /**
   * 缺省组织名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "defOrgUnitID_name")
  private String defOrgUnitIdName;

  /**
   * 代理用户
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "agentUser")
  private Integer agentUser;

  /**
   * 历史密码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String pwdHisStr;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 办公室电话
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String officePhone;

  /**
   * 是否锁定
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isLocked")
  private Integer isLocked;

  /**
   * 登陆认证方式
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "loginAuthorWay")
  private Integer loginAuthorWay;

  /**
   * AD账号
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  private String adNumber;

  /**
   * 是否同步到云平台
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "isSynToCloud")
  private Integer isSynToCloud;

  /**
   * 备用电子邮件
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "backupEMail")
  private String backupEmail;

  /**
   * 是否禁用
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "forbidden")
  private Integer forbidden;

  /**
   * 主要角色名称
   *
   * @mbg.generated 2019-06-10 10:20:11
   */
  @JSONField(name = "mainRoleID_name")
  private String mainRoleIdName;

}
