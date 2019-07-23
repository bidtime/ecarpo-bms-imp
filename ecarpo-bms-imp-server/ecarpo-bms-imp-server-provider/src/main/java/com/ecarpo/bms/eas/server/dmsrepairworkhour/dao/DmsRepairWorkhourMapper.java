/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsrepairworkhour.dao;

import com.ecarpo.bms.eas.server.dmsrepairworkhour.entity.DmsRepairWorkhourDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "工时信息")
public interface DmsRepairWorkhourMapper extends BaseMapper<DmsRepairWorkhourDO> {
    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    int insert(DmsRepairWorkhourDO record);

    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    int insertSelective(DmsRepairWorkhourDO record);

    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    DmsRepairWorkhourDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    int updateByPrimaryKeySelective(DmsRepairWorkhourDO record);

    /**
     * This method corresponds to the database table dms_repair_workhour
     *
     * @mbg.generated 2019-07-22 16:41:30
     */
    int updateByPrimaryKey(DmsRepairWorkhourDO record);
}