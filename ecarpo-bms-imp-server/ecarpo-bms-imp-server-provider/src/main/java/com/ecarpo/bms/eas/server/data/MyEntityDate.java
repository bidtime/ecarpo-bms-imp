package com.ecarpo.bms.eas.server.data;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
public class MyEntityDate extends MyEntityRoot {

  private Date create_time;
  
  @Override
  public void setCreateTime(Date createTime) {
    super.setCreateTime(createTime);
    this.create_time = this.createTime;
  }

}
