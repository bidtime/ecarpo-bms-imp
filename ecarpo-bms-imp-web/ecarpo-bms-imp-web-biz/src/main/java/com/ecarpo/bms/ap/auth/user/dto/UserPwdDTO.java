/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.auth.user.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * @author lhf
 * @since 2019.05.21
 *
 *
 */
@SuppressWarnings("serial")
@Data
public class UserPwdDTO implements Serializable {

  @NotBlank(message = "用户姓名不能为空")
  private String user;

  @NotBlank(message = "用户密码不能为空")
  private String pwd;

//  private void test() {
//    try {
//      DTOAnnoUtils.initialBean(this);
//    } catch (Exception e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    String s = JSON.toJSONString(this);
//
//  }

}
