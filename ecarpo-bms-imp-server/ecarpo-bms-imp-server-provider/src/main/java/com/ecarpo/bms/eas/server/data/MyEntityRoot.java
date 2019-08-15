package com.ecarpo.bms.eas.server.data;

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
  
  @Override
  public void setCreatorId(Long creatorId) {
    super.setCreatorId(creatorId);
    this.creator = creatorId;
  }

//  @InitialField(value = "1")
//  protected Integer status;

}
