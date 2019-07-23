/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.dmsfinanceclient.dao;

import com.ecarpo.bms.eas.server.dmsfinanceclient.entity.DmsFinanceClientDO;
import com.ecarpo.framework.common.annotation.MapperDesc;
import com.ecarpo.framework.common.mapper.BaseMapper;

@MapperDesc(value = "往来客户")
public interface DmsFinanceClientMapper extends BaseMapper<DmsFinanceClientDO> {
    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    int insert(DmsFinanceClientDO record);

    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    int insertSelective(DmsFinanceClientDO record);

    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    DmsFinanceClientDO selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    int updateByPrimaryKeySelective(DmsFinanceClientDO record);

    /**
     * This method corresponds to the database table dms_finance_client
     *
     * @mbg.generated 2019-07-23 10:30:16
     */
    int updateByPrimaryKey(DmsFinanceClientDO record);
}