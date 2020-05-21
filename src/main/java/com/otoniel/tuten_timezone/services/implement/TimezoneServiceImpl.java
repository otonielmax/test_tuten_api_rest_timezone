package com.otoniel.tuten_timezone.services.implement;

import com.otoniel.tuten_timezone.services.TimezoneService;
import com.otoniel.tuten_timezone.services.request.TimezoneRequest;
import com.otoniel.tuten_timezone.services.response.CommonResponse;
import com.otoniel.tuten_timezone.services.response.TimezoneResponse;
import com.otoniel.tuten_timezone.utils.Utility;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@Service
public class TimezoneServiceImpl implements TimezoneService {

  @Override
  public CommonResponse calculateNewTimeZone(TimezoneRequest request) {
    CommonResponse response = new CommonResponse();

    if (request.getTime() != null && request.getTimezone() != null) {
      TimezoneResponse timezoneResponse = new TimezoneResponse();

      String[] time = request.getTime().split(":");

      ZonedDateTime fecha = ZonedDateTime.of(
              2015,
              1,
              31,
              Integer.parseInt(time[0]),
              Integer.parseInt(time[1]),
              Integer.parseInt(time[2]),
              00,
              ZoneId.of(request.getTimezone())
      );

      ZonedDateTime zDT = fecha.withZoneSameInstant(ZoneId.of("UTC"));

      System.out.printf("Hora %s:\t\t %s\n", request.getTimezone(),  fecha);
      System.out.printf("Hora UTC:\t %s\n", zDT);

      timezoneResponse.setTimezone("UTC");
      timezoneResponse.setTime(
              (zDT.getHour() < 10 ? "0" + zDT.getHour() : zDT.getHour()) + ":" +
              (zDT.getMinute() < 10 ? "0" + zDT.getMinute() : zDT.getMinute()) + ":" +
              (zDT.getSecond() < 10 ? "0" + zDT.getSecond() : zDT.getSecond())
      );

      response.setResponse(timezoneResponse);
    }

    return response;
  }
}
