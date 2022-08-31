package com.itidigital.backendChallenge.service.validators;

import org.apache.commons.lang3.StringUtils;

public class WhiteSpaceValidator implements PasswordValidationStep {

	@Override
	public boolean isValid(String password) {
		return !StringUtils.containsWhitespace(password);
	}

}
