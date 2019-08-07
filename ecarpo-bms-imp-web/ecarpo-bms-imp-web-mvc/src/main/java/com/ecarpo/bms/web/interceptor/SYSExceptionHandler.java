package com.ecarpo.bms.web.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.dubbo.rpc.RpcException;
import org.bidtime.session.except.CookieNullException;
import org.bidtime.session.except.SessionNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.alibaba.fastjson.JSON;
import com.ecarpo.bms.ap.auth.user.IUser;
import com.ecarpo.bms.web.utils.ResponseUtils;
import com.ecarpo.bms.web.utils.ValidatorUtils;
import com.ecarpo.framework.exception.BaseException;
import com.ecarpo.framework.model.ResultDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * 全局异常处理 Created by riverbo on 2016/9/2.
 */
@Slf4j
@EnableWebMvc
@ControllerAdvice
public class SYSExceptionHandler {

  @Autowired
  private IUser service;

  //private static String ERROR_RESULTDTO;

  @SuppressWarnings("rawtypes")
  private static final ResultDTO ERROR = ResultDTO.error("咦，真不巧，您访问的网页打了个盹");

  @SuppressWarnings("rawtypes")
  private static final ResultDTO RPC_ERROR = ResultDTO.error("服务接口未响应");

  @SuppressWarnings("rawtypes")
  private static final ResultDTO MethodNotSupported = ResultDTO.error("请求方法类型不匹配");

  @SuppressWarnings("rawtypes")
  private static final ResultDTO MediaTypeNotSupported = ResultDTO.error("请求参数类型不匹配");

  @SuppressWarnings("rawtypes")
  private static final ResultDTO MessageNotReadable = ResultDTO.error("请求参数不能为空");

  static {
    //ERROR_RESULTDTO = JSON.toJSONString(ResultDTO.error("服务器开小差了 稍后再试吧"));
  }

  /**
   * 未处理的其余所有异常
   *
   * @param ex
   * @return
   */
  @ExceptionHandler(Exception.class)
  public String bad_biz_handler(Exception ex, HttpServletRequest req,
      HttpServletResponse response, Model model) throws IOException {

    //自定义异常
    ResultDTO<?> dto = null;
    if (ex instanceof BaseException) {
      dto = ResultDTO.error(ex.getMessage());
    } else if (ex instanceof RpcException) {
      dto = RPC_ERROR;
      //    } else if (ex instanceof RpcBizException) {
      //      dto = RPC_ERROR;
    } else if (ex instanceof BindingResult) {
      //spring @valid 数据绑定 校验失败异常处理
      dto = ResultDTO.error(ValidatorUtils.getErrorMessage((BindingResult) ex));
    } else if (ex instanceof MethodArgumentNotValidException) {
      //spring @valid @requestBody 校验失败异常处理
      BindingResult result = ((MethodArgumentNotValidException) ex).getBindingResult();
      dto = ResultDTO.error(ValidatorUtils.getErrorMessage(result));
    } else if (ex instanceof HttpRequestMethodNotSupportedException) {
      dto = MethodNotSupported;
    } else if (ex instanceof HttpMediaTypeNotSupportedException) {
      dto = MediaTypeNotSupported;
    } else if (ex instanceof HttpMessageNotReadableException) {
      dto = MessageNotReadable;
    } else if (ex instanceof RuntimeException) {
      Throwable t1 = ex.getCause();
      if (t1 != null) {
        Throwable t2 = t1.getCause();
        if (t2 != null && t2 instanceof BaseException) {
          dto = ResultDTO.error(t2.getMessage());
        }
      }
      if (dto == null) {
        String en = ex.getClass().getName();
        String e = ex.getMessage();
        if (en.startsWith("com.ecarpo.framework.exception")) {
          dto = ResultDTO.error(substring(e, ":", "\n"));
        } else if (en.startsWith("org.springframework.dao")) {
          dto = ResultDTO.error("DAO: 出错，" + substring(e, ":"));
        } else {
          dto = ResultDTO.error("系统: 出错，" + substring(e, ":"));
        }
      }
    } else if (ex instanceof CookieNullException || ex instanceof SessionNullException) {
      dto = ResultDTO.error(ex.getMessage());
    } else if (ex instanceof Exception) {
      dto = ERROR;
    } else {
      dto = ERROR;
    }
//    log.error("request[{}] BAD_BIZ: message:{}，stack:{}, cause:{}", request.getRequestURI(),
//        ex.getMessage(), ex.getStackTrace(), ex.getCause());
    log.error("request[{}] BAD_BIZ: {}, {}, {}, {}, {}, {}, {}", req.getRequestURI(), req.getMethod(), dto.getMsg(),
        service.getSessionId(req), service.getUserName(req), req.getAttribute("body_context"), 
        ex.getStackTrace(), ex.getCause());
    if (isAjax(req)) {
      ResponseUtils.writeObject(JSON.toJSONString(dto), response);
      return null;
    } else {
      ResponseUtils.writeObject(JSON.toJSONString(dto), response);
      //response.sendRedirect("/static/views/error.html");
      return null;
      //model.addAttribute("title", "访问出错");
      //model.addAttribute("error", dto);
      //return "error";
    }
  }
  
//  private void logPostError(HttpServletRequest req, String t) {
//    log.info("{}: {}, {}, {}, {}, {}", t, service.getSessionId(req), service.getUserName(req), 
//        req.getMethod(), req.getRequestURI(), req.getAttribute("body_context"));
//  }


  private static String substring(String ex, String bef, String aft) {
    String result = null;
    int pos = ex.indexOf(aft);
    if (pos > -1) {
      String e = ex.substring(0, pos);
      int idx = e.indexOf(bef);
      if (idx > -1) {
        result = e.substring(idx + 1);
      }
    }
    return result;
  }
  
  private static String substring(String ex, String aft) {
    String result = null;
    int pos = ex.indexOf(aft);
    if (pos > -1) {
      result = ex.substring(0, pos);
    }
    return result;
  }

  //  public ModelAndView model(String errorPage){  
  //    ModelAndView mav = new ModelAndView(errorPage);  
  //    mav.addObject("title", "访问出错");  
  //    mav.addObject("message", "");  
  //    return mav;  
  //  }  

  /**
   * 判断ajax请求
   *
   * @param request
   * @return
   * @author riverbo
   * @since 2018.07.26 增加判断 Accept 属性，因为 Content-Type 属性无值
   */
  private boolean isAjax(HttpServletRequest request) {
    return equals(request, "X-Requested-With", "XMLHttpRequest") || containsJson(request, "Accept")
        || containsJson(request, "Content-Type");
    //containsJson(request, "accept") || containsJson(request, "content-type")
  }

  //  private boolean isAjax(HttpServletRequest request) {
  //    boolean b = containsJson(request, "Content-Type") || containsJson(request, "content-type")
  //        || equals(request, "X-Requested-With", "XMLHttpRequest");
  //    return b;
  //  }

  /**
   * 判断key包含 application/json
   *
   * @param request
   * @param key
   * @return
   */
  private boolean containsJson(HttpServletRequest request, String key) {
    return contains(request, key, "application/json");
  }

  /**
   * 判断包含key
   *
   * @param request
   * @param key
   * @param value
   * @return
   */
  private boolean contains(HttpServletRequest request, String key, String value) {
    String ctx = request.getHeader(key);
    return ctx != null && ctx.contains(value);
  }

  /**
   * 判断等於key的value
   *
   * @param request
   * @param key
   * @param value
   * @return
   */
  private boolean equals(HttpServletRequest request, String key, String value) {
    String ctx = request.getHeader(key);
    return ctx != null && ctx.equals(value);
  }

}
