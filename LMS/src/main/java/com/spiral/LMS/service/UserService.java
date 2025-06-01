package com.spiral.LMS.service;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;

import com.spiral.LMS.models.User;

public interface UserService {
    @Query("SELECT name FROM users")
	List<User> getAllUsers();
}
