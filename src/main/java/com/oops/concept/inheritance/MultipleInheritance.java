package com.oops.concept.inheritance;

class Parent1 {
	void fun() {
		System.out.println("Parent1");
	}
}

class Parent2 {
	void fun() {
		System.out.println("Parent2");
	}
}

//Trying to be child of both the classes // Parent1,Parent2 is not allowed
// trying to access 2 class in 1 class is not allowed thats way multiple inheritance is not supported in java
//public class MultipleInheritance extends Parent1, Parent2 not allowed
public class MultipleInheritance extends Parent2 {
	public static void main(String[] args) {
		System.out.println("-------------------Multilevel-Inheritance------------");
	}

}
