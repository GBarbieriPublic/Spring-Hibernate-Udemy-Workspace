package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related adivces for logging

	// let's start with an @Before advice
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("========>>>  Executing @Before advice on addAccount()");
	}

	@Before("forDaoPackage()")
	public void performAPIAnalytics() {
		System.out.println("========>>>  Performing API Analytics()");
	}

}
