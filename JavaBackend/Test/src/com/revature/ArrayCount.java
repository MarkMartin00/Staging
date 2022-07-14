package com.revature;

import java.awt.desktop.AboutHandler;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayCount {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		gainLetters();
		
	}

	private static void gainLetters() {
		
		List<String> abcList = new ArrayList<String>(5);
		for (int i = 0; i < 5; i++) {
			String abc = scan.nextLine();
			abcList.add(i, abc);
			System.out.println("new list: " + abcList.get(i) + " and size of "+ abcList.size());
		}
		
		System.out.println("What letter would you like to find?");
		String a = scan.next();
		Integer count = 0;
		findLetter(abcList, a.toUpperCase(), count);
	}

	private static void findLetter(List<String> abcList, String a, Integer count) {
		
		
		for (int i = 0; i < 5; i++) {
			String blimp = abcList.get(i);

			for (int x=1; x<= blimp.length()-1; x++) {

				if (Character.toString(blimp.charAt(x)).equals(a)) {
					count++;
				}
			}
			
		}
		
		System.out.println("Final count is: "+ count);
			
	}
	
	
	
	
//	create a function that counts the number of times a particular letter shows up in the word search.
//	Examples
//	<code>letterCounter
//	([ ["D", "E", "Y", "H", "A", "D"],
//	["C", "B", "Z", "Y", "J", "K"],
//	["D", "B", "C", "A", "M", "N"],
//	["F", "G", "G", "R", "S", "R"],
//	["V", "X", "H", "A", "S", "S"]], "D") -> 3// "D" shows up 3 times: twice in the first row, once in the third row

//	letterCounter
//	([ ["D", "E", "Y", "H", "A", "D"],
//	["C", "B", "Z", "Y", "J", "K"],
//	["D", "B", "C", "A", "M", "N"],
//	["F", "G", "G", "R", "S", "R"],
//	["V", "X", "H", "A", "S", "S"]], "H") -> 2
	
	
}
