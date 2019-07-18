/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.ap.server.auth.userproduct.dao.ApUserProductDAO;
import com.ecarpo.bms.ap.server.auth.userproduct.dao.ApUserProductMapper;
import com.ecarpo.bms.ap.server.auth.userproduct.entity.ApUserProductDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
@Transactional(readOnly = true)
public class EasApUserProductServiceImpl extends
    BaseServiceImpl<ApUserProductManager, ApUserProductDAO, ApUserProductMapper, ApUserProductDO>
    implements EasApUserProductService {

}
