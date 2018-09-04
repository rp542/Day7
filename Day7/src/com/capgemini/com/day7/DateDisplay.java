package com.capgemini.com.day7;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDisplay {

	public static boolean displayWeekDay(String string) throws IOException {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat();
		String strDate = formatter.format(date);

		return true;
	}

}