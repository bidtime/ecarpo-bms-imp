/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.personpositon.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.personpositon.dao.EasPersonPositionDAO;
import com.ecarpo.bms.eas.server.personpositon.dao.EasPersonPositonMapper;
import com.ecarpo.bms.eas.server.personpositon.entity.EasPersonPositonDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasPersonPositionManager extends BaseDAOManager<EasPersonPositionDAO, EasPersonPositonMapper, EasPersonPositonDO> {

  public Long deleteByPersonId(String personId){
    return dao.deleteByPersonId(personId);
  };

}
