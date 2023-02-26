package com.learn.java.arrays;

//Syntax to Declare an Array in Java
//dataType[] arr; (or)  
//dataType []arr; (or)  
//dataType arr[];  
//its the Example of Single Dimensional Array in Java
public class Example1 {
	public static void main(String[] args) {
		int[] a = new int[5];//
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);

		int[] b = new int[5];//
		b[0] = 10;// initialization
		b[1] = 20;
		b[2] = 70;
		b[3] = 40;
		b[4] = 50;
		System.out.println("---------------------------");
		for (int j = 0; j < b.length; j++)// length is the property of array
			System.out.println(b[j]);

		int c[] = new int[5];//
		c[0] = 10;// initialization
		c[1] = 20;
		c[2] = 70;
		c[3] = 40;
		c[4] = 50;
		System.out.println("---------------------------");
		for (int k = 0; k < c.length; k++)// length is the property of array
			System.out.println(c[k]);
		System.out.println("-------------");
		
		
		int d[] = { 33, 3, 4, 5 ,9};// declaration, instantiation and initialization
		// printing array
		for (int l = 0; l <=d.length; l++)// length is the property of array
			System.out.println(d[l]);
	}
}
