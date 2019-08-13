package com.ecarpo.bms.eas.api.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.ap.auth.user.UserLoginBO;
import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.21
 */
@RestController
@RequestMapping("/api/dms/import/user")
public class UserController {

  @SuppressWarnings("unused")
  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private IUser service;

  /**
   *
   *
   * @param lhf
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/22
   * http://172.16.200.233:8082/api/dms/import/user/login?user=eas_sys&pwd=888
   */
  @RequestMapping(value = "login", method = RequestMethod.GET)
  public Object login1(HttpServletRequest req, HttpServletResponse res, UserPwdDTO dto) throws Exception {
    return service.login(req, res, dto);
  }
  
  /**
   * 
   * @param req
   * @return
   * @throws Exception
   * @author root
   * @since 2019.07.01
   */
  @RequestMapping(value = "logout", method = RequestMethod.GET)
  public Object logout(HttpServletRequest req) throws Exception {
    return service.logout(req);
  }
  
  @RequestMapping(value = "getStores", method = RequestMethod.GET)
  public Object getStores(UserLoginBO user) throws Exception {
    return service.getStoresByUserId(user.getUserId());
  }
  
  /**
   * 
   * @param req
   * @return
   * @throws Exception
   * @author root
   * @since 2019.07.01
   * http://localhost:8082/api/eas/user/get
   */
  @RequestMapping(value = "get", method = RequestMethod.GET)
  public Object get(HttpServletRequest req) throws Exception {
    return new ResultDTO<Integer>(1);
  }
  
  /**
   *
   *
   * @param lhf
   * @return
   * @throws Exception
   * @author lhf
   * @since 2019/5/22
   */
  @RequestMapping(value = "login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object login2(HttpServletRequest req, HttpServletResponse res, @Valid @RequestBody UserPwdDTO dto) throws Exception {
    return service.login(req, res, dto);
  }
 
}
