package io.springboot.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.springboot.com.Entity.User;

@Controller
public class ParentController {
	@GetMapping("/")
	public String show() {
		 return "home";
	}
	@GetMapping("/registration")
public String registration(User user) {
	return "registration";
	}
	
	@PostMapping("/Register")
	public String register(@ModelAttribute("User") User user) {
		
		System.out.println(user);
		return "welcome";
	}
}
