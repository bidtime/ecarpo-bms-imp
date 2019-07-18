/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.duty.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.duty.dao.ApDutyDAO;
import com.ecarpo.bms.ap.server.auth.duty.dao.ApDutyMapper;
import com.ecarpo.bms.ap.server.auth.duty.entity.ApDutyDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasApDutyServiceImpl extends
    BaseServiceImpl<ApDutyManager, ApDutyDAO, ApDutyMapper, ApDutyDO> implements EasApDutyService {
}
