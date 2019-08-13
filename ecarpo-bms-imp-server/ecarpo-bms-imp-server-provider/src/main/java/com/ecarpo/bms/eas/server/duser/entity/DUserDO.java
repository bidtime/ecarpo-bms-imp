/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.duser.entity;

import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table d_user
 *
 * @mbg.generated 2019-08-12 10:46:26
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class DUserDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer id;

    /**
     * 上级领导id
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer leaderid;

    /**
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer userId;

    /**
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String userName;

    /**
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String mail;

    /**
     * 门店id
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer storeid;

    /**
     * 姓名
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String name;

    /**
     * 手机号
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String phone;

    /**
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer department;

    /**
     * 离职日期
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Date leavedate;

    /**
     * 是否是后台管理人员
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer isadmin;

    /**
     * 咨询范围
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String advisory;

    /**
     * 联系类型
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String linktype;

    /**
     * 头像id
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer imageid;

    /**
     * 微信openid
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private String openid;

    /**
     * 工作人员最后一次微信互动时间
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer lastVisitEzs;

    /**
     * 是否在微信显示
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer iswx;

    /**
     * 员工在职离职状态
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    //private String state;

    /**
     * 添加时间
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Date addtime;

    /**
     * 最近登录时间
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Date loginTime;

    /**
     * 账号类型：1-总店，2-店
     *
     * @mbg.generated 2019-08-12 10:46:26
     */
    private Integer type;
}