package com.bd.benu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.benu.model.limitServiceConfiguration;

@RestController
public class LimitServiceController {
	
	@GetMapping("limit-service")
	public limitServiceConfiguration limitServiceFromConfiguration() {
	
		return new limitServiceConfiguration(10, 1000);
	}

}
