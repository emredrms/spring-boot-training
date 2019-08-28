package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long startDate = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startDate;
		logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
	}
	
}
