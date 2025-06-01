package com.learn.AOP.LearningAOP.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	public String retrieveSomething() {
		return "Daoo1";
	}
}
