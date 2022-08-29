package com.itidigital.backendChallenge.service.validators;

public interface PasswordValidationStep {
	String whatsMyName();
	boolean isValid(String password);
}
