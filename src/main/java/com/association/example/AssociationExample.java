package com.association.example;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Keshav");

		Mobile number1 = new Mobile();
		number1.setMobile_no("7744994435");
		Mobile number2 = new Mobile();
		number2.setMobile_no("9983276357");

		List<Mobile> numberList = new ArrayList<Mobile>();
		numberList.add(number1);
		numberList.add(number2);
		person.setNumbers(numberList);
		System.out.println(person.getNumbers() + " are mobile numbers of the person " + person.getName());
	}
}
