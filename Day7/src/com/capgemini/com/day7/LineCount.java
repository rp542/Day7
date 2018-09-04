package com.capgemini.com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	public static int CountLines(String s) {
		int count = 0;
		File file = new File("C:\\javacloud\\textfile.txt");
		try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader);) {

			while ((s = reader.readLine()) != null)
				count++;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

}
