/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.group.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.group.service.EasGroupService;
import com.ecarpo.bms.eas.server.group.dao.EasGroupDAO;
import com.ecarpo.bms.eas.server.group.dao.EasGroupMapper;
import com.ecarpo.bms.eas.server.group.entity.EasGroupDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasGroupServiceImpl
    extends BaseServiceImpl<EasGroupManager, EasGroupDAO, EasGroupMapper, EasGroupDO>
    implements EasGroupService {

}
