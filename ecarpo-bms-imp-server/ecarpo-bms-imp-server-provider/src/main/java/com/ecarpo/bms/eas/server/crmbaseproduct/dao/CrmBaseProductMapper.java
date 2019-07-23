/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.dao;

import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDOWithBLOBs;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "产品设置")
public interface CrmBaseProductMapper extends BaseMapper<CrmBaseProductDO> {

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int insert(CrmBaseProductDOWithBLOBs record);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int insertSelective(CrmBaseProductDOWithBLOBs record);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    CrmBaseProductDOWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int updateByPrimaryKeySelective(CrmBaseProductDOWithBLOBs record);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int updateByPrimaryKeyWithBLOBs(CrmBaseProductDOWithBLOBs record);

    /**
     * This method corresponds to the database table crm_base_product
     *
     * @mbg.generated 2019-07-23 10:54:49
     */
    int updateByPrimaryKey(CrmBaseProductDO record);
}