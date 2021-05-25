package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DrivingCoach implements Coach {

	private FortuneService fortuneService;
	
	public DrivingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Drive 30 laps.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
