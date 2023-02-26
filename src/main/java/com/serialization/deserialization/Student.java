package com.serialization.deserialization;

import java.io.Serializable;

//Serializable is a marker interface (has no data member and method). 
//It is used to "mark" Java classes so that the objects of these classes may get a certain capability. 
//The Cloneable and Remote are also marker interfaces.
public class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}