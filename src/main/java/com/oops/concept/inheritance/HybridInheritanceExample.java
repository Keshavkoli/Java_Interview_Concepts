package com.oops.concept.inheritance;

//HERE Same method is not allowed in main to print and same variables
class A {
	public void disp() {
		System.out.println("A");
	}

	public void dispA() {
		System.out.println("A");
	}
}

class B extends A {
	public void disp() {
		System.out.println("B");
	}

	public void dispB() {
		System.out.println("B");
	}
}

class C extends A {
	public void disp() {
		System.out.println("C");
	}

	public void dispC() {
		System.out.println("C");
	}

}

public class HybridInheritanceExample extends B {
	public void dispD() {
		System.out.println("HybridInheritanceExample");
	}

	public static void main(String[] args) {
		System.out.println("-------------------Hybrid-Inheritance------------");
		HybridInheritanceExample hie = new HybridInheritanceExample();
		hie.dispA();
	}
}
