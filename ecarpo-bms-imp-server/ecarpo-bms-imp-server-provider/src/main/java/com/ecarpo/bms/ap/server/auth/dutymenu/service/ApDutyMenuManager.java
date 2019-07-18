/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.dutymenu.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.dutymenu.dao.ApDutyMenuDAO;
import com.ecarpo.bms.ap.server.auth.dutymenu.dao.ApDutyMenuMapper;
import com.ecarpo.bms.ap.server.auth.dutymenu.entity.ApDutyMenuDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class ApDutyMenuManager
    extends BaseDAOManager<ApDutyMenuDAO, ApDutyMenuMapper, ApDutyMenuDO> {

  /**
   * 
   * @param setDutyIds
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  public Set<Long> listDutyMenu(Collection<Long> setDutyIds) throws Exception {
    Set<Long> setMenuIds = new HashSet<>();
    for (Long dutyId : setDutyIds) {
      List<Long> listMenus = dao.selectListByDutyId(dutyId);
      for (Long l : listMenus) {
        setMenuIds.add(l);
      }
    }
    return setMenuIds;
  }
  
  /**
   * 按岗位id获取模块菜单id
   * 
   * @param setDutyIds
   * @return
   */
  public Map<Long, Set<Long>> listProductMenuIdByDutyId(Collection<Long> setDutyIds)
      throws Exception {
    Map<Long, Set<Long>> mapProductMenus = new HashMap<>();
    for (Long dutyId : setDutyIds) {
      List<ApDutyMenuDO> productMenus = dao.listProductMenuIdByDutyId(dutyId);
      if (CollectionUtils.isEmpty(productMenus)) {
        continue;
      }
      for (ApDutyMenuDO u : productMenus) {
        Set<Long> setMenuIds = mapProductMenus.get(u.getProductId());
        if (setMenuIds == null) {
          setMenuIds = new HashSet<>();
        }
        setMenuIds.add(u.getMenuId());
        mapProductMenus.put(u.getProductId(), setMenuIds);
      }
    }
    return mapProductMenus;
  }
  
}
