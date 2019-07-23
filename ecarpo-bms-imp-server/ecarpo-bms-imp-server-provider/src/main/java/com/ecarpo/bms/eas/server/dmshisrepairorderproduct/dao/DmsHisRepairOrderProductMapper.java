/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dao;

import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.entity.DmsHisRepairOrderProductDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "历史配件")
public interface DmsHisRepairOrderProductMapper extends BaseMapper<DmsHisRepairOrderProductDO> {
    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    int insert(DmsHisRepairOrderProductDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    int insertSelective(DmsHisRepairOrderProductDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    DmsHisRepairOrderProductDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    int updateByPrimaryKeySelective(DmsHisRepairOrderProductDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_product
     *
     * @mbg.generated 2019-07-22 16:50:45
     */
    int updateByPrimaryKey(DmsHisRepairOrderProductDO record);
}