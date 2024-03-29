package com.example.oktaoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class OktaOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(OktaOauth2Application.class, args);
	}

}
