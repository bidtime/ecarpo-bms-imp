package com.ecarpo.bms.ap.server.auth.userduty.dto;

import java.util.List;

import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class InsertUserDutyDTO extends InsertDTO {

  private static final long serialVersionUID = 1L;

  public InsertUserDutyDTO(Long userId, List<Long> dutyIds) {
    this.userId = userId;
    this.dutyIds = dutyIds;
  }

  public InsertUserDutyDTO() {
  }

  private Long userId;

  private List<Long> dutyIds;

}
