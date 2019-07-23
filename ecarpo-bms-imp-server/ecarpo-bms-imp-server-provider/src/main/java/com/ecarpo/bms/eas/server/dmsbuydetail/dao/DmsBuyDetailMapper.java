/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsbuydetail.dao;

import com.ecarpo.bms.eas.server.dmsbuydetail.entity.DmsBuyDetailDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "采购单明细")
public interface DmsBuyDetailMapper extends BaseMapper<DmsBuyDetailDO> {
    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int insert(DmsBuyDetailDO record);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int insertSelective(DmsBuyDetailDO record);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    DmsBuyDetailDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int updateByPrimaryKeySelective(DmsBuyDetailDO record);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int updateByPrimaryKeyWithBLOBs(DmsBuyDetailDO record);

    /**
     * This method corresponds to the database table dms_buy_detail
     *
     * @mbg.generated 2019-07-23 10:38:13
     */
    int updateByPrimaryKey(DmsBuyDetailDO record);
}