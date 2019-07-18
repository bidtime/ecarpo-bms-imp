package com.ecarpo.bms.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ecarpo.bms.ap.auth.user.IUser;

import lombok.extern.slf4j.Slf4j;

/**
 * 打印 程序执行时间
 *
 * @author riverbo
 * @since 16/7/4 上午10:35.
 */
@Slf4j
public class HandleTimeInterceptor implements HandlerInterceptor {
  
  @Autowired
  private IUser service;

  private static final String START_TIME = "start_time";

  private static final String USER_TOKEN = "user_token";

  private static final String USER_ACCOUNT = "user_account";

  private static final String HANDLE_TIME = "handle_time";
  
  public HandleTimeInterceptor() {
  }

  //private static final String ACCESS_COOKIE = "ACCESS_TICKET";

  @Override
  public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
      throws Exception {
    if (log.isInfoEnabled()) {
      String token = getCookie(req);
      String account = getUserName(req);
      //
      long start = System.currentTimeMillis();
      req.setAttribute(START_TIME, start);
      req.setAttribute(USER_TOKEN, token);
      req.setAttribute(USER_ACCOUNT, account);
      log.info("{}, {}, {}:{}", token, account, req.getMethod(), req.getRequestURI());
    }
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler,
      ModelAndView modelAndView) throws Exception {
    if (log.isInfoEnabled()) {
      long start = (long) req.getAttribute(START_TIME);
      req.setAttribute(HANDLE_TIME, System.currentTimeMillis() - start);
    }
  }

  @Override
  public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler,
      Exception ex) throws Exception {
    if (log.isInfoEnabled()) {
      String token = (String) req.getAttribute(USER_TOKEN);
      String account = (String) req.getAttribute(USER_ACCOUNT);
      //
      long start = (long) req.getAttribute(START_TIME);
      long end = System.currentTimeMillis();
      long span = end - start;
      //
      log.info("{}, {}, {}:{}, {}ms.", token, account, req.getMethod(), req.getRequestURI(), span);
    }
  }

  protected static String getPrefix(String val) throws Exception {
    int n = val.indexOf('-');
    int n2 = val.indexOf('-', n + 1);
    return val.substring(0, n2);
  }

  private String getUserName(HttpServletRequest req) throws Exception {
    return service.getUserName(req);
  }

  protected String getCookie(HttpServletRequest req) throws Exception {
    return service.getSessionId(req);
  }
  
//  protected String getCookie(HttpServletRequest req) throws Exception {
//    Cookie[] cs = req.getCookies();
//    if (cs == null) {
//      return null;
//    }
//    for (Cookie c : cs) {
//      if (ACCESS_COOKIE.equals(c.getName())) {
//        return getPrefix(c.getValue());
//      }
//    }
//    return null;
//  }

}
