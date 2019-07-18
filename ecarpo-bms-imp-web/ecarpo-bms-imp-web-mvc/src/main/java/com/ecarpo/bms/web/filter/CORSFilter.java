package com.ecarpo.bms.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * CORSFilter
 * 
 * @author riverbo
 * @since 2018.04.17
 */
public class CORSFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    response.setContentType("text/html;charset=UTF-8");
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "0");
    response.setHeader("Access-Control-Allow-Headers",
        "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("XDomainRequestAllowed", "1");

    filterChain.doFilter(req, response);
  }

  @Override
  public void destroy() {

  }

}
