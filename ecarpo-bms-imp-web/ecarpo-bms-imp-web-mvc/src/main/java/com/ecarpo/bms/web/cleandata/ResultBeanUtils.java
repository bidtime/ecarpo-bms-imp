package com.ecarpo.bms.web.cleandata;

import java.lang.reflect.Field;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 清除bean属性
 * 
 * @author riverbo
 * @since 2017.08.08
 */
@Slf4j
public class ResultBeanUtils {

  private static boolean isJavaSimpleClazz(Class<?> clz) {
    return clz != null && clz.getClassLoader() == null;
  }

  @SuppressWarnings("rawtypes")
  private static void cleanProps(Object bean, Collection<String> cols) throws Exception {
    if (bean == null || CollectionUtils.isEmpty(cols)) {
      return;
    }
    // 得到类对象  
    Class clz = (Class) bean.getClass();

    /* 
     * 得到类中的所有属性集合 
     */
    Field[] fs = clz.getDeclaredFields();
    for (int i = 0; i < fs.length; i++) {
      Field f = fs[i];
      Class c = f.getType();
      if (cols.contains(f.getName())) {
        //cols.remove(f.getName());
        //if (!Modifier.isPublic(f.getDeclaringClass().getModifiers())) {
        f.setAccessible(true); //设置些属性是可以访问的
        //}
        if (isJavaSimpleClazz(c)) {
          if (c == String.class) {
            try {
              f.set(bean, "N/A");
            } catch (Exception e) {
              log.error("set: {}", e.getMessage());
            }
            //} else if (c == Number.class) {
            //  f.set(bean, "N/A");
          } else {
            f.set(bean, null);
          }
        }
      }
      //if ( CollectionUtils.isEmpty(cols) ) {
      //  break;
      //}
      // 自定义类，再循环
      if (!isJavaSimpleClazz(c)) {
        Object o = f.get(bean);
        cleanBean(o, cols);
      }
    }
  }

  @SuppressWarnings("unchecked")
  public static void cleanBean(Object source, Collection<String> columns) throws Exception {
    if (source == null || CollectionUtils.isEmpty(columns)) {
      return;
    }
    if (source instanceof Collection) {
      Collection<Object> list = (Collection<Object>) source;
      if (CollectionUtils.isEmpty(list)) {
        return;
      }
      for (Object o : list) {
        cleanProps(o, columns);
      }
    } else {
      cleanProps(source, columns);
    }
  }

  //  public static void cleanProps(Object obj, Collection<String> set, String... ignoreProperties) throws Exception {
  //    if (set == null) {
  //      return;
  //    }
  //    BeanUtils.copyProperties(obj, obj, ignoreProperties);
  //    try {
  //      BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
  //      PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
  //      for (PropertyDescriptor property : propertyDescriptors) {
  //        String key = property.getName();
  //        // 过滤class属性  
  //        if (!key.equals("class")) {
  //          // 得到property对应的getter方法  
  //          Method getter = property.getReadMethod();
  //          Object value = getter.invoke(obj);
  //          //if ( value != null ) {
  //          //  map.put(key, value);
  //          //}
  //        }
  //      }
  //    } catch (Exception e) {
  //      //System.out.println("transBean2Map Error " + e);
  //      throw new Exception(e);
  //    }
  //  }

  ////Map --> Bean 1: 利用Introspector,PropertyDescriptor实现 Map --> Bean  
  //public static void map2bean(Object obj, Map<String, Object> map) throws Exception {
  //try {
  // BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
  // PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
  // for (PropertyDescriptor property : propertyDescriptors) {
  //   String key = property.getName();
  //   if (map.containsKey(key)) {
  //     Object value = map.get(key);
  //     if ( value != null ) {
  //       // 得到property对应的setter方法  
  //       Method setter = property.getWriteMethod();
  //       setter.invoke(obj, value);
  //     }
  //   }
  // }
  //} catch (Exception e) {
  // //System.out.println("transMap2Bean Error " + e);
  // throw new Exception(e);
  //}
  //}

  //private static void cleanProps(Object source, Class<?> editable, Collection<String> ignoreCollect)
  //    throws BeansException {
  //  if (source == null || CollectionUtils.isEmpty(ignoreCollect)) {
  //    return;
  //  }
  //
  //  //Assert.notNull(source, "Source must not be null");
  //
  //  Class<?> actualEditable = source.getClass();
  //  if (editable != null) {
  //    if (!editable.isInstance(source)) {
  //      throw new IllegalArgumentException("Target class [" + source.getClass().getName()
  //          + "] not assignable to Editable class [" + editable.getName() + "]");
  //    }
  //    actualEditable = editable;
  //  }
  //  PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(actualEditable);
  //  for (PropertyDescriptor targetPd : targetPds) {
  //    Method writeMethod = targetPd.getWriteMethod();
  //    if (writeMethod != null && (ignoreCollect.contains(targetPd.getName()))) {
  //      try {
  //        if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
  //          writeMethod.setAccessible(true);
  //        }
  //        writeMethod.invoke(source, null);
  //      } catch (Exception e) {
  //        throw new FatalBeanException(
  //            "Could not copy property '" + targetPd.getName() + "' from source to target", e);
  //      }
  //      //PropertyDescriptor sourcePd = BeanUtils.getPropertyDescriptor(source.getClass(), targetPd.getName());
  //      //if (sourcePd != null) {
  //      //  Method readMethod = sourcePd.getReadMethod();
  //      //          if (readMethod != null &&
  //      //              ClassUtils.isAssignable(writeMethod.getParameterTypes()[0], readMethod.getReturnType())) {
  //      //            try {
  //      //              if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
  //      //                readMethod.setAccessible(true);
  //      //              }
  //      //              Object value = readMethod.invoke(source);
  //      //              if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
  //      //                writeMethod.setAccessible(true);
  //      //              }
  //      //              writeMethod.invoke(source, value);
  //      //            }
  //      //            catch (Throwable ex) {
  //      //              throw new FatalBeanException(
  //      //                  "Could not copy property '" + targetPd.getName() + "' from source to target", ex);
  //      //            }
  //      //          }
  //      // }
  //    }
  //  }
  //}

}
