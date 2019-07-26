/*
 * Copyright 2019 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.numberqueue.entity;

import java.util.Date;

import com.ecarpo.bms.eas.server.data.MyEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table serial_number_queue
 *
 * @mbg.generated 2019-07-26 15:38:22
 */
@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class SerialNumberQueueDO extends MyEntity {
    /**
     *
     * @mbg.generated 2019-07-26 15:38:22
     */
    private Date date;

    /**
     *
     * @mbg.generated 2019-07-26 15:38:22
     */
    private Integer storeId;

    /**
     *
     * @mbg.generated 2019-07-26 15:38:22
     */
    private String flag;

    /**
     *
     * @mbg.generated 2019-07-26 15:38:22
     */
    private Integer number;
}