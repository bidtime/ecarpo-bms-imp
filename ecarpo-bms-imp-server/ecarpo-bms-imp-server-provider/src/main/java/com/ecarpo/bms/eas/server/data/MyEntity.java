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
  private Integer creator;
  
  private Date cTime;
  
  public void setCreatorId(Integer creatorId) {
    this.creator = creatorId;
  }
  
  public void setCreateTime(Date createTime) {
    super.setCreateTime(createTime);
    this.cTime = createTime;
  }

//  @InitialField(value = "1")
//  protected Integer status;

}
