package com.ecarpo.bms.web.utils;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * ValidatorUtils
 * 
 * @author riverbo
 * @since 2018.04.17
 */
public class ValidatorUtils {

  public static String getErrorMessage(BindingResult result) {
    StringBuilder sb = new StringBuilder();
    try {
      if (result.hasErrors()) {
        for (FieldError error : result.getFieldErrors()) {
          String errorType = error.getCode();
          if (errorType.equalsIgnoreCase("typeMismatch")) {
            sb.append(error.getField() + "格式错误\n");
          } else {
            sb.append(error.getDefaultMessage() + "\n");
          }

        }
      }
      return sb.toString();
    } finally {
      sb.setLength(0);
      sb = null;
    }
  }

  //    public static String getErrorMessage(BindingResult result) {
  //    	StringBuilder sb = new StringBuilder();
  //        try {
  //	        if (result.hasErrors()) {
  //	            for (FieldError error : result.getFieldErrors()) {
  //	                String errorType = error.getCode();
  //	                if (errorType.equalsIgnoreCase("typeMismatch")) {
  //                    sb.append(error.getField() + "格式错误 ");
  //	                } else {
  //	                  sb.append(error.getDefaultMessage() + " ");
  //	                }
  //	
  //	            }
  //	        }
  //	        return sb.toString();
  //	    } finally {
  //	    	sb.setLength(0);
  //	    	sb = null;
  //	    }
  //    }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static String valid(Object obj, Class... calssT) {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    Set s = validator.validate(obj, calssT);
    Iterator<ConstraintViolation<Object>> iter = s.iterator();
    StringBuilder sb = new StringBuilder();
    try {
      while (iter.hasNext()) {
        ConstraintViolation<Object> c = iter.next();
        String message = c.getMessage() + ";";
        sb.append(message);
      }
      return sb.toString();
    } finally {
      sb.setLength(0);
      sb = null;
    }
  }

  //    @SuppressWarnings({ "rawtypes", "unchecked" })
  //    public static ValidatorResult validForRes(Object obj, Class... calssT) {
  //        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  //        Validator validator = factory.getValidator();
  //        Set s = validator.validate(obj, calssT);
  //        Iterator<ConstraintViolation<Object>> iter = s
  //                .iterator();
  //        StringBuilder sb = new StringBuilder();
  //        try {
  //	        ValidatorResult result = new ValidatorResult();
  //	        result.setResult(true);
  //	        while (iter.hasNext()) {
  //	            ConstraintViolation<Object> c = iter.next();
  //	            String message = c.getMessage() + ";";
  //	            sb.append(message);
  //	            result.setResult(false);
  //	        }
  //	        result.setMsg(sb.toString());
  //	        return result;
  //        } finally {
  //        	sb.setLength(0);
  //        	sb = null;
  //        }
  //    }

  @SuppressWarnings("rawtypes")
  public static String validateProperty(Object obj, String filed, Class... calssT) {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    Set<ConstraintViolation<Object>> s = validator.validateProperty(obj, filed, calssT);
    Iterator<ConstraintViolation<Object>> iter = s.iterator();
    StringBuilder sb = new StringBuilder();
    try {
      while (iter.hasNext()) {
        ConstraintViolation<Object> c = iter.next();
        String message = c.getMessage() + ";";
        sb.append(message);
      }
      return sb.toString();
    } finally {
      sb.setLength(0);
      sb = null;
    }
  }

}
