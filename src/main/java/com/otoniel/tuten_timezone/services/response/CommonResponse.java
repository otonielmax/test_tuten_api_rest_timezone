package com.otoniel.tuten_timezone.services.response;

public class CommonResponse {

  private Object response;

  public CommonResponse() {
    this.response = "Sin respuesta";
  }

  public CommonResponse(Object response) {
    this.response = response;
  }

  public Object getResponse() {
    return response;
  }

  public void setResponse(Object response) {
    this.response = response;
  }
}
