package com.ecarpo.bms.eas.server.data;

import java.util.Date;

import com.ecarpo.framework.common.annotation.InitialField;
import com.ecarpo.framework.common.mapper.DataEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
public class MyEntity extends DataEntity {

  @InitialField(value = "0")
  private Long creator;
  
  private Date c_time;

  @InitialField(value = "")
  private String desc;
  
  @Override
  public void setCreatorId(Long creatorId) {
    super.setCreatorId(creatorId);
    this.creator = creatorId;
  }
  
  @Override
  public void setCreateTime(Date createTime) {
    super.setCreateTime(createTime);
    this.c_time = createTime;
  }

//  @InitialField(value = "1")
//  protected Integer status;

}
