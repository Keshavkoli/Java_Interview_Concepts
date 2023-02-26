package com.oops.concept.inheritance;

class Animal {
	String ani = "Animal";

	void eat() {
		System.out.println("eating...");
	}
}

class Zoo extends Animal {
	String zoo = "Zoo";

	void bark() {
		System.out.println("barking...");
	}
}

class ZooPark extends Animal {
	String zoopark = "Zoopark";

	void zoopark() {
		System.out.println("barking...");
	}
}

public class HierarchicalInheritance extends Animal {
	public static void main(String[] args) {
		System.out.println("-------------------Hierarchical-Inheritance------------");
		HierarchicalInheritance hi = new HierarchicalInheritance();
		System.out.println(hi.ani);
		hi.eat();
	}
}
