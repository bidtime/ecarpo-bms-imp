/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.erp.server.toeas.dto;

import java.util.List;

import com.ecarpo.framework.data.domain.PageQO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table erp_to_eas
 *
 * @mbg.generated 2019-05-28 09:20:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ErpToEasQO extends PageQO {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 传输标记(0:暂存,1:传输中,2:传输完成, 3:传输失败,4:新增成功,保存失败)
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private List<Integer> states;
  
  /**
   * oper类型: 1:insert 0: update
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private Integer operType;
  
  /**
   * 模块名称
   *
   * @mbg.generated 2019-05-28 09:20:29
   */
  private String tableName;
  

}
