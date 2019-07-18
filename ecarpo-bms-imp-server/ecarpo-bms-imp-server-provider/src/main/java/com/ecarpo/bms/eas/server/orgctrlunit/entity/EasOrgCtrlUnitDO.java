/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgctrlunit.entity;

import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/14
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasOrgCtrlUnitDO extends DataEntity {
    /**
     * id
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    @PKField
    private String id;

    /**
     * 是否是采购组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isPurchaseOrgUnit;

    /**
     * 是否是组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isGrouping;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Date lastUpdateTime;

    /**
     * 最后修改人编码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String lastUpdateUserIdNumber;

    /**
     * 是否冻结
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isFreeze;

    /**
     * 是否启用
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isStart;

    /**
     * 是否是行政组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isAdminOrgUnit;

    /**
     * 是否是发运组织单元
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isTransportOrgUnit;

    /**
     * 是否是质检组织单元
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isQualityOrgUnit;

    /**
     * 失效日期
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Date invalidDate;

    /**
     * 级次 level
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer gradation;

    /**
     * 描述
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String description;

    /**
     * 名称 name
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String define;

    /**
     * 是否叶子节点
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isLeaf;

    /**
     * 最后修改人名称
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String lastUpdateUserIdName;

    /**
     * 是否是财务组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isCompanyOrgUnit;

    /**
     * 是否是hr组织单元
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isHrOrgUnit;

    /**
     * 是否合并范围
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isUnion;

    /**
     * 是否是成本中心
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isCostOrgUnit;

    /**
     * 创建者编码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String creatorIdNumber;

    /**
     * 简称
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String simpleName;

    /**
     * ou是否封存
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isOuSealUp;

    /**
     * 组织类型信息
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String orgTypeStr;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String creatorIdName;

    /**
     * 生效日期
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Date effectDate;

    /**
     * 是否是利润中心
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isProfitOrgUnit;

    /**
     * 是否是cu
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isCu;

    /**
     * 编码 number
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String encrypt;

    /**
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String parentIdName;

    /**
     * 助记码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String code;

    /**
     * 控制单元编码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String controlUnitIdNumber;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String controlUnitIdName;

    /**
     * 是否是销售组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isSaleOrgUnit;

    /**
     * 是否是库存组织
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private Integer isStorageOrgUnit;

    /**
     * 上级组织编码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String parentIdNumber;

    /**
     * 显示名称
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String displayName;

    /**
     * 长编码
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String longNumber;

    /**
     * 版本号
     *
     * @mbg.generated 2019-06-14 11:09:59
     */
    private String versionNumber;
}