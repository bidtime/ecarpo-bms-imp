package com.ecarpo.bms.ap.auth.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bidtime.session.HttpUserRequest;
import org.bidtime.session.except.CookieNullException;
import org.bidtime.session.state.SessionLoginState;
import org.bidtime.session.state.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.user.dto.UserPwdDTO;
import com.ecarpo.bms.eas.server.user.service.EasUserService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author maguangzu
 * @since 2017年7月14日
 */
@Service
public class UserImpl implements IUser {
 
  private static final UserLoginBO user = new UserLoginBO();
  
  @Autowired
  private HttpUserRequest userRequest;
  
  @Autowired
  private EasUserService userService;

  static {
    user.setUserId(2L);
    user.setUserCode("EAS-sys");
    user.setUserName("EAS管理員");
  }

//  @Override
//  public ResultDTO<?> login(HttpServletRequest req, UserPwdDTO dto) throws RuntimeException {
//    if (!dto.getUser().equals("eas_sys")) {
//      return ResultDTO.error("用户名或密码不正确");
//    }
//    userRequest.login(req, user);
//    return new ResultDTO<>();
//  }

  @Override
  public ResultDTO<?> login(HttpServletRequest req, HttpServletResponse res, UserPwdDTO dto) throws RuntimeException {
    if (userService.login(dto).isSuccess()) {
      return ResultDTO.error("用户名或密码不正确");
    }
    userRequest.login(req, res, user);
    return new ResultDTO<>();
  }
  
  @Override
  public ResultDTO<?> logout(HttpServletRequest req) throws RuntimeException {
    userRequest.logout(req);
    return new ResultDTO<>();
  }
  
  @Override
  public UserLoginBO getUser(HttpServletRequest req) throws RuntimeException {
    return (UserLoginBO)userRequest.getUser(req);
  }
  
  @Override
  public String getUserName(HttpServletRequest req) throws RuntimeException {
    try {
      return userRequest.getUserName(req);
    } catch (CookieNullException e) {
      return null;
    }
  }
  
  @Override
  public String getSessionId(HttpServletRequest req) throws RuntimeException {
    try {
      return userRequest.getSessionId(req);
    } catch (CookieNullException e) {
      return null;
    }
  }
  
  @Override
  public SessionLoginState getSessionLoginState(HttpServletRequest req) throws RuntimeException {  
    return userRequest.getSessionLoginState(req);
  }
  
  @Override
  public StateEnum getLoginState(HttpServletRequest req) throws RuntimeException {  
    SessionLoginState sessionLogin = this.getSessionLoginState(req);
    // 0:未登陆, 1:正常登陆, 2:被其它用户踢, //3: 没有权限 4: 游客访问商城
    StateEnum e = null;
    if (sessionLogin != null) {
      e = sessionLogin.getLoginState();
    }
    return e;
  }

}
