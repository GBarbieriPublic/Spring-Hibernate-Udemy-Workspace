package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired // Field Injection
	@Qualifier("randomFortuneService") // call the service here
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor.");
	}

	// define a setter method
	
	/* Method Injection
	@Autowired
	public void anyMethodNameHere(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside anyMethodNameHere() method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/* Setter Injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/* Constructor Injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
