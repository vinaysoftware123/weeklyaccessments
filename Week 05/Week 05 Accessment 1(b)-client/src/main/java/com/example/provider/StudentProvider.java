package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentprovider")
public class StudentProvider {

	@GetMapping("/display")
	public String showMsg() {
		return "Hello I am a Provider Application!!!";
	}
}
