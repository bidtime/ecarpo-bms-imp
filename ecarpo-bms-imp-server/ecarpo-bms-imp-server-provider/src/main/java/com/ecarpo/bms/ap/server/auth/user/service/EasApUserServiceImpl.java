/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.user.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.user.dao.ApUserDAO;
import com.ecarpo.bms.ap.server.auth.user.dao.ApUserMapper;
import com.ecarpo.bms.ap.server.auth.user.entity.ApUserDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class EasApUserServiceImpl extends
    BaseServiceImpl<ApUserManager, ApUserDAO, ApUserMapper, ApUserDO> implements EasApUserService {

}
