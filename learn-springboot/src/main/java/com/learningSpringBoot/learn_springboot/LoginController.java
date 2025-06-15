package com.learningSpringBoot.learn_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
	
	@GetMapping("/welcome")
    public String showWelcomePage() {
        return "welcome"; // Return the view name (e.g., welcome.html)
    }
}
