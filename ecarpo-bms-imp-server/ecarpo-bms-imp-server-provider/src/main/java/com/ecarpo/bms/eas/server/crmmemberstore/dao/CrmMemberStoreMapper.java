/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmemberstore.dao;

import com.ecarpo.bms.eas.server.crmmemberstore.entity.CrmMemberStoreDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "储值记录")
public interface CrmMemberStoreMapper extends BaseMapper<CrmMemberStoreDO> {

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int insert(CrmMemberStoreDO record);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int insertSelective(CrmMemberStoreDO record);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    CrmMemberStoreDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int updateByPrimaryKeySelective(CrmMemberStoreDO record);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int updateByPrimaryKeyWithBLOBs(CrmMemberStoreDO record);

    /**
     * This method corresponds to the database table crm_member_store
     *
     * @mbg.generated 2019-07-23 10:44:25
     */
    int updateByPrimaryKey(CrmMemberStoreDO record);
}