package com.ecarpo.bms.web.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * HttpResponseUtils
 * 
 * @author riverbo
 * @since 2018.04.17
 */
@Slf4j
public class HttpResponseUtils {

  /**
   * @param sReturn
   * @param r
   */
  public static void setResponse(String s, HttpServletResponse r) {
    try {
      r.setHeader("Cache-Control", "no-cache"); // HTTP 1.1
      r.setHeader("Pragma", "no-cache"); // HTTP 1.0
      r.setDateHeader("Expires", 0); // prevents caching at the proxy server
      r.setCharacterEncoding("UTF-8");
      r.setContentType("application/json;charset=UTF-8");
      // write string
      r.getWriter().write(s);
      // flush buffer
      r.flushBuffer();
      if (log.isDebugEnabled()) {
        log.debug(s);
      }
    } catch (IOException e) {
      log.error("setResponse", e);
    }
  }

}
