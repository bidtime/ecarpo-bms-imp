/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.measureunit.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.measureunit.dao.ApMeasureUnitDAO;
import com.ecarpo.bms.ap.server.measureunit.dao.ApMeasureUnitMapper;
import com.ecarpo.bms.ap.server.measureunit.entity.ApMeasureUnitDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class ApMeasureUnitManager
    extends BaseDAOManager<ApMeasureUnitDAO, ApMeasureUnitMapper, ApMeasureUnitDO> {

}
