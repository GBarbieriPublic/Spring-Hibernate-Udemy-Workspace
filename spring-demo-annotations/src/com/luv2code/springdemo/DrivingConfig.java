package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrivingConfig {

	// define bean for our fortune service
	@Bean
	public FortuneService drivingFortuneService() {
		return new DrivingFortuneService();
	}
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach drivingCoach() {
		return new DrivingCoach(drivingFortuneService());
	}
	
	
	
}
