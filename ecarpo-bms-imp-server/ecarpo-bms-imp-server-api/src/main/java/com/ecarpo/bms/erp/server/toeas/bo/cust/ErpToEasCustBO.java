/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.bo.cust;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
public class ErpToEasCustBO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 业务系统客户编码
   */
  private Long otherNumber;

  /**
   * 客户名称
   */
  private String name;

  /**
   * 行政组织编码
   */
  private String adminUnit;

  /**
   * 个人=1,公司=2
   */
  private Integer custType;

  /**
   * 首次到访日期
   */
  @JSONField(format = "yyyy-MM-dd HH:mm:ss")
  private Date firstDate;

  /**
   * 主联系方式
   */
  private String phone;

  /**
   * 证件类型 : 身份证=1,营业执照=2,军官证=3,护照=4,港澳通行证=5,其他=6
   */
  private Integer papersType;

  /**
   * 证件号
   */
  private String papersNum;

  /**
   * 关联销售顾问
   */
  private List<ErpToEasCustSalerBO> salers;

  /**
   * 关联联系人
   */
  private List<ErpToEasCustpersonBO> persons;

  /**
   * 关联车辆信息
   */
  private List<ErpToEasCustCarBO> vehicles;

}
