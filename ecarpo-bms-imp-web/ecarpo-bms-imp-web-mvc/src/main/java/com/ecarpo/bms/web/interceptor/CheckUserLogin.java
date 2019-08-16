package com.ecarpo.bms.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bidtime.session.state.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.web.utils.ResponseUtils;
import com.ecarpo.framework.model.ResultDTO;

/****
 * 未登录用户拦截器
 *
 * @author libing
 */
public class CheckUserLogin implements HandlerInterceptor {

  @Autowired
  private IUser user;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    // 0:未登陆, 1:正常登陆, 2:被其它用户踢, //3: 没有权限 4: 游客访问商城
    StateEnum e = user.getLoginState(request);
    if (e == null || e == StateEnum.NOT_LOGIN) { // 未登陆,跳登陆页
      //response.setStatus(10000);
      ResultDTO<String> dto = new ResultDTO<>();
      dto.setSuccess(false);
      dto.setCode(1);
      dto.setMsg("不在线，请登陆");
      String json = JSON.toJSONString(dto);
      ResponseUtils.writeString(json, response);
      return false;
    } else if (e == StateEnum.LOGGED_IN) {
      return true;
    } else if (e == StateEnum.ANOTHER_LOGIN) {// 帐户被踢,需要重新登陆
      //response.setStatus(10001);
      //ResponseUtils.writeString("another user login", response);
      return true;
//    } else if (e == StateEnum.NO_PERMISSION) { // 无权限,跳无权限页
//    ResponseUtils.setResponseHeadNoPower(response, "no power");
    } else {
      return false;
    }
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {

  }

}
