package com.ecarpo.bms.eas.server.data;

import java.util.Date;

import com.ecarpo.framework.common.annotation.InitialField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
public class MyEntityRoot extends DataEntity {

  @InitialField(value = "0")
  private Long creator;

  @InitialField(value = "")
  private String desc;
  
  @InitialField(value = "0")
  private Integer c_time;
  
  @Override
  public void setCreatorId(Long creatorId) {
    super.setCreatorId(creatorId);
    this.creator = creatorId;
  }
  
  @Override
  public void setCreateTime(Date createTime) {
    super.setCreateTime(createTime);
    this.c_time = SecondsUtils.getSeconds(createTime);
  }

//  @InitialField(value = "1")
//  protected Integer status;
  
  /**
   * 是否删除（1已删0未删）
   *
   * @mbg.generated 2019-08-05 15:18:43
   */
  @InitialField(value = "0")
  private Integer is_del;

}
