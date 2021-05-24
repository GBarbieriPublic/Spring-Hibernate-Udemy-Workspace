package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes;
	
	public HappyFortuneService() {
		
	}
	
	public String[] getFortunes() {
		return fortunes;
	}

	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

	@Override
	public String getFortune() {
		// max size of fortune array
		int max = fortunes.length - 1;
		int min = 0;
		Random rn = new Random();
		// generate random number between 0 - fortunes.length-1
		int rand = rn.nextInt((max - min + 1) + min);
		return fortunes[rand];
	}

}
