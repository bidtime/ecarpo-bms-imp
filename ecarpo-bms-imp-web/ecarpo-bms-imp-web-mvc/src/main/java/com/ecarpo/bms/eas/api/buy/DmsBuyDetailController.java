package com.ecarpo.bms.eas.api.buy;

/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecarpo.bms.ap.auth.user.UserLoginBO;
import com.ecarpo.bms.ap.auth.user.dto.UserUtils;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailInsertDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.dto.DmsBuyDetailUpdateDTO;
import com.ecarpo.bms.eas.server.dmsbuydetail.service.DmsBuyDetailService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.21
 */
@RestController
@RequestMapping("/api/dms/import/dms_buy_detail")
public class DmsBuyDetailController {

  @Autowired
  private DmsBuyDetailService service;

  @RequestMapping(value = "get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object info(@PathVariable Long id) throws Exception {
    //return service.getById(id);
    return new ResultDTO<>("");
  }

  @RequestMapping(value = "insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object insert(@Valid @RequestBody DmsBuyDetailInsertDTO dto, UserLoginBO user) throws Exception {
    UserUtils.copy(dto, user);
    return service.insert(dto);
  }

  @RequestMapping(value = "update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object update(@Valid @RequestBody DmsBuyDetailUpdateDTO dto, UserLoginBO user) throws Exception {
    UserUtils.copy(dto, user);
    return service.update(dto);
  }
}