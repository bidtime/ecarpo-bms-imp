/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmmembercar.dao;

import com.ecarpo.bms.eas.server.crmmembercar.entity.CrmMemberCarDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "会员车辆")
public interface CrmMemberCarMapper extends BaseMapper<CrmMemberCarDO> {

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int insert(CrmMemberCarDO record);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int insertSelective(CrmMemberCarDO record);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    CrmMemberCarDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int updateByPrimaryKeySelective(CrmMemberCarDO record);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int updateByPrimaryKeyWithBLOBs(CrmMemberCarDO record);

    /**
     * This method corresponds to the database table crm_member_car
     *
     * @mbg.generated 2019-07-23 10:46:55
     */
    int updateByPrimaryKey(CrmMemberCarDO record);
}