package com.interviewpoint;

// Write a program that prints the numbers from 1 to 100. But for multiples of five print “Foo” instead of 
//the number and for the multiples of  seven print “Boo”. For numbers which are multiples of both five and  seven print “FooBoo"
public class FooBoo {
	public static void main(String[] args) {
		printfooBoo(100);
	}

	public static void printfooBoo(int n) {
		for (int i = 1; i <= n; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println("FooBoo");
			} else if (i % 5 == 0) {
				System.out.println("Foo");
			} else if (i % 7 == 0) {
				System.out.println("Boo");
			} else {
				System.out.println(i);
			}
		}
	}
}
