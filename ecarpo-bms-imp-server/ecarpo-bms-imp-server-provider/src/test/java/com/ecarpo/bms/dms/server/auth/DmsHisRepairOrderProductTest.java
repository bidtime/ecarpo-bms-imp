/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecarpo.bms.JUnitTestBase;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.dto.DmsHisRepairOrderProductInsertDTO;
import com.ecarpo.bms.eas.server.dmshisrepairorderproduct.service.DmsHisRepairOrderProductService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class DmsHisRepairOrderProductTest extends JUnitTestBase {

  @Autowired
  private DmsHisRepairOrderProductService service;

  @SuppressWarnings("rawtypes")
  @Test
  public void test_insert() throws Exception {
    int nextInt = super.getId(1000);
    DmsHisRepairOrderProductInsertDTO dto = new DmsHisRepairOrderProductInsertDTO();
    super.initial(dto);
    dto.setOrder_no(String.valueOf(nextInt));
    //dto.setCode(String.valueOf(nextInt));
    //dto.setRetrievalCode(String.valueOf(nextInt));
    print(dto);
    ResultDTO rst = service.insert(dto);
    print(rst);
  }
  
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
