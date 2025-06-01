package com.spiral.LMS.service;

import java.util.List;
import com.spiral.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiral.LMS.models.User;
import com.spiral.LMS.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
}
