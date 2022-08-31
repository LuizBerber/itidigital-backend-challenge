package com.itidigital.backendChallenge.service.validators;

public class UppercaseValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		
		for(int i = 0 ; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) return true;
		}
		
		return false;
	}
	
}
