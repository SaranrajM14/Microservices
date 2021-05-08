package com.saranraj2.coderulagam.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontoller {
	@GetMapping("/products")
	public String products() {
		return "Producuts";
	}

}
