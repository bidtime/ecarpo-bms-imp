/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table crm_base_supplier
 *
 * @mbg.generated 2019-07-23 10:52:27
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CrmBaseSupplierDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer id;

    /**
     * 经销商ID
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer storeId;

    /**
     * 供货商的dealer_id
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer supplierStoreId;

    /**
     * 供货商名称
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String name;

    /**
     * 供货商编码（唯一）
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String code;

    /**
     * 手机
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String tel;

    /**
     * 电话
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String mobile;

    /**
     * 传真
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String fax;

    /**
     * 邮箱
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String mail;

    /**
     * 加入日期
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Date cdate;

    /**
     * 邮政编码
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String postcode;

    /**
     * 网址
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String website;

    /**
     * 联系人
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String linkman;

    /**
     * 所属行业
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer businessId;

    /**
     * 工商注册号
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String businessNum;

    /**
     * 法定代表人
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String boss;

    /**
     * 省
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer province;

    /**
     * 市
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer city;

    /**
     * 地址
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String address;

    /**
     * 开户银行
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String bank;

    /**
     * 银行账号
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private String account;

    /**
     * 开业日期
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Date openDate;

    /**
     * 应付款
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private BigDecimal payable;

    /**
     * 累计应付款
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private BigDecimal accPayable;

    /**
     * 累计付款
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private BigDecimal accPayment;

    /**
     * 状态
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer status;

    /**
     * 删除状态（1已删2未删）
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer isDel;

    /**
     * 供应商类型：1集团统采，2协议供货商，3临时采购
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    private Integer type;
}