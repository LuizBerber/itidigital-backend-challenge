package com.itidigital.backendChallenge.service.validators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumericCharacterValidatorTest {

	@Test
	void test() {
		assertTrue(new NumericCharacterValidator().isValid("abc1"));
		assertFalse(new NumericCharacterValidator().isValid("abcd"));
	}

}
