package com.otoniel.tuten_timezone.services;

import com.otoniel.tuten_timezone.services.request.TimezoneRequest;
import com.otoniel.tuten_timezone.services.response.CommonResponse;

public interface TimezoneService {

    CommonResponse calculateNewTimeZone(TimezoneRequest request);
}
