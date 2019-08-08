/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecarpo.bms.JUnitTestBase;
import com.ecarpo.bms.eas.server.dmsbuy.dto.DmsBuyInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuy.service.DmsBuyService;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.service.DmsBuyDetailService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class DmsBuyDetailTest extends JUnitTestBase {

  @Autowired
  private DmsBuyDetailService service;
  
  @Autowired
  private DmsBuyService buyService;

  public String getBuyNumber() throws Exception {
    //int nextInt = super.getId(1000);
    DmsBuyInsertDTO dto = new DmsBuyInsertDTO();
    super.initial(dto);
    print(dto);
    ResultDTO<String> rst = buyService.insert(dto);
    print(rst);
    if (rst != null) {
      return rst.getData();
    } else {
      return null;
    }
  }

  @SuppressWarnings("rawtypes")
  @Test
  public void test_insert() throws Exception {
    //int nextInt = super.getId(1000);
    DmsBuyDetailInsertDTO dto = new DmsBuyDetailInsertDTO();
    super.initial(dto);
    dto.setBuy_number(getBuyNumber());
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
