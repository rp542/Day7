package com.capgemini.com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public static int countWords(String s) {
		int count = 0;
		File file = new File("C:\\javacloud\\textfile.txt");
		try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader);) {
			String line = reader.readLine();

			while (line != null) {
				String[] parts = line.split(" ");
				for (int i = 0; i < parts.length; i++) {
					String w = parts[i];
					count++;
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return count;

	}
}
