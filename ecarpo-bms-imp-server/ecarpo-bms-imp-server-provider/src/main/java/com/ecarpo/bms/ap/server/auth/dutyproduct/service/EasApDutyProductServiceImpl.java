/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutyproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.dutyproduct.dao.ApDutyProductDAO;
import com.ecarpo.bms.ap.server.auth.dutyproduct.dao.ApDutyProductMapper;
import com.ecarpo.bms.ap.server.auth.dutyproduct.entity.ApDutyProductDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class EasApDutyProductServiceImpl extends
    BaseServiceImpl<ApDutyProductManager, ApDutyProductDAO, ApDutyProductMapper, ApDutyProductDO>
    implements EasApDutyProductService {
}
