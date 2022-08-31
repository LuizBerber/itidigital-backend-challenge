package com.itidigital.backendChallenge.service.validators;

public class MinimumNumberOfCharactersValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		return password.length() >= 9;
	}

}
