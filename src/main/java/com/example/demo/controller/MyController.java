package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@GetMapping("/test_docker")
	public String getData()
	{
		return "Hello Docker How are you";
	}

}
