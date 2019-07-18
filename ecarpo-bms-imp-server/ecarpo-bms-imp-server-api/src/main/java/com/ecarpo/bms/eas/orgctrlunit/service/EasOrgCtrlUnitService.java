/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.orgctrlunit.service;

import com.ecarpo.bms.eas.orgctrlunit.dto.EasOrgCtrlUnitSaveDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019/6/14
 */
public interface EasOrgCtrlUnitService {

 /**
  * 保存管理单元
  *
  * @param
  * @return
  * @throws Exception
  * @author lhf
  * @since 2019/6/14
  */
  ResultDTO<Integer> save(EasOrgCtrlUnitSaveDTO dto) throws Exception;

}
