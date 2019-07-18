package com.ecarpo.bms.bs.server.company.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.bs.server.company.dao.BsCompanyDAO;
import com.ecarpo.bms.bs.server.company.dao.BsCompanyMapper;
import com.ecarpo.bms.bs.server.company.entity.BsCompanyDO;
import com.ecarpo.framework.common.service.BaseDAOManager;

/**
 * @author xinbeibei
 * @since 2019.06.06
 */
@Service
public class BsCompanyManager extends BaseDAOManager<BsCompanyDAO, BsCompanyMapper, BsCompanyDO> {

  /**
   * 供应商编码 获取ERP相关信息
   * 
   * @param supplierNumber
   * @return
   * @throws Exception
   * @author xinbeibei
   * @since 2019.07.12
   */
  public BsCompanyDO selectByEasNumber(String supplierNumber) throws Exception {
    return dao.selectByEasNumber(supplierNumber);
  }
}
