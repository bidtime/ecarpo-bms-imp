package com.ecarpo.bms.ap.server.auth.userduty.bo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author mgz
 * @since 2017年7月10日
 */
@Data
public class ApUserDutyListBO implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 用户岗位id
   *
   * @mbg.generated 2017-07-07 14:44:13
   */
  private Long userDutyId;

  /**
   * 用户id
   *
   * @mbg.generated 2017-07-07 14:44:13
   */
  private Long userId;

  /**
   * 部门id
   *
   * @mbg.generated 2017-07-07 14:44:13
   */
  private Long dutyId;

  /**
   * 创建时间
   *
   * @mbg.generated 2017-07-07 14:44:13
   */
  private Date createTime;

  /**
   * 修改时间
   *
   * @mbg.generated 2017-07-07 14:44:13
   */
  private Date modifyTime;

}
