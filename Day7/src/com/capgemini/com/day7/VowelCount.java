package com.capgemini.com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelCount {
	public static int CountVowels(String string) {
		Set<Character> vowel = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		int vowels = 0;

		int count = 0;
		String s;
		File inputFile = new File("C:\\javacloud\\textfile.txt");

		try (FileReader fr = new FileReader(inputFile); BufferedReader reader = new BufferedReader(fr);) {
			s = reader.readLine();
			while (s != null) {
				for (char ch : s.toCharArray()) {
					if (Character.isAlphabetic(ch)) {
						ch = Character.toUpperCase(ch);
						if (vowel.contains(ch))
							vowels++;

					}

				}

				s = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vowels;
	}
}
