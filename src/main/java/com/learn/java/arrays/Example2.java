package com.learn.java.arrays;

//Multidimensional Array in Java
//dataType[][] arrayRefVar; (or)  
//dataType [][]arrayRefVar; (or)  
//dataType arrayRefVar[][]; (or)  
//dataType []arrayRefVar[];   
public class Example2 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
