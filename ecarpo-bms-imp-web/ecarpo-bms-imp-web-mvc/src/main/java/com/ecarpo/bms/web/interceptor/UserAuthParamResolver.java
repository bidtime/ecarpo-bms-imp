package com.ecarpo.bms.web.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.ap.auth.user.UserLoginBO;

import lombok.extern.slf4j.Slf4j;

/**
 * 自动注入controller 方法中的 userID 注解参数
 * <p/>
 * 使用配置： <mvc:annotation-driven> <mvc:argument-resolvers>
 * <bean class= "com.zs.framework.CSessionResolver" /> </mvc:argument-resolvers>
 * </mvc:annotation-driven>
 * <p/>
 * Created by riverbo on 2016/9/6.
 */
@Slf4j
public class UserAuthParamResolver implements WebArgumentResolver {

  @Autowired
  private IUser service;

  private boolean supportsParameter(MethodParameter parameter) {
    return UserLoginBO.class.equals(parameter.getParameterType());
  }
  
  //private static final UserLoginBO userI = UserLoginBO.getUser();

  @Override
  public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest)
      throws Exception {
    if (methodParameter != null && methodParameter.getParameterType() != null) {
      if (supportsParameter(methodParameter)) {
        HttpServletRequest req = webRequest.getNativeRequest(HttpServletRequest.class);
        //UserLoginBO user = service.getUser(req);
        UserLoginBO user = service.getUser(req);
        if (user == null) {
          log.warn("user is null");
          //user = userI;
          throw new RuntimeException("please login");
        }
        return user;
      }
    }
    return UNRESOLVED;
  }

}
