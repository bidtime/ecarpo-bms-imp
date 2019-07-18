/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.ap.server.auth.userproduct.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author mgz
 * @since 2017年8月1日
 */
@Data
public class InsertApUserProduct implements Serializable {

  private static final long serialVersionUID = 1L;

  public InsertApUserProduct() {
  }

  public InsertApUserProduct(Long userId, Collection<Long> productIds) {
    super();
    this.userId = userId;
    this.productIds = productIds;
  }

  /**
   * 用户id
   *
   * @mbg.generated 2017-06-27 11:29:22
   */
  @NotNull(message = "请选择用户")
  private Long userId;

  /**
   * 模块id
   *
   * @mbg.generated 2017-06-27 11:29:22
   */
  @NotNull(message = "请选择模块")
  //@Size(min=1,message="支付完成时间长度不能超过{max}位")
  // @Size(max=14,message="支付完成时间长度不能超过{max}位")
  private Collection<Long> productIds;

}
