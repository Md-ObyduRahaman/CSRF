package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@PostMapping("/saveData")
	public String saveData(String uname) {
		
		System.out.println(uname);
		return "home";
	}
}
