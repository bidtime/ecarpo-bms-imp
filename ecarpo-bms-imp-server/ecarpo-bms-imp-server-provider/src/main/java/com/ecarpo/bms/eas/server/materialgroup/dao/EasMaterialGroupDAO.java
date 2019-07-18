/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.materialgroup.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.materialgroup.entity.EasMaterialGroupDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019/6/14
 */
@Repository
public class EasMaterialGroupDAO extends CRUDDAO<EasMaterialGroupMapper, EasMaterialGroupDO> {

/**
 * 主键获取DO
 *
 * @param
 * @return
 * @throws Exception
 * @author lhf
 * @since 2019/6/14
 */
  public EasMaterialGroupDO selectById(String id) throws Exception {
    return mapper.selectById(id);
  }

}
