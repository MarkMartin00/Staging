package com.revature.driver;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.revature.services.Services;

public class RomanNumerals {
	
	public static void main(String[] args) {
		
		romanNumerals();
	}

	private static void romanNumerals() {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Put in your roman numeral you want converted.");
		String x = scan1.next().toUpperCase();
		String[] bob = x.split(x + ""); 
		System.out.println(bob);
		romanCheck(bob);
		
	}

	private static int romanCheck(String[] bob) {
		List<String> romans = new LinkedList<>();
		for (String a: bob) {
			System.out.println(a);
		}
		
		
		//build constraint for input
		for (int i= 0; i <= romans.size(); i++) {
			System.out.println(romans.get(i));
			if ((romans.get(i) == "I") || (romans.get(i) == "V") ||
					(romans.get(i) == "X")) {
				//empty space in case i need another check for later. 
			} else {
				System.out.println("Please only use roman numerals.");
				romanNumerals();
			}
		}
		
		int result = Services.getRomanToNumber(romans);
		System.out.println("Total numeric value for your roman numerals is: " + result);
		return result;
	}

}
