package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.DateDisplay;

class DateDisplayTest {

	@Test
	void testWeekDay() throws IOException {

		assertEquals(true, DateDisplay.displayWeekDay("EEEE,MMMM dd,YYYY"));

	}

}