package com.itidigital.backendChallenge.service.validators;

public class RepeatedCharacterValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		for(int i = 0 ; i < password.length(); i++) {
			for(int e = 0 ; e < password.length(); e++) {
				if(e == i) continue;
				if(password.charAt(i) == password.charAt(e)) return false;
			}
		}
		return true;
	}

	@Override
	public String whatsMyName() {
		return new String("RepeatedCharacterValidator");
	}

}
