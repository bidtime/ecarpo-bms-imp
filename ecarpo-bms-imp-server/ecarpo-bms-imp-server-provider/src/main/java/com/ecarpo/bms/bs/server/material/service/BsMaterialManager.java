/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.material.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.bs.server.material.dao.BsMaterialDAO;
import com.ecarpo.bms.bs.server.material.dao.BsMaterialMapper;
import com.ecarpo.bms.bs.server.material.entity.BsMaterialDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @param
 * @return
 * @throws Exception
 * @author lhf
 * @since 2019/6/26
 */
@Service
public class BsMaterialManager
    extends BaseDAOManager<BsMaterialDAO, BsMaterialMapper, BsMaterialDO> {

}
