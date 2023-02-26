package com.problemwithoutsynchronization;

class Student {
	int rno;
	String name;
	static String college ="LVD";

	Student(int r, String n) {
		rno = r;
		name = n;
	}

	void Display() {
		System.out.println(rno + " " + name + " " + college);
	}

}

public class StudentExample {
	public static void main(String[] args) {
		Student s = new Student(11, "keshav");
		Student s1 = new Student(22, "kartik");
		s.Display();
		s1.Display();
	}
}
