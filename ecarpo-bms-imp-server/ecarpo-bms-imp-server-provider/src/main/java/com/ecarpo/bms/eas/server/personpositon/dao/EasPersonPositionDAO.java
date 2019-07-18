/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.personpositon.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.personpositon.entity.EasPersonPositonDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasPersonPositionDAO extends CRUDDAO<EasPersonPositonMapper, EasPersonPositonDO> {

  public Long deleteByPersonId(String personId){
    return mapper.deleteByPersonId(personId);
  };
}
