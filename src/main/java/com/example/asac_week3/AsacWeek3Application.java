package com.example.asac_week3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AsacWeek3Application {

	public static void main(String[] args) {
		SpringApplication.run(AsacWeek3Application.class, args);
	}

}
