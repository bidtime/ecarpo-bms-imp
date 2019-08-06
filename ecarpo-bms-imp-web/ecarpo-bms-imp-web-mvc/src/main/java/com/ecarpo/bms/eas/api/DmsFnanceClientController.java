package com.ecarpo.bms.eas.api;

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
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientInsertDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.dto.DmsFinanceClientUpdateDTO;
import com.ecarpo.bms.eas.server.dmsfinanceclient.service.DmsFinanceClientService;
import com.ecarpo.framework.model.ResultDTO;

/**
 * @author lhf
 * @since 2019.05.21
 */
@RestController
@RequestMapping("/api/dms/import/dms_finance_client")
public class DmsFnanceClientController {

  @Autowired
  private DmsFinanceClientService service;

  @RequestMapping(value = "get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object info(@PathVariable Long id) throws Exception {
    //return service.getById(id);
    return new ResultDTO<>("");
  }

  @RequestMapping(value = "insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object insert(@Valid @RequestBody DmsFinanceClientInsertDTO dto, UserLoginBO user) throws Exception {
    UserUtils.copy(dto, user);
    return service.insert(dto);
  }

  @RequestMapping(value = "update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object update(@Valid @RequestBody DmsFinanceClientUpdateDTO dto, UserLoginBO user) throws Exception {
    UserUtils.copy(dto, user);
    return service.update(dto);
  }
}
