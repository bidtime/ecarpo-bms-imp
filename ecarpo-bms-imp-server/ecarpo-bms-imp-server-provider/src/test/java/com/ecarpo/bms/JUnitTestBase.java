/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ecarpo.framework.annotation.utils.DTOAnnoUtils;
import com.ecarpo.framework.jdbc.keygen.KeyGenerator;
import com.ecarpo.framework.model.InsertDTO;
import com.ecarpo.framework.model.InsertOrgDTO;
import com.ecarpo.framework.model.UpdateDTO;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/META-INF/spring/spring-*.xml")
public class JUnitTestBase extends AbstractJUnit4SpringContextTests {
  
  @Autowired
  private KeyGenerator keyGenerator;
  
  protected Long getId() {
    return keyGenerator.generateKey().longValue();
  }
  
  protected void initial(InsertDTO dto) throws Exception {
    DTOAnnoUtils.initialBean(dto);
    dto.setCreateTime(new Date());
    dto.setCreatorId(1L);
    dto.setCreatorName("1");
    dto.setModifyTime(new Date());
    dto.setModifierId(1L);
    dto.setModifierName("1");
    dto.setDelFlag(0);
    BeanUtils.copyProperty(dto, "id", null);
  }
  
  protected void initialAp(InsertOrgDTO dto) throws Exception {
    initial((InsertDTO)dto);
    dto.setOrgId(0L);
    dto.setOrgType(0);
  }
  
  protected void initialGroup(InsertOrgDTO dto) throws Exception {
    initial((InsertDTO)dto);
    dto.setOrgId(1L);
    dto.setOrgType(1);
  }
  
  protected void initial(UpdateDTO dto) throws Exception {
    DTOAnnoUtils.initialBean(dto);
    dto.setModifyTime(new Date());
    dto.setModifierId(1L);
    dto.setModifierName("1");
    BeanUtils.copyProperty(dto, "id", null);
  }
  
  public int getId(int nextInt) {
    java.util.Random random=new java.util.Random();// 定义随机类
    int result=random.nextInt(nextInt);// 返回[0,10)集合中的整数，注意不包括10
    return result+1;              // +1后，[0,10)集合变为[1,11)集合，满足要求
  }
  
  public static void print(Object o) throws Exception {
    System.out.println("");
    System.out.println("");
    System.out.println("####################################");
    if (o != null) {
      String json = JSON.toJSONString(o);
      System.out.println("data: ");
      System.out.println("-----------------------");
      System.out.println(json);
    } else {
      System.out.println("data: is null");
    }
    System.out.println("####################################");
    System.out.println("");
    System.out.println("");
  }

//  private static final String STATIC_SALT = "ef71e68c";
//
//  private static final int NUM_OF_ITERATIONS = 5;
//
////  @Resource
////  private ApUserDao apUserDao;
//
//  @Resource
//  private ApUserService apUserService;
//
//  @Test
//  public void testCreateUser() {
//    String pwd = "123";
//
//    SecureRandomNumberGenerator secureRandomNumberGenerator = new SecureRandomNumberGenerator();
//
//    final ConfigurableHashService hashService = new DefaultHashService();
//    hashService.setPrivateSalt(ByteSource.Util.bytes(STATIC_SALT));
//    hashService.setHashAlgorithmName(MessageDigestAlgorithms.SHA_512);
//    hashService.setHashIterations(NUM_OF_ITERATIONS);
//
//    final String dynaSalt = secureRandomNumberGenerator.nextBytes().toHex();
//    System.out.println("dynaSalt: " + dynaSalt);
//
//    final HashRequest request = new HashRequest.Builder().setSalt(dynaSalt).setSource(pwd).build();
//    final String digestedPassword = hashService.computeHash(request).toHex();
//    System.out.println("digestedPassword: " + digestedPassword);
//
//    Date now = new Date();
//    ApUserDO apUser = new ApUserDO();
//    apUser.setUserId(1);
//    apUser.setUserName("jades.he" + now.getTime());
//    //apUser.setRealName("Jades He");
//    apUser.setPwd(digestedPassword);
//    //apUser.setSalt(dynaSalt);
//    apUser.setCreateTime(now);
//    apUser.setModifyTime(now);
//
////    apUserDao.insertSelective(apUser);
//
//    //    List<ApUserDO> list = apUserDao.findList();
//    //    System.out.println(list);
//  }
//
//  @Test
//  public void testGetUser() {
//    ApUserBO user = apUserService.getByUsername("wintop");
//    assertNotNull(user);
//    try {
//      user = apUserService.getByUsername(null);
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    assertNotNull(user);
//  }

}
