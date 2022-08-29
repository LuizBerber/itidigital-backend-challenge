package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SpecialCharacterValidatorTest {

	@Test
	void test() {
		
		String specialCharacters = "!@#$%^&*()-+";
		String[] specialCharactersSplitted = specialCharacters.split("");
		
		for (String specialCharacter : specialCharactersSplitted) {
			assertTrue(new SpecialCharacterValidator().isValid("abc" + specialCharacter));
		}
		assertFalse(new SpecialCharacterValidator().isValid("abc"));
	}

}
