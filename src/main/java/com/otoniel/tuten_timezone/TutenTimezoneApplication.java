package com.otoniel.tuten_timezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TutenTimezoneApplication {

	public static void main(String[] args) {
		System.setProperty("HOME", "/tuten_timezone");
		SpringApplication.run(TutenTimezoneApplication.class, args);
	}

}
