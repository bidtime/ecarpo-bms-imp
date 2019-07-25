/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecarpo.bms.JUnitTestBase;
import com.ecarpo.bms.eas.server.crmbaseproduct.dto.CrmBaseProductInsertDTO;
import com.ecarpo.bms.eas.server.crmbaseproduct.service.CrmBaseProductService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class CrmBaseProductServiceTest extends JUnitTestBase {

  @Autowired
  private CrmBaseProductService service;

  @SuppressWarnings("rawtypes")
  @Test
  public void test_insert() throws Exception {
    //int nextInt = super.getId(100);
    CrmBaseProductInsertDTO dto = new CrmBaseProductInsertDTO();
    super.initial(dto);
    dto.setPtype("deposit");
    dto.setCostType("other");
    dto.setIsMemberDiscount("1");
//    dto.setOrgId(Long.valueOf(1));
//    dto.setOrgType(OrgTypeEnum.GROUP.getState());
//    dto.setParentId(0L);
//    dto.setProductName(nextInt + "_name");
//    dto.setState(1);
//    dto.setRemark(nextInt + "_remark");
    print(dto);
    ResultDTO rst = service.insert(dto);
    print(rst);
  }

  //  @SuppressWarnings("rawtypes")
  //  @Test
  //  public void test_update() throws Exception {
  //    int nextInt = super.getId(100);
  //    UpdateApProductDTO dto = new UpdateApProductDTO();
  //    dto.setProductId(8886L);
  ////    dto.setOrgId(ApOrgEnum.AP.getState());
  ////    dto.setOrgType(OrgTypeEnum.GROUP.getState());
  //    dto.setParentId(0L);
  //    dto.setProductName(nextInt + "_name");
  //    dto.setState(StateEnum.ENABLED.getState());
  //    dto.setRemark(nextInt + "_remark");
  //    print(dto);
  //    ResultDTO rst = service.update(dto);
  //    print(rst);
  //  }
  
  @BeforeClass
  public static void beforeClass() {
    
  }
  
//  @EndClass
//  public static void endClass() {
//    
//  }
  
//  @Test
//  public void test_selectFullNameByPrimaryKey() throws Exception {
//    ResultDTO<String> rst = service.selectFullNameByPrimaryKey(1L);
//    print(rst);
//  }
//
//  @Test
//  public void test_list() throws Exception {
//    ApProductComboxQO qo = new ApProductComboxQO();
//    ResultDTO<List<ApProductListBO>> rst = service.listByQuery(qo);
//    print(rst);
//  }
//
//  @Test
//  public void test_listName() throws Exception {
//    ApProductComboxQO qo = new ApProductComboxQO();
//    ResultDTO<List<ApProductNameListBO>> rst = service.listNameByQuery(qo);
//    print(rst);
//  }

}
