package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.CheckMagic;

class CheckMagicTest {

	@Test
	void test() {
		assertEquals(true, CheckMagic.checkMagic(5, 5, 25));
		assertEquals(false, CheckMagic.checkMagic(4, 4, 20));
	}

}