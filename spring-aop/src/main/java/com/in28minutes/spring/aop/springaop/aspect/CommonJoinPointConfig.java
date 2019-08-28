package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("@annotation(com.in28minutes.spring.aop.springaop.data.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
