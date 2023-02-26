package com.oops.concept.inheritance;

class Home {
	int members = 10;

	void display() {
		System.out.println("home has family members");
	}
}

public class SingleInheritance extends Home {
	String Address = "Pune";

	void single() {
		System.out.println("Its and Example of single-Inheritance");
	}

	public static void main(String[] args) {
		System.out.println("-------------------Single-Inheritance------------");
		SingleInheritance si = new SingleInheritance();
		System.out.println(si.members);
		System.out.println(si.Address);
		si.display();
		si.single();
	}
}
