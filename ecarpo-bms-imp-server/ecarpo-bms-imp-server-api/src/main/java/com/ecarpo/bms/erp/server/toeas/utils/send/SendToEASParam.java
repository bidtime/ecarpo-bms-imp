package com.ecarpo.bms.erp.server.toeas.utils.send;

import java.io.Serializable;

import lombok.Data;

/**
 * 发送工具参数
 * 
 * @author xinbeibei
 * @since 2019.07.04
 */
@Data
//@Slf4j
public class SendToEASParam implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 推送数据路径
   */
  private String sendUrl;

  /**
   * 登陆路径
   */
  private String loginUrl;

  /**
   * 请求头验证路径
   */
  private String soapHeader;

  //登陆信息
  private String userName;

  private String password;

  private String slnName;

  private String dcName;

  private String language;

  private String dbType;

  //  public void setDbType(String dbType) {
  //    this.dbType = dbType;
  //  }
}
