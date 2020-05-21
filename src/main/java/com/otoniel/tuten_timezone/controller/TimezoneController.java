package com.otoniel.tuten_timezone.controller;

import com.otoniel.tuten_timezone.services.TimezoneService;
import com.otoniel.tuten_timezone.services.request.TimezoneRequest;
import com.otoniel.tuten_timezone.services.response.CommonResponse;
import com.otoniel.tuten_timezone.services.response.TimezoneResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimezoneController {

  //Inyectamos el servicio para poder hacer uso de el
  @Autowired
  private TimezoneService service;

  public TimezoneController(TimezoneService timezoneService) {
      this.service = timezoneService;
  }

  /*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
	http://127.0.0.1:8080/api/timezone/  */
  @PostMapping("/timezone")
  public CommonResponse calculateNewTimeZone(@RequestBody TimezoneRequest request) {

    CommonResponse response = service.calculateNewTimeZone(request);
    /*
    CommonResponse response = new CommonResponse();

    if (request.getTime() != null && request.getTimezone() != null) {
      TimezoneResponse timezoneResponse = new TimezoneResponse();

      response.setResponse(timezoneResponse);
    }
    */
    return response;

  }
}
