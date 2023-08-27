package com.bd.benu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.benu.config.Configuration;
import com.bd.benu.model.LimitServiceConfiguration;

@RestController
public class LimitServiceController {
	 
	@Autowired
	private Configuration configuration;
	
	@GetMapping("limit-service")
	public LimitServiceConfiguration limitServiceFromConfiguration() {
	
		return new LimitServiceConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}

}
