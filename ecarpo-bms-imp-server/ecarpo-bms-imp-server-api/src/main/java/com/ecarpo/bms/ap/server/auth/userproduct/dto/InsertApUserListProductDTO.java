/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.dto;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mgz
 * @since 2017年8月1日
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
public class InsertApUserListProductDTO extends InsertDTO {

  @NotEmpty(message = "模块不能为空")
  @Size(min = 1, message = "模块最少为{min}条")
  private List<InsertApUserProduct> list;

}
