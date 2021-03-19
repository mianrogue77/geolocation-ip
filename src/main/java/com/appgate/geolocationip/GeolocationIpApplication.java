package com.appgate.geolocationip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GeolocationIpApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello, Doker World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GeolocationIpApplication.class, args);
	}

}
