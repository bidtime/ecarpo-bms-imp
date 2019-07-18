/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.orgadmin.entity;

import com.ecarpo.framework.common.mapper.DataEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/06/13
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasOrgAdminDO extends DataEntity {
    /**
     * id
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String id;

    /**
     * 预留组织基础资料一编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveItemFirstNumber;

    /**
     * 注册资本
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private BigDecimal registeredCapital;

    /**
     * 公司名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String companyIdName;

    /**
     * 公司编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String companyIdNumber;

    /**
     * 是否会计实体
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isEntity;

    /**
     * 联系电话
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String phoneNumber;

    /**
     * 组织机构代码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgcode;

    /**
     * 三级组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String officeIdNumber;

    /**
     * 六级组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelSixGroupIdName;

    /**
     * 是否境内
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isChurchyard;

    /**
     * 四级组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelFourGroupIdNumber;

    /**
     * 地址
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String adminAddress;

    /**
     * 区域编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String areaIdNumber;

    /**
     * 组织单元类型名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String layerTypeIdName;

    /**
     * 业务模块名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgPropertyIdName;

    /**
     * 组织单元类型编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String layerTypeIdNumber;

    /**
     * 预留文本一
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveFieldFirst;

    /**
     * 委托hr组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String delegateHrIdNumber;

    /**
     * 职务体系
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String jobSystemIdNumber;

    /**
     * 地区
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String territory;

    /**
     * 排序码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String sortCode;

    /**
     * 注册登记号
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String registeredCode;

    /**
     * 四级组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelFourGroupIdName;

    /**
     * 负责人名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String principalIdName;

    /**
     * 是否独立核算
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isIndependence;

    /**
     * 地区名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String areaIdName;

    /**
     * 登记注册类型
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String registTypeIdNumber;

    /**
     * 部门名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String departmentIdName;

    /**
     * 是否启用人力资源应用
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isStartShr;

    /**
     * 税务登记号
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String taxNumber;

    /**
     * 委托hr组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String delegateHrIdName;

    /**
     * 预留文本二名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveItemSecondName;

    /**
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgFunctionIdName;

    /**
     * 预留文本二
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveFieldSecond;

    /**
     * 业务板块编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgPropertyIdNumber;

    /**
     * 负责人编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String principalIdNumber;

    /**
     * 基本职能
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String baseDuty;

    /**
     * 负责人职位编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String responPositionIdNumber;

    /**
     * 营业有效期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date endUpDate;

    /**
     * 邮编
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String zipCode;

    /**
     * 五级组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelFiveGroupIdNumber;

    /**
     * 预留组织基础资料二编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveItemSecondNumber;

    /**
     * 负责人岗位名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String responPositionIdName;

    /**
     * 预留组织基础资料一名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String reserveItemFirstName;

    /**
     * 传真
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String fax;

    /**
     * 法人代表编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String juridicalPersonIdNumber;

    /**
     * 三级组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String officeIdName;

    /**
     * 所属行业名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String industryIdName;

    /**
     * 法人代表名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String juridicalPersonIdName;

    /**
     * 所属行业编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String industryIdNumber;

    /**
     * 五极组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelFiveGroupIdName;

    /**
     * 历史相互关联字段
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String historyRelateId;

    /**
     * 登记注册类型名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String registTypeIdName;

    /**
     * 是否法人公司
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isJuridicalCompany;

    /**
     * 六级组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String levelSixGroupIdNumber;

    /**
     * 职务体系名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String jobSystemIdName;

    /**
     * 部门编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String departmentIdNumber;

    /**
     * 组织层次名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String layerIdName;

    /**
     * 是否虚拟团队
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isVirtual;

    /**
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgFunctionIdNumber;

    /**
     * 经济类型
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer economicType;

    /**
     * 是否是采购组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isPurchaseOrgUnit;

    /**
     * 是否是组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isGrouping;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date lastUpdateTime;

    /**
     * 最后修改人编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String lastUpdateUserIdNumber;

    /**
     * 是否冻结
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isFreeze;

    /**
     * 组织封存时间
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date propertySealUpDate;

    /**
     * 是否启用
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isStart;

    /**
     * 是否是行政组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isAdminOrgUnit;

    /**
     * 地址名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String addressIdName;

    /**
     * 是否是发运组织单元
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isTransportOrgUnit;

    /**
     * 是否是质检组织单元
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isQualityOrgUnit;

    /**
     * 失效日期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date invalidDate;

    /**
     * 级次 level
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer gradation;

    /**
     * 描述
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String description;

    /**
     * 是否封存
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isSealUp;

    /**
     * 名称 name
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String define;

    /**
     * 是否叶子节点
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isLeaf;

    /**
     * 最后修改人名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String lastUpdateUserIdName;

    /**
     * 是否是财务组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isCompanyOrgUnit;

    /**
     * 是否是hr组织单元
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isHrOrgUnit;

    /**
     * 是否合并范围
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isUnion;

    /**
     * 是否是成本中心
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isCostOrgUnit;

    /**
     * 创建者编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String creatorIdNumber;

    /**
     * 简称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String simpleName;

    /**
     * ou是否封存
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isOuSealUp;

    /**
     * 组织类型信息
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String orgTypeStr;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String creatorIdName;

    /**
     * 生效日期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date effectDate;

    /**
     * 是否是利润中心
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isProfitOrgUnit;

    /**
     * 是否是cu
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isCu;

    /**
     * 编码 number
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String encrypt;

    /**
     * 上级组织名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String parentIdName;

    /**
     * 助记码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String code;

    /**
     * 控制单元编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String controlUnitIdNumber;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String controlUnitIdName;

    /**
     * 是否是销售组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isSaleOrgUnit;

    /**
     * 是否是库存组织
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Integer isStorageOrgUnit;

    /**
     * 上级组织编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String parentIdNumber;

    /**
     * 显示名称
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String displayName;

    /**
     * 长编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String longNumber;

    /**
     * 地址编码
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String addressIdNumber;

    /**
     * 成立日期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date setUpDate;

    /**
     * 版本号
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String versionNumber;

    /**
     * 序号 index
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private String idx;

    /**
     * 生效日期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date effdt;

    /**
     * 失效日期
     *
     * @mbg.generated 2019-06-13 14:43:43
     */
    private Date leffdt;
}