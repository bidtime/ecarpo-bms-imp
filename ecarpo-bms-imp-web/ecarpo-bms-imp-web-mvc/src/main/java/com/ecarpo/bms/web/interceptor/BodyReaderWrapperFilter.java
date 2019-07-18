package com.ecarpo.bms.web.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "bodyReaderWrapperFilter", urlPatterns = "/*")
public class BodyReaderWrapperFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    if (request instanceof HttpServletRequest) {
      ServletRequest requestWrapper = new BodyReaderWrapper(
          (HttpServletRequest) request);
      chain.doFilter(requestWrapper, response);
    } else {
      chain.doFilter(request, response);
    }
  }

  @Override
  public void destroy() {
  }

}
