package com.learn.AOP.LearningAOP;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.AOP.LearningAOP.business.Business1;
import com.learn.AOP.LearningAOP.business.Business2;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class LearningAopApplication implements CommandLineRunner{
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(LearningAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		
	}

}
