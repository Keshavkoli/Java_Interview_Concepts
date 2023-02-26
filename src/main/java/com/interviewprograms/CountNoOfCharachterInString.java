package com.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find no of time character occur
public class CountNoOfCharachterInString {

	public static void main(String[] args) {
		String str = "Java J2EE Java Raj Java Raje Java JSP J2EE";

		HashMap<Character, Integer> hm = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		System.out.println("--------------------------------------------------");
		//Map<Character, Long> h = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Character, Long> h = str.chars().mapToObj(s -> Character.valueOf((char) s))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(h);
	}
}
