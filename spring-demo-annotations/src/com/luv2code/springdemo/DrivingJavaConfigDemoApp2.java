package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrivingJavaConfigDemoApp2 {

	public static void main(String[] args) {
		
		// read spring java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (DrivingConfig.class); 
		
		// get the bean from spring container
		DrivingCoach theCoach = context.getBean("drivingCoach", DrivingCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		// close the context
		context.close();
	}

}
