/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.ecarpo.bms.eas.server.user.qo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author lhf
 * @since 2019.05.21
 *
 *
 */
@SuppressWarnings("serial")
@Data
public class IdNameQO implements Serializable {

  private Integer id;

  private String name;

}
