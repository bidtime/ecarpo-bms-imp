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

/**
 * @author xinbeibei
 * @since 2019.06.04
 */
@Service
public class CrmBaseProductManager extends BaseManager<CrmBaseProductMapper, CrmBaseProductDO> {

  public Integer selectIdByCode(String code) {
    return mapper.selectIdByCode(code);
  }

  public Integer selectProductIdByProductName(String productName) {
    return mapper.selectProductIdByProductName(productName);
  }
  
  public int insert_type(CrmBaseProductInsertDTO dto) throws Exception {
    CrmBaseProductDO u = DAOUtils.cloneBean(CrmBaseProductDO.class, dto);
    Integer product_type_id = selectProductIdByProductName(dto.getProduct_type_name());
    u.setProduct_type_id(product_type_id);
    return super.insertSelective(dto);
  }

}
