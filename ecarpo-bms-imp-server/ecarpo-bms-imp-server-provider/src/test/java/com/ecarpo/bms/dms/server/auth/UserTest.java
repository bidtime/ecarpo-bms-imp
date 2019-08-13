/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.dms.server.auth;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

import com.ecarpo.bms.JUnitTestBase;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.service.EasUserService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class UserTest extends JUnitTestBase {

  @Autowired
  private EasUserService service;

  @SuppressWarnings("rawtypes")
  @Test
  public void test_login() throws Exception {
    UserPwdDTO dto = new UserPwdDTO();
    //super.initial(dto);
    dto.setUser("jss");
    dto.setPwd("123456");
    //dto.setRetrievalCode(String.valueOf(nextInt));
    print(dto);
    ResultDTO rst = service.login(dto);
    print(rst);
  }
  
  @SuppressWarnings("rawtypes")
  @Test
  public void test_getStoresByUserId() throws Exception {
    Integer userId = 1;
    ResultDTO rst = service.getStoresByUserId(userId);
    print(rst);
  }
  
  @Test
  public void test_md5() throws Exception {
    String raw = "123456";
    String rst = DigestUtils.md5DigestAsHex(raw.getBytes());
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
