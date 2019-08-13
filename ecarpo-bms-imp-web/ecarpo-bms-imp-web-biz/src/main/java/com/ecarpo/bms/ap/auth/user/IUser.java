/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.auth.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bidtime.session.state.SessionLoginState;
import org.bidtime.session.state.StateEnum;

import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author maguangzu
 * @since 2017.07.14
 */
public interface IUser {
  
  // ResultDTO<?> login(HttpServletRequest req, UserPwdDTO dto) throws RuntimeException;
  
  ResultDTO<?> login(HttpServletRequest req, HttpServletResponse res, UserPwdDTO dto) throws RuntimeException;
  
  ResultDTO<?> logout(HttpServletRequest req) throws RuntimeException;
  
  UserLoginBO getUser(HttpServletRequest req) throws RuntimeException;
  
  String getUserName(HttpServletRequest req) throws RuntimeException;
  
  String getSessionId(HttpServletRequest req) throws RuntimeException;
  
  SessionLoginState getSessionLoginState(HttpServletRequest req) throws RuntimeException;
  
  StateEnum getLoginState(HttpServletRequest req) throws RuntimeException;
  
  ResultDTO<IdNameQO> getStoresByUserId(Integer userId);
  
}
