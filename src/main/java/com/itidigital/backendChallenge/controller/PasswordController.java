package com.itidigital.backendChallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itidigital.backendChallenge.RequestDTO;
import com.itidigital.backendChallenge.service.PasswordService;

@RestController
@RequestMapping("/password")
public class PasswordController {
	
	@Autowired
	PasswordService service;
	
	@GetMapping("/isValid")
	public boolean isValid(@RequestBody(required = true) RequestDTO request) {
		
		boolean isValid = service.isValid(request.getPassword());
		
		return isValid;
	}


}
