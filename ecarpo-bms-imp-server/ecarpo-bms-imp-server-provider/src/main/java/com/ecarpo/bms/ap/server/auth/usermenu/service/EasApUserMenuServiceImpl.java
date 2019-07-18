/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.usermenu.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.usermenu.dao.ApUserMenuDAO;
import com.ecarpo.bms.ap.server.auth.usermenu.dao.ApUserMenuMapper;
import com.ecarpo.bms.ap.server.auth.usermenu.entity.ApUserMenuDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class EasApUserMenuServiceImpl
    extends BaseServiceImpl<ApUserMenuManager, ApUserMenuDAO, ApUserMenuMapper, ApUserMenuDO>
    implements EasApUserMenuService {

}
