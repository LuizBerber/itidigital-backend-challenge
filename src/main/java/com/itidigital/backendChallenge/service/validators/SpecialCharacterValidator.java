package com.itidigital.backendChallenge.service.validators;

import org.apache.commons.lang3.StringUtils;

public class SpecialCharacterValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		return StringUtils.containsAny(password, "!@#$%^&*()-+");
	}

	@Override
	public String whatsMyName() {
		return new String("SpecialCharacterValidator");
	}

}
