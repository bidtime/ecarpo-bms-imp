/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth;

import com.ecarpo.bms.JUnitTestBase;

/**
 * @author Jades.He
 * @since 2017.05.26
 */
public class ApUserServiceTest extends JUnitTestBase {

//  @Autowired
//  private ApUserService service;
//
//  @Autowired
//  private ApUserBizAuthService userAuthService;
//
//  private static final String PRIVATE_SALT = "ef71e68c";
//
//  @Test
//  public void test_insert() throws Exception {
//    int nextInt = super.getId(100);
//    InsertApUserDTO dto = new InsertApUserDTO();
//    dto.setOrgId(Long.valueOf(ApOrgEnum.AP.getState()));
//    dto.setOrgType(OrgTypeEnum.GROUP.getState());
//    dto.setUserName(nextInt + "_name");
//    dto.setState(StateEnum.ENABLED.getState());
//    dto.setAccount(nextInt + "_remark");
//    dto.setSex(1L);
//    dto.setContactPhone("13121358744");
//    dto.setDepartId(1L);
//    //
//    List<Long> listDutyIds = new ArrayList<>();
//    listDutyIds.add(1L);
//    listDutyIds.add(2L);
//    listDutyIds.add(3L);
//    dto.setDutyIds(listDutyIds);
//    //
//    dto.setCertDicId(1L);
//    dto.setCertNo("123");
//    dto.setJobName("123");
//    dto.setJobCode("123");
//    dto.setFormal(1);
//    dto.setEvaluate(1);
//    dto.setPwd("123");
//    dto.setUserCode("123");
//    print(dto);
//    ResultDTO<?> rst = service.insert(dto);
//    print(rst);
//  }
//
//  @Test
//  public void test_update() throws Exception {
//    UpdateApUserDTO dto = new UpdateApUserDTO();
//    dto.setUserId(69092429495574528L);
//    dto.setSex(1L);
//    dto.setCertDicId(1L);
//    dto.setCertNo("123456");
//    dto.setContactPhone("123456");
//    dto.setFormal(1);
//    dto.setEvaluate(1);
//    dto.setJobName("java");
//    dto.setJobCode("123");
//    dto.setState(StateEnum.ENABLED.getState());
//    dto.setDepartId(1L);
//    //
//    List<Long> list = new ArrayList<>();
//    list.add(24981L);
//    list.add(69988475717328896L);
//    list.add(59495L);
//    dto.setDutyIds(list);
//    //
//    dto.setModifyTime(new Date());
//    dto.setEntryDate(new Date());
//    print(dto);
//    ResultDTO<?> rst = service.update(dto);
//    print(rst);
//  }
//
//  @Test
//  public void test_updatePwd() throws Exception {
//    UpdateApUserPwdDTO dto = new UpdateApUserPwdDTO();
//    dto.setUserId(67635601800732672L);
//    dto.setPwd("");// MD5加密后的
//    ResultDTO<?> rst = service.updatePwd(dto);
//    print(rst);
//  }
//
//  @Test
//  public void test_page() throws Exception {
//    ApUserPageQO qo = new ApUserPageQO();
//    ResultDTO<PageBO<ApUserListBO>> rst = service.pageByQuery(qo);
//    print(rst);
//  }
//
//  @Test
//  public void test_list() throws Exception {
//    ApUserListQO qo = new ApUserListQO();
//    ResultDTO<List<ApUserListBO>> rst = service.listByQuery(qo);
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_selectOneByAccount() throws Exception {
//    ResultDTO rst = service.existsByAccount("用户账号");
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_getDataAuthority() throws Exception {
//    ResultDTO rst = service.getDataAuthority(69992169980600320L);
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_getByModelId() throws Exception {
//    ApUserKeyColumnQO qo = new ApUserKeyColumnQO(69965949746323456L, 130005L);
//    ResultDTO rst = service.getByUserModelId(qo);
//    print(rst);
//  }

//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_getColumnUser() throws Exception {
//    ApUserKeyColumnQO qo = new ApUserKeyColumnQO(70005536749297664L, 70005536749297664L);
//    ResultDTO rst = service.getColumnUserByModelId(qo);
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_insertColumn() throws Exception {
//    InsertApUserBizModelDTO dto = new InsertApUserBizModelDTO();
//    super.initial(dto);
//    dto.setUserId(69992169980600320L);
//    dto.setBizModelId(69968483735085056L);
//    //
//    Collection<Long> bizModelColumnIds = new ArrayList<>();
//    //    bizModelColumnIds.add(79631376361496576L);
//    //    bizModelColumnIds.add(79645967464308736L);
//    dto.setBizModelColumnIds(bizModelColumnIds);
//    print(dto);
//    ResultDTO rst = service.insert(dto);
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_insertAuth() throws Exception {
//    InsertApUserBizAuthListDTO dto = new InsertApUserBizAuthListDTO();
//    super.initial(dto);
//    dto.setUserId(69992169980600320L);
//    //
//    Collection<InsertApUserBizAuthDTO> modelList = new ArrayList<>();
//    InsertApUserBizAuthDTO insertDTO = new InsertApUserBizAuthDTO();
//
//    Collection<Long> subUserId = new ArrayList<>();
//    subUserId.add(78206367432744960L);
//
//    insertDTO.setAuthState(BooleanEnum.FALSE.getValue());
//    insertDTO.setSubUserId(subUserId);
//    insertDTO.setBizModelId(20170810001L);
//    modelList.add(insertDTO);
//    dto.setModelList(modelList);
//    print(dto);
//    ResultDTO rst = service.insert(dto);
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_getAlias() throws Exception {
//    ResultDTO rst = service.getAliasByUserMenuUrl(69992169980600320L, "api/ap/user/test");
//    print(rst);
//  }
//
//  @SuppressWarnings("rawtypes")
//  @Test
//  public void test_getSubUserIds() throws Exception {
//    // ResultDTO rst = userAuthService.listByUserId(78077984648503296L, "/api/ap/depart/page");
//    // ResultDTO rst = userAuthService.listByUserId(6L, "/api/ap/depart/page");
//    ResultDTO rst = userAuthService.listByUserId(78077984648503297L, "/api/ap/depart/page");
//    print(rst);
//  }
//
//  @Test
//  public void test_getPwd() throws Exception {
//    // sa/123
//    String salt = DigestUtils.md5Hex("sa");
//    String saltedPwd = HashUtils.computeSaltedHash(DigestUtils.md5Hex("123"), salt, PRIVATE_SALT);
//    System.out.println(saltedPwd);
//    print(saltedPwd);
//
//    // ga_yuntong/123456
//    print(DigestUtils.md5Hex("123456"));
//    salt = DigestUtils.md5Hex("ga_yuntong");
//    saltedPwd = HashUtils.computeSaltedHash(DigestUtils.md5Hex("123456"), salt, PRIVATE_SALT);
//    System.out.println(saltedPwd);
//    print(saltedPwd);
//  }

}
