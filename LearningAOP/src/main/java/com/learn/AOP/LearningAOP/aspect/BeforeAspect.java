package com.learn.AOP.LearningAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.classic.Logger;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.learn.AOP.LearningAOP.business.*.*(..)")
	public void before() {
		logger.info("Intercepted Method called");
	}
}
