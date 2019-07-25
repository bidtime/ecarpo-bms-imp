/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotBlank;

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
public class DmsFinanceClientUpdateDTO extends UpdateDTO {
  /**
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private Integer id;

 /**
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private Integer storeId;

 /**
  * 客户编码
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 @NotBlank(message = "客户编码不能为空")
 private String clientCode;

 /**
  * 客户名称
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String clientName;

 /**
  * 客户简称
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String shortName;

 /**
  * 客户检索码
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String retrievalCode;

 /**
  * 地址
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String address;

 /**
  * 邮政编码
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String postcode;

 /**
  * 省ID
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private Integer prov;

 /**
  * 市ID
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private Integer city;

 /**
  * 电话
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String phone;

 /**
  * 传真
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String fax;

 /**
  * 工商注册地
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String registerAddress;

 /**
  * 实际办公地
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String workAddress;

 /**
  * 工商注册号
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String businessRegister;

 /**
  * 税务登记号
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String taxRegister;

 /**
  * 财务联系人
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String financeName;

 /**
  * 财务联系人电话
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String financePhone;

 /**
  * 主联系人
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String mainName;

 /**
  * 主联系人电话
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String mainPhone;

 /**
  * 主联系人职务
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String mainDuty;

 /**
  * 备用联系人
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String reserveName;

 /**
  * 备用联系人电话
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String reservePhone;

 /**
  * 备用联系人职务
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String reserveDuty;

 /**
  * 账期
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String accountPeriod;

 /**
  * 临时账期
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String tempPeriod;

 /**
  * 最大欠款额度
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private BigDecimal maxDebt;

 /**
  * 临时额度
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private BigDecimal tempDebt;

 /**
  * 应收款
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private BigDecimal receivable;

 /**
  * 累计应收款
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private BigDecimal accReceivable;

 /**
  * 累计收款
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private BigDecimal accReceipt;

 /**
  * 状态
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private Integer status;

 /**
  * 创建人
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 //private Integer creator;

 /**
  * 创建时间
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 //private Date createTime;

 /**
  * 账户开户行
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String accountOpener;

 /**
  * 账户名称
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String accountName;

 /**
  * 账号
  *
  * @mbg.generated 2019-07-23 10:30:16
  */
 private String accountNum;
}
