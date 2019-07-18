/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.orgrange.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.orgrange.service.EasOrgRangeService;
import com.ecarpo.bms.eas.server.orgrange.dao.EasOrgRangeDAO;
import com.ecarpo.bms.eas.server.orgrange.dao.EasOrgRangeMapper;
import com.ecarpo.bms.eas.server.orgrange.entity.EasOrgRangeDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasOrgRangeServiceImpl
    extends BaseServiceImpl<EasOrgRangeManager, EasOrgRangeDAO, EasOrgRangeMapper, EasOrgRangeDO>
    implements EasOrgRangeService {

}
