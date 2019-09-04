/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import org.apache.commons.lang3.StringUtils;
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
    int nextInt = super.getId(1000);
    CrmBaseProductInsertDTO dto = new CrmBaseProductInsertDTO();
    super.initial(dto);
    dto.setPtype("deposit");
    dto.setCost_type("other");
    dto.setIs_member_discount("1");
    dto.setProduct_type_name("轮胎");
    dto.setCode(String.valueOf(nextInt));
    print(dto);
    ResultDTO rst = service.insert(dto);
    print(rst);
  }
  
  @BeforeClass
  public static void beforeClass() {
    
  }
  
  @Test
  public void test_isEmpty() throws Exception {
    String cs = " ";
    print("isEmpty: " + StringUtils.isEmpty(cs));
    print("isNotEmpty: " + StringUtils.isNotEmpty(cs));
    print("isBlank: " + StringUtils.isBlank(cs));
    print("isNotBlank: " + StringUtils.isNotBlank(cs));
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
