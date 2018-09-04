package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileHandling {

	@Test
	void testExistence() {
		File file = new File("C:\\javacloud");
		assertEquals(true, file.exists());
	}

}
