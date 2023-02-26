package com.web.tecnologies;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Write a java program to take the Start Date and End Date from the User.
 * Between the start and end dates, display all the dates which are Monday,
 * Thursday, and Friday
 * 
 * Answer ==>
 * This program prompts the user to enter a start date and an end date in
 * the format "dd-mm-yyyy", and then uses a while loop to iterate through all
 * the dates between the start and end dates. Within the while loop, it uses the
 * Calendar.DAY_OF_WEEK field to check if the current date is a Monday, Thursday
 * or Friday. If it is, the program prints the date.
 **/
public class ProgramtotaketheStartDateandEndDatefromtheUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// used scanner class to take input from the user 
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		// used the simple dataformat to allow the date format

		try {
			System.out.print("Enter start date (dd-mm-yyyy): ");
			String startDate = scanner.nextLine();
			Calendar start = Calendar.getInstance();
			start.setTime(dateFormat.parse(startDate));

			System.out.print("Enter end date (dd-mm-yyyy): ");
			String endDate = scanner.nextLine();
			Calendar end = Calendar.getInstance();
			end.setTime(dateFormat.parse(endDate));

			System.out.println("Dates between " + dateFormat.format(start.getTime()) + " and "
					+ dateFormat.format(end.getTime()) + " which are Monday, Thursday, or Friday:");
			Calendar current = start;
			while (!current.after(end)) {
				int dayOfWeek = current.get(Calendar.DAY_OF_WEEK);
				if (dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.THURSDAY || dayOfWeek == Calendar.FRIDAY) {
					System.out.println(dateFormat.format(current.getTime()));
				}
				current.add(Calendar.DATE, 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
