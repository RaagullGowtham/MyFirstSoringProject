package com.example.myfirstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyFirstController {
	
	@GetMapping
	public String returnValue() {
		return " Hi, Welcome to your First SpringBoot Application";
	}
}
