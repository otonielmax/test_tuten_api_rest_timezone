package com.otoniel.tuten_timezone.utils;

import java.util.TimeZone;

public class Utility {

  public static long toLocalTime(long time, TimeZone to) {
    return time + to.getOffset(time);
  }

  public static long toUTC(long time, TimeZone from) {
    return time - from.getOffset(time);
  }
}
