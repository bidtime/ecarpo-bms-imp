/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userduty.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.ap.server.auth.userduty.dao.ApUserDutyDAO;
import com.ecarpo.bms.ap.server.auth.userduty.dao.ApUserDutyMapper;
import com.ecarpo.bms.ap.server.auth.userduty.entity.ApUserDutyDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
@Transactional(readOnly = true)
public class EasApUserDutyServiceImpl
    extends BaseServiceImpl<ApUserDutyManager, ApUserDutyDAO, ApUserDutyMapper, ApUserDutyDO>
    implements EasApUserDutyService {

}
