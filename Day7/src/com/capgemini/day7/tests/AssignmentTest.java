package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day7.Assignment;

class AssignmentTest {

	@Test
	void test() {
		Assignment a1 = new Assignment("Dbms", LocalDate.of(2018, 9, 5));
		Assignment a2 = new Assignment("C", LocalDate.of(2018, 9, 8));
		Assignment a3 = new Assignment("Java", LocalDate.of(2018, 9, 6));
		Assignment a4 = new Assignment("phython", LocalDate.of(2018, 9, 9));

		assertEquals(true, Assignment.adding(a1));
		assertEquals(true, Assignment.adding(a2));
		assertEquals(true, Assignment.adding(a3));
		assertEquals(true, Assignment.adding(a4));

		assertEquals(true, Assignment.remove(a4));

		Assignment.show();
		System.out.println("\n");

		assertEquals(a1, Assignment.search());
	}

}