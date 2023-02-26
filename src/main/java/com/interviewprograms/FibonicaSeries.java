package com.interviewprograms;

public class FibonicaSeries {
	public static void main(String[] args) {
		int firstnum = 0, secoundnum = 1;
		int num = 10;
		for (int i = 0; i < num; i++) {
			System.out.println(firstnum);
			int nextterm = firstnum + secoundnum;
			firstnum = secoundnum;
			secoundnum = nextterm;
		}
		System.out.println("-------------div--------");
	}
}
