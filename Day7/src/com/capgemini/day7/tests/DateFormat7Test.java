package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.DateFormat7;

class DateFormat7Test {

	@Test
	void testDateFormat() throws ParseException {

		assertEquals("12/12/2010", DateFormat7.dateFormat("12122010"));
		assertEquals("10 December, 2010", DateFormat7.dateFormat07("10122010"));

	}

}