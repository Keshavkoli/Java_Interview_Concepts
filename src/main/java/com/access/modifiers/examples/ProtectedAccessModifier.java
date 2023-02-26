package com.access.modifiers.examples;

//The access level of a protected modifier is within the package and outside the package through child class. 
//If you do not make the child class, it cannot be accessed from outside the package.
//The protected access modifier is accessible within package and outside the package but through inheritance only.



public class ProtectedAccessModifier {
	public static void main(String[] args) {
		ProtectedClass p = new ProtectedClass();
		p.drink();
	}
}
