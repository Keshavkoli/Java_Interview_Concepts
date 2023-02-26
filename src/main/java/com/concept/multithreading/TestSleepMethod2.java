package com.concept.multithreading;
// two sleep method  1)sleep(long mls) and the another 2)sleep(long mls, int n)
public class TestSleepMethod2 {
	public static void main(String[] args) {
		try {
			for (int i = 1; i < 5; i++) {
				Thread.sleep(100);
//				Thread.sleep(100, 1000);
				// Thread.sleep(-100); Negative numbers are not allowed it will throws the
				// exception IllegalArguementException when the time for sleeping is negative.
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception handled " + e);
		}
	}
}
