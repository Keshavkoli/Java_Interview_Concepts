package com.general.code.pracitice;

public class DemoExample {
	public static void main(String[] args) {
		int firstterm = 0, secoundterm = 1;
		int n = 10;
		System.out.println("Fibonica series");
		for (int i = 1; i <= n; i++) {
			int nextterm = firstterm + secoundterm;
			firstterm = secoundterm;
			secoundterm = nextterm;
			System.out.println(firstterm);

		}
	}
}
