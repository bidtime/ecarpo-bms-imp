/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.web.interceptor;

import java.lang.reflect.Type;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.ap.auth.user.UserLoginBO;
import com.ecarpo.framework.annotation.utils.DTOAnnoUtils;
import com.ecarpo.framework.model.InsertDTO;
import com.ecarpo.framework.model.UpdateDTO;
import com.ecarpo.framework.mvc.method.annotation.AbstractRequestBodyAdvice;

/**
 * Auto inject some user context fields into the InsertDTO or UpdateDTO
 * parameter.
 * 
 * @author riverbo
 * @since 2019.05.29
 */
//@ControllerAdvice
public class QDTORequestBodyAdvice extends AbstractRequestBodyAdvice {

  @Autowired
  private IUser user;

  /*
   * (non-Javadoc)
   */
  @Override
  public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
      Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
    if (body == null) {
      return body;
    }
    UserLoginBO user = getUser(getRequest());
    if (body instanceof InsertDTO) {
      InsertDTO dto = (InsertDTO) body;
      copy(dto, user, true);
    } else if (body instanceof UpdateDTO) {
      UpdateDTO dto = (UpdateDTO) body;
      copy(dto, user, true);
//    } else if (body instanceof BaseQO) {
//      BaseQO qo = (BaseQO) body;
//      UserUtils.copy(qo, user);
    }
    return body;
  }
  
  private UserLoginBO getUser(HttpServletRequest req) throws RuntimeException {
    return (UserLoginBO)user.getUser(req);
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

  /**
   * try to get httpServletRequest from current thread holder
   *
   * @return
   */
  public static HttpServletRequest getRequest() {
    RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
    HttpServletRequest request =
        (HttpServletRequest)
            requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
    return request;
  }

}
