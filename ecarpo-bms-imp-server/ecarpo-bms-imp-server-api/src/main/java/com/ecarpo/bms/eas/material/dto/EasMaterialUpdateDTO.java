/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.material.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.framework.model.UpdateDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.21
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasMaterialUpdateDTO extends UpdateDTO {

  /**
   * id
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料id不能为空")
  private String id;

  /**
   * 编码 number
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料编码不能为空")
  @JSONField(name = "number")
  private String encrypt;

  /**
   * 名称 name
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料名称不能为空")
  @JSONField(name = "name")
  private String define;

  /**
   * 最后修改者编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "lastUpdateUserID_number")
  private String lastUpdateUserIdNumber;

  /**
   * 暂存或保存
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer effectedStatus;

  /**
   * 基本计量单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "baseUnit_name")
  private String baseUnitName;

  /**
   * 体积单位编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "volumnUnit_number")
  private String volumnUnitNumber;

  /**
   * 外协件
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer isOutsourcedPart;

  /**
   * 高度
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal height;

  /**
   * 描述
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String description;

  /**
   * 辅助计量单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String assistUnitName;

  /**
   * 物料基本分类层级
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "materialGroup_level")
  private Integer materialGroupLevel;

  /**
   * 单价精度
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer pricePrecision;

  /**
   * 条形码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @Length(message = "条形码长度不能超过128", max = 128)
  @NotBlank(message = "条形码不能为空")
  private String barCode;

  /**
   * 辅助计量单位编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "assistUnit_number")
  private String assistUnitNumber;

  /**
   * 禁用组织名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "freezeOrgUnit_name")
  private String freezeOrgUnitName;

  /**
   * 设备属性 =-1,设备=0,备件=1,工具=2
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer equipProperty;

  /**
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String namePinYin;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料简称不能为空")
  private String simpleName;

  /**
   * 物料状态 未核准=0,核准=1,禁用=2,已删除=3
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer status;

  /**
   * 编码（全文索引使用）
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String number4idx;

  /**
   * 材料牌号名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "materialTrademark_name")
  private String materialTrademarkName;

  /**
   * 宽度
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal width;

  /**
   * 长度单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "lengthUnit_name")
  private String lengthUnitName;

  /**
   * 毛重
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal grossWeight;

  /**
   * 物料基本分类名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料基本分类名称不能为空")
  @JSONField(name = "materialGroup_name")
  private String materialGroupName;

  /**
   * 禁用组织编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "freezeOrgUnit_number")
  private String freezeOrgUnitNumber;

  /**
   * 控制单元编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "controlUnitID_number")
  private String controlUnitIdNumber;

  /**
   * 控制单元名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "controlUnitID_name")
  private String controlUnitIdName;

  /**
   * 工程图号
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String pictureNumber;

  /**
   * 重量单位编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "weightUnit_number")
  private String weightUnitNumber;

  /**
   * 是否检斤
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer isWeighted;

  /**
   * 物料基本分类编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "materialGroup_number")
  private String materialGroupNumber;

  /**
   * 材料牌号编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "materialTrademark_number")
  private String materialTrademarkNumber;

  /**
   * 规格型号
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String model;

  /**
   * 名称（全文索引使用）
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String name4idx;

  /**
   * 最后修改时间
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Date lastUpdateTime;

  /**
   * 辅助属性类别名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "assistAttr_name")
  private String assistAttrName;

  /**
   * 是否商品
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer isGoods;

  /**
   * 辅助属性类别编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "assistAttr_number")
  private String assistAttrNumber;

  /**
   * 修改版本
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotNull(message = "版本不能为空")
  private Integer version;

  /**
   * 管理组织编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "adminCUID_number")
  private String adminCuIdNumber;

  /**
   * 启用本物料设置的辅助属性
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotNull(message = "是否启用本物料设置的辅助属性不能为空")
  private Integer useAsstAttrRelation;

  /**
   * 是否同步到成本对象
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private Integer isSynochronous;

  /**
   * 批准文号
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String warrantNumber;

  /**
   * 长度
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal length;

  /**
   * 注册商标
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String registeredMark;

  /**
   * 最后修改人名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "lastUpdateUserID_name")
  private String lastUpdateUserIdName;

  /**
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String nameShortPinYin;

  /**
   * 体积单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "volumnUnit_name")
  private String volumnUnitName;

  /**
   * 创建者编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "creatorID_number")
  private String creatorIdNumber;

  /**
   * 外文名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料外文名称不能为空")
  private String foreignAme;

  /**
   * 创建者名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "creatorID_name")
  private String creatorIdName;

  /**
   * 别名
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "物料别名不能为空")
  private String alias;

  /**
   * 基本计量单位编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "baseUnit_number")
  private String baseUnitNumber;

  /**
   * 长度单位编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "lengthUnit_number")
  private String lengthUnitNumber;

  /**
   * 重量单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "weightUnit_name")
  private String weightUnitName;

  /**
   * 序列号计量单位名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "seqUnit_name")
  private String seqUnitName;

  /**
   * 净重
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal netWeight;

  /**
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "seqUnit_number")
  private String seqUnitNumber;

  /**
   * 旧编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String oldNumber;

  /**
   * 体积
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private BigDecimal volume;

  /**
   * 助记码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @NotBlank(message = "速记码不能为空")
  private String helpCode;

  /**
   * 简称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String shortName;

  /**
   * 长编码
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  private String longNumber;

  /**
   * 管理组织名称
   *
   * @mbg.generated 2019-06-18 09:08:22
   */
  @JSONField(name = "adminCUID_name")
  private String adminCuIdName;

  private List<SaveOrgRangeDTO> orgRanges;

  private List<SaveGroupDTO> groups;

}
