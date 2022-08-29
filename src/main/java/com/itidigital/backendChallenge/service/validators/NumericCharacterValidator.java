package com.itidigital.backendChallenge.service.validators;

public class NumericCharacterValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		
		for(int i = 0 ; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) return true;
		}
		
		return false;
	}

	@Override
	public String whatsMyName() {
		return new String("NumericCharacterValidator");
	}

}
