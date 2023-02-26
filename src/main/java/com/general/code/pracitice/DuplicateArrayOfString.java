package com.general.code.pracitice;

public class DuplicateArrayOfString {
	public static void main(String[] args) {
		String str[] = { "abc", "xyz", "pqr", "xyz", "abc" };
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}
}
