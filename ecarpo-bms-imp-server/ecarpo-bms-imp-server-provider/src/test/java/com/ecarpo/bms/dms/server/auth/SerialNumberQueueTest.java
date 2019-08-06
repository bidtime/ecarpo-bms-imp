/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecarpo.bms.JUnitTestBase;
import com.ecarpo.bms.eas.server.serialnumber.service.SerialNumberQueueService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class SerialNumberQueueTest extends JUnitTestBase {

  @Autowired
  private SerialNumberQueueService service;

  @SuppressWarnings("rawtypes")
  @Test
  public void test_selectNumberByParams() throws Exception {
    Date date = new Date();
    Integer storeId=1; 
    String flag = "rk";
    ResultDTO rst = service.selectNumberByParams(date, storeId, flag);
    print(rst);
  }
  
  @SuppressWarnings("rawtypes")
  @Test
  public void test_getNumberByParams() throws Exception {
    Date date = new Date();
    Integer storeId=1; 
    String flag = "rk";
    ResultDTO rst = service.getNumberByParams(date, storeId, flag);
    print(rst);
  }
  
  @SuppressWarnings("rawtypes")
  @Test
  public void test_getStrByParams() throws Exception {
    Date date = new Date();
    Integer storeId=1; 
    String flag = "rk";
    ResultDTO rst = service.getNumberByParams(date, storeId, flag);
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
