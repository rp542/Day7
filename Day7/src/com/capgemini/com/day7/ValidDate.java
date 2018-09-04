package com.capgemini.com.day7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValidDate {

	public static Object valid(String inDate, int shift) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		try {
			format.parse(inDate);
		}

		catch (ParseException e) {

			System.out.println("Date " + inDate + " is not valid according to "
					+ ((SimpleDateFormat) format).toPattern() + " pattern.");
			return false;
		}

		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(inDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		c.add(Calendar.DAY_OF_MONTH, shift);

		String newDate = format.format(c.getTime());

		System.out.println("Date after Addition: " + newDate);

		return true;
	}

}