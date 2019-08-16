/*
 * :$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.data;

import com.ecarpo.framework.common.annotation.InitialValue;
import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.29
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EASInsertDTO extends InsertDTO {

 /**
  * 经销商ID
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 private Integer store_id;

 /**
  * 状态（1正常2停用）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 //@InitialValue(value= "1")
 //private Integer status;

 /**
  * 产品描述
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 //@InitialValue(value= "")
 //private String desc;

 /**
  * 产品备注
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 //@InitialValue(value= "")
 //private String remark;

 /**
  * 建档人
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
// private Integer creator;

 /**
  * 建档时间
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
// private Integer c_time;

 /**
  * 是否删除（1已删0未删）
  *
  * @mbg.generated 2019-08-05 15:18:43
  */
 @InitialValue(value= "0")
 private Integer is_del;

}
