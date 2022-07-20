package com.catherine.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catherine.limitsservice.configuration.LimitsServiceConfiguration;
import com.catherine.limitsservice.entity.Limits;

@RestController
public class LimitsController {
	@Autowired
	public LimitsServiceConfiguration config;
	
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(config.getMinimum(),config.getMaximum()); 
	}

}
