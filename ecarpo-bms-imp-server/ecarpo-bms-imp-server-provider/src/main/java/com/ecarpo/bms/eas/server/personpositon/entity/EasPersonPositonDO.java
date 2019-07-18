/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.personpositon.entity;

import com.ecarpo.framework.common.annotation.PKField;
import com.ecarpo.framework.common.mapper.DataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @mbg.generated 2019/07/11
 * @PKField 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EasPersonPositonDO extends DataEntity {
    /**
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    @PKField
    private Long id;

    /**
     * 人员id
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    private String personId;

    /**
     * 职位id
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    private String positionId;

    /**
     * 是否主要职位 传递0或1
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    private Integer isPrimary;

    /**
     * 职位名称
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    private String positionName;

    /**
     * 职位编码
     *
     * @mbg.generated 2019-07-11 10:48:27
     */
    private String positionNumber;
}