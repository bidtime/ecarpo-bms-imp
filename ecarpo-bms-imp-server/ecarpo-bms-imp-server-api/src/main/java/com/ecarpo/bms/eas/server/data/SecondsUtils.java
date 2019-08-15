package com.ecarpo.bms.eas.server.data;

import java.util.Calendar;
import java.util.Date;

public class SecondsUtils {

  public static int getSeconds(Date dt) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dt);
    return calendar.get(Calendar.SECOND);
  }
  
  public static int seconds() {
    return getSeconds(new Date());
  }

}
