package com.oops.concept.inheritance;

// when we have the same variables with same name in another class it will not allow in main class to print the value
//methods with the same name is also not allowed in main class
class Dog {
	String dog = "dog food";
	int calories = 101;

	void eat() {
		System.out.println("dog  food");
	}

	void dogeats() {
		System.out.println("dog eats food");
	}
}

class Cat extends Dog {
	String cat = "cat food";
	int calories = 90;

	void eat() {
		System.out.println("cat food");
	}

	void Cateats() {
		System.out.println("Cat eats food");
	}
}

class bird extends Cat {
	String bird = "bird food";
	int calories = 80;

	void eat() {
		System.out.println("bird food");
	}

	void birdeats() {
		System.out.println("bird eats food");
	}
}

public class MultilevelInheritanceExample extends bird {
	public static void main(String[] args) {
		System.out.println("-------------------Multilevel-Inheritance------------");
		MultilevelInheritanceExample mi = new MultilevelInheritanceExample();
		System.out.println(mi.dog);
		System.out.println(mi.cat);
		System.out.println(mi.bird);
		mi.dogeats();
		mi.Cateats();
		mi.birdeats();
	}

}
