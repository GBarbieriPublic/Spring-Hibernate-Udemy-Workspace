package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PracticeFortuneService implements FortuneService {

	@Value("${foo.fortunes}")
	private String[] fortunes;

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(fortunes.length);
		String theFortune = fortunes[index];
		return theFortune;
	}

}
