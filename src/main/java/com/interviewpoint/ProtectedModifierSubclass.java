package com.interviewpoint;

import com.access.modifiers.examples.ProtectedClass;

public class ProtectedModifierSubclass extends ProtectedClass {
	public static void main(String[] args) {
		ProtectedModifierSubclass p1 = new ProtectedModifierSubclass();
		p1.drink();

		ProtectedClass pc = new ProtectedClass();
		// pc.drink compile time error

	}
}
