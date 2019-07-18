/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.org.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.org.dao.ApOrgDAO;
import com.ecarpo.bms.ap.server.auth.org.dao.ApOrgMapper;
import com.ecarpo.bms.ap.server.auth.org.entity.ApOrgDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * 
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasApOrgServiceImpl extends BaseServiceImpl<ApOrgManager, ApOrgDAO, ApOrgMapper, ApOrgDO>
    implements EasApOrgService {

}
