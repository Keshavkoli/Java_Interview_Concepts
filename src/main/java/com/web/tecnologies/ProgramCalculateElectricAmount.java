package com.web.tecnologies;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Write a java program to calculate Electric Amount for that month based on the
 * User input date. For the 1-10th day of the month no penalty. On the 11th day
 * onwards delay for each day penalty will be 1% of the original amount. The
 * original amount is 1000 rs
 * 
 * Answer => This program prompts the user to enter a date and calculates the
 * electric bill amount for that month. It assumes the original amount to be
 * 1000 Rs. It checks if the payment date is after the 10th of the month. If it
 * is, it calculates the number of days late by subtracting the bill date from
 * the payment date, and then calculates the penalty as 1% of the original
 * amount for each day late. It then adds the penalty to the original amount to
 * get the total amount, and prints the results.
 **/
public class ProgramCalculateElectricAmount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			System.out.print("Enter date of bill payment (dd-mm-yyyy): ");
			String paymentDate = scanner.nextLine();
			Calendar payment = Calendar.getInstance();
			payment.setTime(dateFormat.parse(paymentDate));

			Calendar billDate = Calendar.getInstance();
			billDate.set(Calendar.MONTH, payment.get(Calendar.MONTH));
			billDate.set(Calendar.YEAR, payment.get(Calendar.YEAR));
			billDate.set(Calendar.DATE, 10);
			double originalAmount = 1000;
			double penalty = 0;
			if (payment.after(billDate)) {
				int daysLate = (int) ((payment.getTimeInMillis() - billDate.getTimeInMillis()) / (1000 * 60 * 60 * 24));
				penalty = originalAmount * (daysLate * 0.01);
			}
			double totalAmount = originalAmount + penalty;

			System.out.println("Original amount: Rs." + originalAmount);
			System.out.println("Penalty: Rs." + penalty);
			System.out.println("Total amount: Rs." + totalAmount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
