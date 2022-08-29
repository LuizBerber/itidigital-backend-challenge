package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UppercaseValidatorTest {

	@Test
	void test() {
		assertTrue(new UppercaseValidator().isValid("ABc"));
		assertFalse(new UppercaseValidator().isValid("abc"));
	}

}
