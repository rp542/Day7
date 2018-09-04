package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.RandomIntegers;

class RandomIntegersTest {

	@Test
	void testCheckrandomInntegers() {
		File file = new File("C:\\\\javacloud\\\\priyanka.txt");
		assertEquals(1, RandomIntegers.random(file));
	}

}
