/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.materialgroup.entity;

import java.util.Date;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/07/10
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasMaterialGroupDO extends DataEntity {
    /**
     * id
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    @PKField
    private String id;

    /**
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Long erpMaterialGroupId;

    /**
     * 编码 number
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String encrypt;

    /**
     * 级次 level
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Integer gradation;

    /**
     * 创建者编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String creatorIdNumber;

    /**
     * 创建者名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String creatorIdName;

    /**
     * 最后修改时间
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Date lastUpdateTime;

    /**
     * 最后修改人编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String lastUpdateUserIdNumber;

    /**
     * 最后修改人名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String lastUpdateUserIdName;

    /**
     * 分类标准编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String groupStandardIdNumber;

    /**
     * 分类标准名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String groupStandardIdName;

    /**
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Integer deletedStatus;

    /**
     * 上级组织层级
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Integer parentIdLevel;

    /**
     * 上级组织名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String parentIdName;

    /**
     * 控制单元编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String controlUnitIdNumber;

    /**
     * 控制单元名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String controlUnitIdName;

    /**
     * 名称 name
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String define;

    /**
     * 描述
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String description;

    /**
     * 是否叶子节点
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private Integer isLeaf;

    /**
     * 上级组织编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String parentIdNumber;

    /**
     * 显示名称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String displayName;

    /**
     * 长编码
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String longNumber;

    /**
     * 简称
     *
     * @mbg.generated 2019-07-10 11:45:48
     */
    private String simpleName;
}