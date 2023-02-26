package com.datetime.java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SQLDateExample {
	public static void main(String[] args) {
		System.out.println("------------GetCurrentDateAndTime------------- ");
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println(date);
		System.out.println("------------Another-way------------- ");
		System.out.println("------------GetCurrentDateAndTime------------- ");
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date1 = new GregorianCalendar();
		day = date1.get(Calendar.DAY_OF_MONTH);
		month = date1.get(Calendar.MONTH);
		year = date1.get(Calendar.YEAR);
		second = date1.get(Calendar.SECOND);
		minute = date1.get(Calendar.MINUTE);
		hour = date1.get(Calendar.HOUR);
		System.out.println("Current date is " + day + "/" + (month + 1) + "/" + year);
		System.out.println("Current time is " + hour + " : " + minute + " : " + second);
	}
}
