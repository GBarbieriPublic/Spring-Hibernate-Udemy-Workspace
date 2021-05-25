package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DrivingFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will win your race!";
	}

}
