/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.customer.entity;

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
public class EasCustomerDO extends DataEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * id
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  @PKField
  private String id;

  /**
   * 云平台id
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String uid;

  /**
   * 是否修改过密码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isChangedPw;

  /**
   * 登陆错误次数
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer errCount;

  /**
   * 引用id
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String referid;

  /**
   * 最后修改者编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String lastUpdateUserIdNumber;

  /**
   * 是否为业务管理员
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isBizAdmin;

  /**
   * 类型 系统用户=10,职员=20,客户=30,供应商=40,其他=50,认证管理员=60,审计管理员=70
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer type;

  /**
   * 密码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String password;

  /**
   * 家庭电话
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String homephone;

  /**
   * 是否注册
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isRegister;

  /**
   * 是否已经删除
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isDelete;

  /**
   * 描述
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String description;

  /**
   * 密码策略名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String securityIdName;

  /**
   * 手机号码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String cell;

  /**
   * 密码策略编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String securityIdNumber;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String encrypt;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String controlUnitIdName;

  /**
   * 密码生效日期
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Date pweffectiveDate;

  /**
   * 电子邮件
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String email;

  /**
   * 是否锁定
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Date lockedTime;

  /**
   * 所属用户编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String groupIdNumber;

  /**
   * 失效时间
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Date invalidationDate;

  /**
   * 客户id
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String customerId;

  /**
   * 缺省使用语言
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String defaultLocale;

  /**
   * 供应商id
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String supplierId;

  /**
   * 主要角色编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String mainRoleIdNumber;

  /**
   * 所属用户组名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String groupIdName;

  /**
   * 对应的操作人
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String personIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Date lastUpdateTime;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String define;

  /**
   * 对应的操作人编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String personIdNumber;

  /**
   * 最后修改者名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String lastUpdateUserIdName;

  /**
   * 缺省组织编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String defOrgUnitIdNumber;

  /**
   * 有效日期
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Date effectiveDate;

  /**
   * 缺省组织名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String defOrgUnitIdName;

  /**
   * 代理用户
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer agentUser;

  /**
   * 历史密码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String pwdHisStr;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String creatorIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String creatorIdName;

  /**
   * 办公室电话
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String officePhone;

  /**
   * 是否锁定
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isLocked;

  /**
   * 登陆认证方式
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer loginAuthorWay;

  /**
   * AD账号
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String adNumber;

  /**
   * 是否同步到云平台
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer isSynToCloud;

  /**
   * 备用电子邮件
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String backupEmail;

  /**
   * 是否禁用
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private Integer forbidden;

  /**
   * 主要角色名称
   *
   * @mbg.generated 2019-07-09 14:32:49
   */
  private String mainRoleIdName;
}
