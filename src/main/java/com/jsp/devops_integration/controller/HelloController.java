package com.jsp.devops_integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String home() {
		return "Hello from DevOps Project 🚀";
	}
}
