package com.learningSpringBoot.learn_springboot;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonController {
	@RequestMapping("/persons")
	public List<Person> retrieveAllCourses(){
		return Arrays.asList(
				new Person(1,"Thareesha",23,"Colombo"),
				new Person(2,"Cariya", 22,"Gampaha"),
				new Person(3,"Aneeee" , 11 , "Kurunagala")
		);
	}
}
