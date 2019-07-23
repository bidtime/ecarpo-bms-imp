/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorder.dao;

import com.ecarpo.bms.eas.server.dmshisrepairorder.entity.DmsHisRepairOrderDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "历史维修工单")
public interface DmsHisRepairOrderMapper extends BaseMapper<DmsHisRepairOrderDO> {
    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    int insert(DmsHisRepairOrderDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    int insertSelective(DmsHisRepairOrderDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    DmsHisRepairOrderDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    int updateByPrimaryKeySelective(DmsHisRepairOrderDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order
     *
     * @mbg.generated 2019-07-22 16:52:54
     */
    int updateByPrimaryKey(DmsHisRepairOrderDO record);
}