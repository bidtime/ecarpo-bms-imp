/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.material.dto;

import java.util.List;

import com.ecarpo.bms.eas.group.dto.SaveGroupDTO;
import com.ecarpo.bms.eas.orgrange.dto.SaveOrgRangeDTO;
import com.ecarpo.framework.model.InsertDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lhf
 * @since 2019.05.21
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class EasMaterialOtherDTO extends InsertDTO {

  private List<SaveOrgRangeDTO> orgRanges;

  private List<SaveGroupDTO> groups;

}
