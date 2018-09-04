package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.LineCount;

class LineCountTest {

	@Test

	void testCountingLines() {

		assertEquals(3, LineCount.CountLines("C:\\javacloud\\textfile.txt"));

	}

}
