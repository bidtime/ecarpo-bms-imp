/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.person.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.person.bo.EasPersonInfoBO;
import com.ecarpo.bms.eas.person.dto.EasPersonInfoQO;
import com.ecarpo.bms.eas.person.dto.EasPersonInsertDTO;
import com.ecarpo.bms.eas.person.dto.EasPersonUpdateDTO;
import com.ecarpo.bms.eas.person.service.EasPersonService;
import com.ecarpo.bms.eas.server.person.dao.EasPersonDAO;
import com.ecarpo.bms.eas.server.person.dao.EasPersonMapper;
import com.ecarpo.bms.eas.server.person.entity.EasPersonDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Service
public class EasPersonServiceImpl
    extends BaseServiceImpl<EasPersonManager, EasPersonDAO, EasPersonMapper, EasPersonDO>
    implements EasPersonService {

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Number> insertLong(EasPersonInsertDTO dto) throws Exception {
    return new ResultDTO<>(manager.insertByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<?> update(EasPersonUpdateDTO dto) throws Exception {
    return new ResultDTO<>(manager.updateByBase(dto));
  }

  /*
   * (non-Javadoc)
   */
  @Override
  @Transactional(readOnly = true)
  public ResultDTO<String> selectByUserId(Long userId) throws Exception {
    return new ResultDTO<>(manager.selectByUserId(userId));
  }

  @Override
  @Transactional(readOnly = true)
  public ResultDTO<EasPersonInfoBO> selectByUserInfo(EasPersonInfoQO qo) throws Exception {
    return new ResultDTO<>(manager.selectByUserInfo(qo));
  }

}
