package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.WordCount;

class WordCountTest {

	@Test
	void testcheckWords() {
		assertEquals(4, WordCount.countWords("C:\\javacloud\\textfile.txt"));

	}

}
