/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.materialgroup.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecarpo.bms.eas.materialgroup.dto.EasMaterialGroupSaveDTO;
import com.ecarpo.bms.eas.materialgroup.service.EasMaterialGroupService;
import com.ecarpo.bms.eas.server.materialgroup.dao.EasMaterialGroupDAO;
import com.ecarpo.bms.eas.server.materialgroup.dao.EasMaterialGroupMapper;
import com.ecarpo.bms.eas.server.materialgroup.entity.EasMaterialGroupDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;
import com.ecarpo.framework.model.ResultDTO;


/**
 * @author lhf
 * @since 2019/6/14
 */
@Service
public class EasMaterialGroupServiceImpl extends
    BaseServiceImpl<EasMaterialGroupManager, EasMaterialGroupDAO, EasMaterialGroupMapper, EasMaterialGroupDO>
    implements EasMaterialGroupService {

  /* (non-Javadoc)
   *
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public ResultDTO<Integer> save(EasMaterialGroupSaveDTO dto) throws Exception {
    return new ResultDTO<Integer>(manager.save(dto));
  }

}
