package com.ecarpo.bms.ap.server.auth.usermenu.dto;

import java.util.Map;
import java.util.Set;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserMenuInsertDTO extends InsertDTO {
  
  public UserMenuInsertDTO() {
  }

//  public UserMenuInsertDTO(Long userId, Map<Long, Set<Long>> productMenuIds) {
//    this.userId = userId;
//    this.productMenuIds = productMenuIds;
//  }

  private Long userId;

  private Map<Long, Set<Long>> productMenuIds;

}
