package com.ecarpo.bms.erp.server.toeas.utils.send;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 推送数据参数
 * 
 * @author xinbeibei
 * @since 2019.07.04
 */
@Data
public class SendToEASDTO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 需要推送的数据,格式为JSON
   */
  private String context;

  /**
   * EAS接受此数据的方法名称
   */
  @NotBlank(message = "EAS接受此数据的方法名称")
  private String method;

}
