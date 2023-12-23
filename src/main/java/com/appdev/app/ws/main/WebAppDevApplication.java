package com.appdev.app.ws.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.appdev.app.ws")
public class WebAppDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppDevApplication.class, args);
	}

}
