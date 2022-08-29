package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MinimumNumberOfCharactersValidatorTest {

	@Test
	void test() {
		assertTrue(new MinimumNumberOfCharactersValidator().isValid("abc123%^&"));
		assertFalse(new MinimumNumberOfCharactersValidator().isValid("abc123%^"));
	}

}
