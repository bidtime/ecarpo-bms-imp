/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.dao;

import com.ecarpo.bms.eas.server.dmshisrepairorderworkhours.entity.DmsHisRepairOrderWorkhoursDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "历史工时表")
public interface DmsHisRepairOrderWorkhoursMapper extends BaseMapper<DmsHisRepairOrderWorkhoursDO> {
    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    int insert(DmsHisRepairOrderWorkhoursDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    int insertSelective(DmsHisRepairOrderWorkhoursDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    DmsHisRepairOrderWorkhoursDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    int updateByPrimaryKeySelective(DmsHisRepairOrderWorkhoursDO record);

    /**
     * This method corresponds to the database table dms_his_repair_order_workhours
     *
     * @mbg.generated 2019-07-22 16:44:33
     */
    int updateByPrimaryKey(DmsHisRepairOrderWorkhoursDO record);
}