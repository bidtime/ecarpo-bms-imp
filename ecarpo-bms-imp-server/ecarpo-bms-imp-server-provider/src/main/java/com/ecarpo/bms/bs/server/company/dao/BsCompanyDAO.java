package com.ecarpo.bms.bs.server.company.dao;

import org.springframework.stereotype.Repository;

import com.ecarpo.bms.bs.server.company.entity.BsCompanyDO;
import com.ecarpo.framework.common.dao.CRUDDAO;

@Repository
public class BsCompanyDAO extends CRUDDAO<BsCompanyMapper, BsCompanyDO> {

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
    return mapper.selectByEasNumber(supplierNumber);
  }
}
