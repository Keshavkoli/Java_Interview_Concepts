package com.general.code.pracitice;

import java.util.HashSet;

public class DuplicateArrayHashset {
	public static void main(String[] args) {
		String str[] = { "abc", "xyz", "abc", "xyz" };
		HashSet<String> hs = new HashSet<String>();
		for (String count : str) {
			if (!hs.add(count)) {
				System.out.println(count);
			}
		}
	}
}
