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
import com.ecarpo.bms.eas.server.user.qo.IdNameQO;
import com.ecarpo.bms.eas.server.user.service.IEasUserService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author maguangzu
 * @since 2017年7月14日
 */
@Service
public class UserImpl implements IUser {
 
  //private static final UserLoginBO USER_UI = new UserLoginBO();
  
  @Autowired
  private HttpUserRequest userRequest;
  
  @Autowired
  private IEasUserService userService;

//  static {
//    USER_UI.setUserId(2L);
//    USER_UI.setUserCode("EAS-sys");
//    USER_UI.setUserName("EAS管理員");
//    USER_UI.setStoreId(1);
//    USER_UI.setStoreName("1_store");
//  }

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
    ResultDTO<Integer> rstUser = userService.login(dto);
    if (!rstUser.isSuccess()) {
      return ResultDTO.error("用户名或密码不正确");
    }
    ResultDTO<IdNameQO> rstStore = userService.getStoresByUserId(rstUser.getData());
    if (rstStore.getData() == null) {
      return ResultDTO.error(dto.getUser() + ", 无对应的店面，请配置");
    }
    UserLoginBO user = newBO(rstUser.getData(), dto.getUser(), rstStore.getData());
    userRequest.login(req, res, user);
    return new ResultDTO<>();
  }
  
  private static UserLoginBO newBO(Integer userId, String name, IdNameQO store) {
    UserLoginBO user = new UserLoginBO();
    user.setUserId(userId.longValue());
    //user.setUserCode("EAS-sys");
    user.setUserName(name);
    user.setStoreId(store.getId());
    user.setStoreName(store.getName());
    //
    return user;
  }
  
  @Override
  public ResultDTO<?> logout(HttpServletRequest req) throws RuntimeException {
    userRequest.logout(req);
    return new ResultDTO<>();
  }
  
  @Override
  public ResultDTO<IdNameQO> getStoresByUserId(Integer userId) {
    return userService.getStoresByUserId(userId);
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
    SessionLoginState sessionLogin = null;
    try {
      sessionLogin = this.getSessionLoginState(req);
    } catch (Exception e) {
      
    }
    // 0:未登陆, 1:正常登陆, 2:被其它用户踢, //3: 没有权限 4: 游客访问商城
    StateEnum e = null;
    if (sessionLogin != null) {
      e = sessionLogin.getLoginState();
    }
    return e;
  }

}
