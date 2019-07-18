/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.material.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.eas.server.material.entity.EasMaterialDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

/**
 * @author lhf
 * @since 2019.05.28
 */
@Repository
public class EasMaterialDAO extends CRUDDAO<EasMaterialMapper, EasMaterialDO> {
 /**
  * 主键获取id
  *
  * @param
  * @return
  * @throws Exception
  * @author lhf
  * @since 2019/6/18
  */
  public EasMaterialDO selectByPK(String id) throws Exception {
    return mapper.selectByPK(id);
  }
}
