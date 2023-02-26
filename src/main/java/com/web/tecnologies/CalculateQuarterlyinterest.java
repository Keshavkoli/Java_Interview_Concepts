package com.web.tecnologies;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write a java program to calculate quarterly interest generated on the Amount
 * if the Per Annum rate of interest is 4.5%
 * 
 * Answer ==> This program prompts the user to enter an amount, and then
 * calculates the quarterly interest generated on that amount based on a per
 * annum rate of 4.5%. It first calculates the quarterly rate by dividing the
 * per annum rate by 4, and then calculates the interest by multiplying the
 * amount by the quarterly rate. It then calculates the total amount with
 * interest and prints out the results. The program uses the DecimalFormat class
 * to format the output to 2 decimal places.
 **/
public class CalculateQuarterlyinterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");

		System.out.print("Enter the amount: ");
		double amount = scanner.nextDouble();

		double perAnnumRate = 0.045;
		double quarterlyRate = perAnnumRate / 4;
		double interest = amount * quarterlyRate;
		double total = amount + interest;

		System.out.println("Quarterly interest generated on " + decimalFormat.format(amount) + " at 4.5% per annum is "
				+ decimalFormat.format(interest));
		System.out.println("Total amount with interest is: " + decimalFormat.format(total));
	}
}
