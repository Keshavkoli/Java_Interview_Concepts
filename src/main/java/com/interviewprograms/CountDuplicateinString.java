package com.interviewprograms;

// prints the duplicate values 
public class CountDuplicateinString {
	public static void main(String[] args) {
		String[] str = { "abc", "efg", "hij", "xyz", "abc", "xyz" };
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}
}
