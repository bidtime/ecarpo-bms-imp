/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbasesupplier.dao;

import com.ecarpo.bms.eas.server.crmbasesupplier.entity.CrmBaseSupplierDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "供货商信息")
public interface CrmBaseSupplierMapper extends BaseMapper<CrmBaseSupplierDO> {
    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int insert(CrmBaseSupplierDO record);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int insertSelective(CrmBaseSupplierDO record);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    CrmBaseSupplierDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int updateByPrimaryKeySelective(CrmBaseSupplierDO record);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int updateByPrimaryKeyWithBLOBs(CrmBaseSupplierDO record);

    /**
     * This method corresponds to the database table crm_base_supplier
     *
     * @mbg.generated 2019-07-23 10:52:27
     */
    int updateByPrimaryKey(CrmBaseSupplierDO record);
}