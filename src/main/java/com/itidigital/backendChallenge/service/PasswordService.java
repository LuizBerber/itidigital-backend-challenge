package com.itidigital.backendChallenge.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.itidigital.backendChallenge.service.validators.LowercaseValidator;
import com.itidigital.backendChallenge.service.validators.MinimumNumberOfCharactersValidator;
import com.itidigital.backendChallenge.service.validators.NumericCharacterValidator;
import com.itidigital.backendChallenge.service.validators.PasswordValidationStep;
import com.itidigital.backendChallenge.service.validators.RepeatedCharacterValidator;
import com.itidigital.backendChallenge.service.validators.SpecialCharacterValidator;
import com.itidigital.backendChallenge.service.validators.UppercaseValidator;
import com.itidigital.backendChallenge.service.validators.WhiteSpaceValidator;

@Service
public class PasswordService {
	
	public boolean isValid(String password) {
		
		ArrayList<PasswordValidationStep> validationSteps = new ArrayList<>();
		
		
		validationSteps.add(new MinimumNumberOfCharactersValidator());
		validationSteps.add(new NumericCharacterValidator());
		validationSteps.add(new RepeatedCharacterValidator());
		validationSteps.add(new SpecialCharacterValidator());
		validationSteps.add(new WhiteSpaceValidator());
		validationSteps.add(new LowercaseValidator());
		validationSteps.add(new UppercaseValidator());
		
		for(PasswordValidationStep step : validationSteps) {
			System.out.println(step.whatsMyName());
			if(!step.isValid(password)) return false;
		}
		
		return true;
	}

}
