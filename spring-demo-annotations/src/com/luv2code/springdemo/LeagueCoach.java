package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LeagueCoach implements Coach {
	@Autowired
	@Qualifier("practiceFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice Csing!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
