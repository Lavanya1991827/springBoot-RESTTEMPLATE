package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.service.RestClientInformation;

@SpringBootApplication
public class SpringBootResttemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootResttemplateApplication.class, args);
		RestClientInformation bean = context.getBean(RestClientInformation.class);
		bean.getMessage();
		
	}

}
