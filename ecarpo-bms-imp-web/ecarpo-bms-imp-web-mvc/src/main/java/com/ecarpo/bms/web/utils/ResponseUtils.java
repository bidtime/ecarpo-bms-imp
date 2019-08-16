/**
 * 
 */
package com.ecarpo.bms.web.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ResponseUtils 提供对Response的操作,往Response输出各种对象
 * 
 * @author riverbo
 * @since 2018.04.17
 */
public class ResponseUtils {

  private static final Logger logger = LoggerFactory.getLogger(ResponseUtils.class);

  public static void writeObject(Object o, HttpServletResponse r) {
    if (o == null) {
      return;
    }
    writeString(o.toString(), r);
  }

  /**
   * @param sReturn
   * @param r
   */
  public static void writeString(String s, HttpServletResponse r) {
    try {
      r.setHeader("Cache-Control", "no-cache"); // HTTP 1.1
      r.setHeader("Pragma", "no-cache"); // HTTP 1.0
      r.setDateHeader("Expires", 0); // prevents caching at the proxy server
      r.setCharacterEncoding("UTF-8");
      r.setContentType("application/json;charset=UTF-8");
      // write string
      r.getOutputStream().write(s.getBytes("UTF-8"));
      //r.getWriter().write(s);
      // flush buffer
      r.flushBuffer();
      if (logger.isDebugEnabled()) {
        logger.debug(s);
      }
    } catch (IOException e) {
      logger.error("setResponse", e);
    }
  }

}
