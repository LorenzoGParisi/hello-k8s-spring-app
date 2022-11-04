package com.parisi.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/hello")
	public String hello() {
		return "<h1>Hello!<h1>";
	}
}
