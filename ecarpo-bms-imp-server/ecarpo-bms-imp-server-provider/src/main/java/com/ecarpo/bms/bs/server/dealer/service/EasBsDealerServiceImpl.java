/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.bs.server.dealer.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.bs.server.dealer.dao.BsDealerDAO;
import com.ecarpo.bms.bs.server.dealer.dao.BsDealerMapper;
import com.ecarpo.bms.bs.server.dealer.entity.BsDealerDO;
import com.ecarpo.bms.bs.server.delaer.service.EasBsDealerService;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.14
 */
@Service
public class EasBsDealerServiceImpl
    extends BaseServiceImpl<BsDealerManager, BsDealerDAO, BsDealerMapper, BsDealerDO>
    implements EasBsDealerService {

}
