package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.VowelCount;

class VowelCountTest {

	@Test
	void testVowelCount() {
		assertEquals(7, VowelCount.CountVowels("C:\\javacloud\\textfile.txt"));
	}

}
