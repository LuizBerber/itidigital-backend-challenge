package com.itidigital.backendChallenge.service.validators;

public class LowercaseValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		
		for(int i = 0 ; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))) return true;
		}
		
		return false;
	}

	@Override
	public String whatsMyName() {
		return new String("LowercaseValidator");
	}

}
