package com;

/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

import org.springframework.test.context.ContextConfiguration;

/**
 * @author Jades.He
 * @since 2017.06.14
 */
@ContextConfiguration(locations = "classpath*:/META-INF/spring/spring-*.xml")
//@ContextConfiguration(locations = "classpath:/META-INF/spring/spring-*.xml")
public class EASServerRun {

  public static void main(String[] args) {
    org.apache.dubbo.container.Main.main(args);
  }

}
