package com.spiral.LMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
	//	model.addAllAttributes(userService.getAllUsers());
		model.addAttribute("listUsers", userService.getAllUsers());

		return "menu1";
	}
}
