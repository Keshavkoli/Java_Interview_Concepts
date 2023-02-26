package com.oops.concept.inheritance;

class Employee {
	float salary = 40000;
}

public class InheritanceExample extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		InheritanceExample he = new InheritanceExample();
		System.out.println("salary==>" + he.salary);
		System.out.println("bonus==>" + he.bonus);
		
		
	}
}
