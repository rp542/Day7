package com.capgemini.com.day7;

import java.io.Serializable;
import java.time.LocalDate;

public class MyDate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate date;
	public LocalDate getDay;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getGetDay() {
		return getDay;
	}

	public void setGetDay(LocalDate getDay) {
		this.getDay = getDay;
	}

	public MyDate() {
		super();

	}

	public MyDate(LocalDate date) {
		super();
		this.date = date;
		this.getDay = getDay;
	}

	public void MyDate1(LocalDate of) {

	}
}
