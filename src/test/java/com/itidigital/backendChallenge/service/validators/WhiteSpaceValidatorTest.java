package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WhiteSpaceValidatorTest {

	@Test
	void test() {
		assertTrue(new WhiteSpaceValidator().isValid("abc"));
		assertFalse(new WhiteSpaceValidator().isValid("abc "));
	}

}
