package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppEx {

	public static void main(String[] args) {
		// load our config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve our bean
		Coach theCoach = context.getBean("basketballCoach", Coach.class);
		// do something with our bean
		System.out.println(theCoach.getDailyWorkout());
		//close context
		context.close();
	}

}
