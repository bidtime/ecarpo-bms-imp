/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.entity;

import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntityInteger;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table i_user
 *
 * @mbg.generated 2019-08-12 10:45:37
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class IUserDO extends MyEntityInteger {
  
    /**
     * 自增ID
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Integer id;

    /**
     * 用户名，一般就是手机
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String username;

    /**
     * 真实姓名
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String realname;

    /**
     * 密码
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String pwd;

    /**
     * 手机号
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String mobile;

    /**
     * 电子邮箱
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String email;

    /**
     * 是否是后台管理人员
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Integer isAdmin;

    /**
     * 注册过程中已完成的步骤
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Integer reg_step;

    /**
     * 注册时的IP地址
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String regIP;

    /**
     * 注册时间
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Date reg_time;

    /**
     * 性别（1男2女0未设置）
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Integer sex;

    /**
     * 生日
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Date birthday;

    /**
     * 上次登录时间
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Date last_login;

    /**
     * 是否在微信显示
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Integer is_weixin_show;

    /**
     * 商户微信公众号下的openid
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String openid;

    /**
     * 上次更新信息时间
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Date last_update;

    /**
     * 自我介绍
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String selfintro;

    /**
     * 省份ID
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String prov_id;

    /**
     * 城市ID
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String city_id;

    /**
     * 区县ID
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private String district_id;

    /**
     * 工作人员最后一次微信互动时间
     *
     * @mbg.generated 2019-08-12 10:45:37
     */
    private Date last_weixin_login;

}