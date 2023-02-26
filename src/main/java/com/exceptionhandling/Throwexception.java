package com.exceptionhandling;

public class Throwexception {
	public static void validate(int age) {
		if (age < 18) {
			System.out.println("Not valid");
		} else {
			System.out.println("Fit to vote");
		}
	}

	public static void main(String[] args) {
		validate(15);
	}
}
