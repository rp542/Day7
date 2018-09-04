package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.Grep;

class GrepTest {

	@Test
	void testGrepApp() {
		File file = new File("C:\\javacloud\\textfile.txt");
		assertEquals(true, Grep.stringSearch(file, "in"));

	}

}
