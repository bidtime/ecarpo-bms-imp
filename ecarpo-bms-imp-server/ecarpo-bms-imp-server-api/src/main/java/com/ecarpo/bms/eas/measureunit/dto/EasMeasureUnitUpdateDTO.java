/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.measureunit.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.21
 * {
 * "interfaceType": "insert",
 * "FCoefficient": "1",
 * "FIsBaseUnit": "0",
 * "FDisabledDate": "2019-05-06 12:12:12",
 * "FIsDisabled": "1",
 * "FGroupID_number": "011",
 * "FGroupID_name": "奔驰",
 * "FGroupID_level": "2",
 * "FQtyPrecision": "2",
 * "FName": "testname",
 * "FNumber": "testNumber",
 * "FDescription": "描述",
 * "FSimpleName": "简称",
 * "FCreatorID_number": "011",
 * "FCreatorID_name": "yonghu",
 * "FCreateTime": "2019-05-06 12:12:12",
 * "FLastUpdateUserID_number": "022",
 * "FLastUpdateUserID_name": "yonghu",
 * "FLastUpdateTime": "2019-05-06 12:12:12",
 * "FControlUnitID_number": "0103",
 * "FControlUnitID_name": "汽车板块",
 * "FID": "Fsdfsdfsfsf"
 * }
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasMeasureUnitUpdateDTO extends UpdateDTO {

  /**
   * 换算单位
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  private BigDecimal coefficient;

  /**
   * 是否是基本单位
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @NotNull(message = "是否是基本单位不能为空")
  private Integer isBaseUnit;

  /**
   * 失效日期
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  private Date disabledDate;

  /**
   * 禁用
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @NotNull(message = "停用启用状态不能为空")
  private Integer isDisabled;

  /**
   * 计量单位组编号
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "groupID_number")
  private String groupIdNumber;

  /**
   * 机灵单位组名称
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "groupID_name")
  private String groupIdName;

  /**
   * 计量单位组层级
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "groupID_level")
  private Integer groupIdLevel;

  /**
   * 数量精度
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @NotNull(message = "数量精度不能为空")
  private Integer qtyPrecision;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-06-18 14:10:36
   */
  @NotBlank(message = "计量单位编码不能为空")
  @JSONField(name="number")
  private String encrypt;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-06-18 14:10:36
   */
  @NotBlank(message = "计量单位名称不能为空")
  @JSONField(name="name")
  private String define;

  /**
   * 描述
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  private String description;

  /**
   * 简称
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  private String simpleName;

  /**
   * 创建者编号
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  private Date createTime;

  /**
   * 最后修改者编号
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 最后修改者名称
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  private Date lastUpdateTime;

  /**
   * 控制单元编号
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-05-31 14:52:51
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  @NotBlank(message = "计量单位id不能为空")
  private String id;

}
