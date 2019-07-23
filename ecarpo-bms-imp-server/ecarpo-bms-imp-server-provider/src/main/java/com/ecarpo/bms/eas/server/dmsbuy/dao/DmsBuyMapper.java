/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuy.dao;

import com.ecarpo.bms.eas.server.dmsbuy.entity.DmsBuyDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "DMS采购")
public interface DmsBuyMapper extends BaseMapper<DmsBuyDO> {
    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int insert(DmsBuyDO record);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int insertSelective(DmsBuyDO record);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    DmsBuyDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int updateByPrimaryKeySelective(DmsBuyDO record);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int updateByPrimaryKeyWithBLOBs(DmsBuyDO record);

    /**
     * This method corresponds to the database table dms_buy
     *
     * @mbg.generated 2019-07-23 11:12:52
     */
    int updateByPrimaryKey(DmsBuyDO record);
}