/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.auth.user;

import java.io.Serializable;

import org.bidtime.session.bean.ISessionUser;

import com.ecarpo.framework.annotation.utils.DTOAnnoUtils;
import com.ecarpo.framework.common.utils.SpringUtils;

import lombok.Data;

/**
 * @author libing
 * @since 2018年10月18日
 */
@Data
public class UserLoginBO implements ISessionUser, Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 用户id
   *
   * @mbg.generated 2017-07-04 21:49:41
   */
  private Long userId;

  /**
   * 用户编号
   *
   * @mbg.generated 2017-07-04 21:49:41
   */
  private String userCode;

  /**
   * 用户姓名
   *
   * @mbg.generated 2017-07-04 21:49:41
   */
  private String userName;
  
  public void cloneBean(Object o) {
    try {
      DTOAnnoUtils.process(o);
      SpringUtils.cloneBean(o, this);
    } catch (Exception e) {
    }
  }

  @Override
  public String getId() {
    return String.valueOf(userId);
  }

  @Override
  public String getName() {
    return userName;
  }
  
  public static UserLoginBO getUser() {
    UserLoginBO bo = new UserLoginBO();
    bo.setUserId(2L);
    bo.setUserCode("002");
    bo.setUserName("eas sys");
    return bo;
  }

}
