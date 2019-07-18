/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutymenu.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.dutymenu.dao.ApDutyMenuDAO;
import com.ecarpo.bms.ap.server.auth.dutymenu.dao.ApDutyMenuMapper;
import com.ecarpo.bms.ap.server.auth.dutymenu.entity.ApDutyMenuDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class EasApDutyMenuServiceImpl
    extends BaseServiceImpl<ApDutyMenuManager, ApDutyMenuDAO, ApDutyMenuMapper, ApDutyMenuDO>
    implements EasApDutyMenuService {

}
