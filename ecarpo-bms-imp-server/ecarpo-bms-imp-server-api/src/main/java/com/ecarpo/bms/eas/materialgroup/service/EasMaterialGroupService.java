/*
 * $Id:$
 * Copyright 2018 eVchpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.materialgroup.service;

import com.ecarpo.bms.eas.materialgroup.dto.EasMaterialGroupSaveDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author xinbeibei
 * @since 2019.06.13
 */
public interface EasMaterialGroupService {

 /**
  * 保存物料分类
  *
  * @param
  * @return
  * @throws Exception
  * @author lhf
  * @since 2019/6/14
  */
  ResultDTO<Integer> save(EasMaterialGroupSaveDTO dto) throws Exception;

}
