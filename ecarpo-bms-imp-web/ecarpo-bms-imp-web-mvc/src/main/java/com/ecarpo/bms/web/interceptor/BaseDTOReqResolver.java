package com.ecarpo.bms.web.interceptor;

import java.lang.reflect.Type;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.alibaba.fastjson.JSON;
import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.ap.auth.user.UserLoginBO;
import com.ecarpo.framework.annotation.utils.DTOAnnoUtils;
import com.ecarpo.framework.model.BaseDTO;
import com.ecarpo.framework.model.InsertDTO;
import com.ecarpo.framework.model.UpdateDTO;

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
public class BaseDTOReqResolver implements WebArgumentResolver {

  @Autowired
  private IUser user;

  //private static final UserLoginBO userI = UserLoginBO.getUser();

  private boolean supportsParameter(MethodParameter parameter) {
    // return UserLoginBO.class.equals(parameter.getParameterType());
    if (BaseDTO.class.isAssignableFrom(parameter.getParameterType())) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object resolveArgument(MethodParameter methodParam, NativeWebRequest webReq)
      throws Exception {
    if (methodParam != null && methodParam.getParameterType() != null &&
        supportsParameter(methodParam)) {
      final String jsonStr = webReq.getParameter(methodParam.getParameterName());
      log.debug("json: {}", jsonStr);
        //parameter.getGenericParameterType() 返回参数的完整类型（带泛型） 
      final Type type = methodParam.getGenericParameterType();
      log.debug("type: {}", type);
      final Object o = JSON.parseObject(jsonStr, type);
      copy((BaseDTO)o, getUser((HttpServletRequest)webReq));
      log.debug("obj: {}", o);
      return o;
    } else {
      return UNRESOLVED;
    }
  }
  
  private UserLoginBO getUser(HttpServletRequest req) throws RuntimeException {
    return user.getUser(req);
  }
  
  public static void copy(BaseDTO dto, UserLoginBO user) {
    if (user == null) {
      return;
    } else if (dto instanceof InsertDTO) {
      copy((InsertDTO)dto, user, true);
    } else if (dto instanceof UpdateDTO) {
      copy((UpdateDTO)dto, user, true);
    }
  }
  
  public static void copy(InsertDTO dto, UserLoginBO user, boolean copyOrg) {
    // 初始化DTO类的默认值
    try {
      DTOAnnoUtils.process(dto);
    } catch (Exception e) {
    }
    Date dtNow = new Date();
    dto.setCreateTime(dtNow);
    dto.setModifyTime(dtNow);
    if (user == null) {
      return;
    } else {
      //dto.setUserContext(user);
      dto.setCreatorId(user.getUserId());
      dto.setModifierId(user.getUserId());
      dto.setCreatorName(user.getUserName());
      dto.setModifierName(user.getUserName());
//      if (copyOrg) {
//        if (dto instanceof InsertOrgDTO) {
//          InsertOrgDTO org = (InsertOrgDTO) dto;
//          org.setOrgId(user.getOrgId());
//          org.setOrgType(user.getOrgType());
//          org.setOrgCode(user.getOrgCode());
//          org.setOrgName(user.getOrgName());
//          if (dto instanceof InsertDealerDTO) {
//            InsertDealerDTO dealer = (InsertDealerDTO) dto;
//            dealer.setGroupId(user.getGroupId());
//            dealer.setGroupCode(user.getGroupCode());
//            dealer.setGroupName(user.getGroupName());
//          }
//        }
//      }
    }
  }
  
  public static void copy(UpdateDTO dto, UserLoginBO user, boolean copyOrg) {
    // 初始化DTO类的默认值
    try {
      DTOAnnoUtils.process(dto);
    } catch (Exception e) {
    }
    dto.setModifyTime(new Date());
    if (user == null) {
      return;
    } else {
      //dto.setUserContext(user);
      dto.setModifierId(user.getUserId());
      dto.setModifierName(user.getUserName());
//      if (copyOrg) {
//        if (dto instanceof UpdateOrgDTO) {
//          UpdateOrgDTO org = (UpdateOrgDTO) dto;
//          org.setOrgId(user.getOrgId());
//          org.setOrgType(user.getOrgType());
//          org.setOrgCode(user.getOrgCode());
//          org.setOrgName(user.getOrgName());
//          if (dto instanceof UpdateDealerDTO) {
//            UpdateDealerDTO dealer = (UpdateDealerDTO) dto;
//            dealer.setGroupId(user.getGroupId());
//            dealer.setGroupCode(user.getGroupCode());
//            dealer.setGroupName(user.getGroupName());
//          }
//        }
//      }
    }
  }

}
