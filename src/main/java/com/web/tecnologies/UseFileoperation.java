package com.web.tecnologies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write string content into the file. Use File operation. Take String content =
 * “abc”
 **/
public class UseFileoperation {
	public static void main(String[] args) {
		String content = "abc";
		File file = new File("example.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(content);
			fileWriter.close();
			System.out.println("File written successfully!");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
