package com.learn.java.arrays;

public class TestArrayCopyDemo {
	public static void main(String[] args) {

		char[] copyfrom = { 'k', 'e', 's', 'h', 'a', 'v' };
		char[] copyto = new char[4];
		System.arraycopy(copyfrom, 1, copyto, 0, 4);
		System.out.println(String.valueOf(copyto));
	}
}
