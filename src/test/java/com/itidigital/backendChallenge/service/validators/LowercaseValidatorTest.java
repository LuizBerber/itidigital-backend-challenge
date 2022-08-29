package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LowercaseValidatorTest {

	@Test
	void test() {
		assertTrue(new LowercaseValidator().isValid("ABc"));
		assertFalse(new LowercaseValidator().isValid("ABC"));
	}

}
