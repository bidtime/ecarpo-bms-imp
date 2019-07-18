/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.ap.server.auth.userproduct.dao.ApUserProductDAO;
import com.ecarpo.bms.ap.server.auth.userproduct.dao.ApUserProductMapper;
import com.ecarpo.bms.ap.server.auth.userproduct.dto.InsertApUserListProductDTO;
import com.ecarpo.bms.ap.server.auth.userproduct.dto.InsertApUserProduct;
import com.ecarpo.bms.ap.server.auth.userproduct.entity.ApUserProductDO;
import com.ecarpo.framework.common.service.BaseDAOManager;
import com.ecarpo.framework.common.utils.DAOUtils;
import com.ecarpo.framework.model.InsertDTO;

/**
 * @author xinbeibei
 * @since 2019.06.20
 */
@Service
public class ApUserProductManager
    extends BaseDAOManager<ApUserProductDAO, ApUserProductMapper, ApUserProductDO> {

  /**
   * userId 删除记录
   * 
   * @param userId
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.06.20
   */
  public Integer deleteByUserId(Long userId) throws Exception {
    return dao.deleteByUserId(userId);
  }

  /**
   * 用户新增模块
   * 
   * @param setUserProduct
   * @param UserId
   * @param dto
   * @return
   * @throws Exception
   * @author mgz
   * @since 2017年8月2日
   */
  public Integer insert(Collection<Long> setUserProduct, Long userId, InsertDTO dto)
      throws Exception {
    List<InsertApUserProduct> listUserProduct = new ArrayList<>();
    InsertApUserProduct u = new InsertApUserProduct(userId, setUserProduct);
    listUserProduct.add(u);
    InsertApUserListProductDTO dutyProductDTO = DAOUtils.cloneBean(InsertApUserListProductDTO.class,
        dto);
    dutyProductDTO.setList(listUserProduct);
    return this.insert(dutyProductDTO);
  }
  
}
