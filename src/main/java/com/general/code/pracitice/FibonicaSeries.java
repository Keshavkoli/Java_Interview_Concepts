package com.general.code.pracitice;

public class FibonicaSeries {
	public static void main(String[] args) {
		int first = 0, secound = 1;
		int temp;
		for (int i = 0; i <= 10; i++) {
			System.out.println(first);
			temp = first + secound;
			first = secound;
			secound = temp;

		}

	}

}
