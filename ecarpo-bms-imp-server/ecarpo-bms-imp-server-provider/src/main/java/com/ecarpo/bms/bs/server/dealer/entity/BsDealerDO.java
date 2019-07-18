/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.dealer.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table bs_dealer
 *
 * @mbg.generated 2017-07-20 15:10:47
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BsDealerDO extends DataEntity {

  /**
   * 经销商id
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  @PKField
  private Long dealerId;

  /**
   * 集团id
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long groupId;

  /**
   * 所属品牌id
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long brandId;

  /**
   * 所属品牌名称
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String brandName;

  /**
   * 园区字典id, dic_cls_id=100008
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long zoneId;

  /**
   * 园区字典名称
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String zoneName;

  /**
   * 部门id
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long departId;

  /**
   * 合作类型字典id, dic_cls_id=100010
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long cooperTypeId;

  /**
   * 合作类型字典名称
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String cooperTypeName;

  /**
   * 售后电话
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String afterSaleTel;

  /**
   * 客服电话
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String serviceTel;

  /**
   * 救援电话
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String rescueTel;

  /**
   * 企业LogoUrl
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String logoUrl;

  /**
   * 封面Url
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String coverUrl;

  /**
   * 二维码（版本7）
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String qrCode;

  /**
   * 服务代码
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String serviceCode;

  /**
   * 销售代码
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String salesCode;

  /**
   * 经营业务类型字典id, dic_cls_id=100011
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long bizTypeId;

  /**
   * 经营业务类型字典名称
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String bizTypeName;

  /**
   * 是否已配置管理员
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Integer gaCreated;

  /**
   * 配置管理员账号
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private String gaAccount;

  /**
   * 配置管理员用户id
   *
   * @mbg.generated 2017-07-20 15:10:47
   */
  private Long gaUserId;

}
