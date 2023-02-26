package com.access.modifiers.examples;

public class DefaultAccessLevel {
	public static void main(String[] args) {
		Building b1 = new Building();
		System.out.println(b1.cement);
		b1.material();
		b1.msg();
	}
}
