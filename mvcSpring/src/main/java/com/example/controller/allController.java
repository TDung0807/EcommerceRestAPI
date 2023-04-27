package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.userService;

@Controller
public class allController {
	@Autowired
	userService userService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("listUser", userService.getAll());
		return "index";
	}
	
	@GetMapping("signin")
	public String signin() {
		return "signupin";
	}
	
	@PostMapping("signin")
	public String login(Model model,@RequestParam Map<String,String> allParams) {
		if(allParams.containsKey("btnSignin")) {
			userService.login(allParams);
		}
		if(allParams.containsKey("btnSignup")) {
			userService.signup(allParams);
		}
		return "signupin";	
	}
}
