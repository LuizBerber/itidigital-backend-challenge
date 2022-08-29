package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RepeatedCharacterValidatorTest {

	@Test
	void test() {
		assertTrue(new RepeatedCharacterValidator().isValid("abc"));
		assertFalse(new RepeatedCharacterValidator().isValid("abca"));
	}

}
