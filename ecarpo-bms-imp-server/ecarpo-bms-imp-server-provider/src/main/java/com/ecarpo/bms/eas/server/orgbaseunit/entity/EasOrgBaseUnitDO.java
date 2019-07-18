/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgbaseunit.entity;

import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/12
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasOrgBaseUnitDO extends DataEntity {
    /**
     * id
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    @PKField
    private String id;

    /**
     * 最后修改人编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String lastUpdateUserIdNumber;

    /**
     * 发运组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partTransportId;

    /**
     * 是否是行政组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isAdminOrgUnit;

    /**
     * hr组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partHrId;

    /**
     * 上级组织单元层级
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String parentIdLevel;

    /**
     * 成本中心组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partCostCenterId;

    /**
     * 是否是发运组织单元
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isTransportOrgUnit;

    /**
     * 失效日期
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Date invalidDate;

    /**
     * 维护cu
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String maintainCuIdName;

    /**
     * 描述
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String description;

    /**
     * 是否叶子节点
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isLeaf;

    /**
     * 是否是hr组织单元
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isHrOrgUnit;

    /**
     * 是否合并范围
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isUnion;

    /**
     * 行政组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partAdminId;

    /**
     * 财务组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partFiId;

    /**
     * 简称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String simpleName;

    /**
     * 质检组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partQualityId;

    /**
     * 是否是利润中心
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isProfitOrgUnit;

    /**
     * 助记码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String code;

    /**
     * 上级组织单元名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String parentIdName;

    /**
     * 对应的主账簿组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String mainOrgIdNumber;

    /**
     * 英文名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String englishName;

    /**
     * 控制单元编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String controlUnitIdNumber;

    /**
     * 销售组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partSaleId;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String controlUnitIdName;

    /**
     * 是否是销售组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isSaleOrgUnit;

    /**
     * 是否副账簿组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isAssistantOrg;

    /**
     * 是否是库存组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isStorageOrgUnit;

    /**
     * 利润中心组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partProfitCenterId;

    /**
     * 上级组织单元编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String parentIdNumber;

    /**
     * 版本号
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String versionNumber;

    /**
     * 是否是采购组织
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isPurchaseOrgUnit;

    /**
     * 是否是组
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isGrouping;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Date lastUpdateTime;

    /**
     * 是否启用
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isStart;

    /**
     * 是否冻结
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isFreeze;

    /**
     * 库存组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partStorageId;

    /**
     * 是否是质检组织单元
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isQualityOrgUnit;

    /**
     * 维护cu编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String maintainCuIdNumber;

    /**
     * 管理单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partCtrlId;

    /**
     * 采购组织单元拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partPurchaseId;

    /**
     * 最后修改人名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String lastUpdateUserIdName;

    /**
     * 合并单元组拓展
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String partUnionGroupId;

    /**
     * 是否是成本中心
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isCostOrgUnit;

    /**
     * 创建者编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String creatorIdNumber;

    /**
     * 组织类型信息
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String orgTypeStr;

    /**
     * 是否封存
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isOuSealUp;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String creatorIdName;

    /**
     * 对应的主账簿组织名称
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String mainOrgIdName;

    /**
     * 生效日期
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Date effectDate;

    /**
     * 是否是cu
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer isCu;

    /**
     * 长编码
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String longNumber;

    /**
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Long orgId;

    /**
     * 级次 level
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private Integer gradation;

    /**
     * 名称 name
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String define;

    /**
     * 编码 number
     *
     * @mbg.generated 2019-06-12 11:46:44
     */
    private String encrypt;
}