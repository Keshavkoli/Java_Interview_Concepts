package com.general.code.pracitice;

public class FooBooExample {
	public static void main(String[] args) {
		print(100);
	}

	public static void print(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("FooBoo");
			} else if (i % 5 == 0) {
				System.out.println("Boo");
			} else {
				System.out.println(i);
			}
		}
	}
}
