/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.crmbaseproduct.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.crmbaseproduct.dao.CrmBaseProductMapper;
import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductInsertDTO;
import com.ecarpo.bms.eas.server.crmbaseproduct.entity.CrmBaseProductDO;
import com.ecarpo.framework.common.service.BaseManager;
import com.ecarpo.framework.common.utils.DAOUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Slf4j
@Service
public class CrmBaseProductManager extends BaseManager<CrmBaseProductMapper, CrmBaseProductDO> {

  public Integer selectIdByCode(String code, Integer store_id) {
    return mapper.selectIdByCode(code, store_id);
  }

  public Integer selectProductIdByProductName(String type_name, Integer store_id) {
    return mapper.selectProductIdByProductName(type_name, store_id);
  }
  
  public int insert_type(CrmBaseProductInsertDTO dto) throws Exception {
    CrmBaseProductDO u = DAOUtils.cloneBean(CrmBaseProductDO.class, dto);
    Integer product_type_id = selectProductIdByProductName(dto.getProduct_type_name(), dto.getStore_id());
    log.debug(": type_name-{}, store_id-{}, type_id-{}", dto.getProduct_type_name(),
        dto.getStore_id(), product_type_id);
    u.setProduct_type_id(product_type_id);
    return super.insertSelective(u);
  }

}
