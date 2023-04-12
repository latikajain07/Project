package com.spring.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class PortalApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PortalApplication.class, args);
	     
	}

//	@Bean
//	public Student beanReturn() {
//		return new Student();
//	}

}
