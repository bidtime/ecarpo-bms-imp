/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmMemberCarInsertDTO extends InsertDTO {
  /**
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 //private Integer id;

 /**
  * 对应的会员ID
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer customId;

 /**
  * 对应的经销商ID
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer storeId;

 /**
  * 车牌号
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String plateNo;

 /**
  * 省份ID
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer provinceId;

 /**
  * VIN号
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String vinNum;

 /**
  * 变速箱
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String transmission;

 /**
  * 排放标准
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String emissionsStandards;

 /**
  * 对应的品牌ID
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer brand;

 /**
  * 品牌名称，当brand为0时，读取此字段
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String brandName;

 /**
  * 车系
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer carSeries;

 /**
  * 车系名称，当car_series为0时，读取此字段
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String seriesName;

 /**
  * 车型
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer carModel;

 /**
  * 车型名称，当car_model为0时，读取此字段
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String modelName;

 /**
  * 车身颜色
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String color;

 /**
  * 车架号
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String carFrameNum;

 /**
  * 发动机号
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String engineNum;

 /**
  * 开票日期,购车日期
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date invoiceDate;

 /**
  * 购车金额
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private BigDecimal cost;

 /**
  * 上牌日期
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date plateInstallDate;

 /**
  * 用车区域（省）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer useCarProvince;

 /**
  * 用车区域（城市）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer useCarCity;

 /**
  * 用车区域（城市名称）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String useCarCityName;

 /**
  * 销售渠道ID
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer salesChannels;

 /**
  * 是否延保（1是）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer isExtMaintain;

 /**
  * 延保开始日期
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date maintainSdate;

 /**
  * 年检日期
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date inspectionDate;

 /**
  * 预计下次保养日期[微信端专用]
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date nextMdate;

 /**
  * 保险公司
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String insuranceCompany;

 /**
  * 当前的保险到期日[微信端专用]
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date insuranceEdate;

 /**
  * 结束里程，最后里程
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer endMileage;

 /**
  * 换表里程，一般保养时用到
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer changeOdographMileage;

 /**
  * 是否意向车型（1是0不是）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer isIntention;

 /**
  * 任务ID（供任务管理模块使用）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer taskId;

 /**
  * 是否二手置换车（1是0不是）
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer isReplace;

 /**
  * 是否在本部投保(1是)
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer isShopInsurance;

 /**
  * 保险金额
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private BigDecimal insuranceMoney;

 /**
  * 上次保险办理时间
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Date insuranceTime;

 /**
  * 保险办理人
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private Integer insuranceCreator;

 /**
  * 车源编号
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String carsourceNum;

 /**
  * 备注
  *
  * @mbg.generated 2019-07-23 10:46:55
  */
 private String remark;
}
