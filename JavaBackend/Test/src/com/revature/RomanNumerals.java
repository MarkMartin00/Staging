package com.revature;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.revature.services.Service;

public class RomanNumerals {
	
	public static void main(String[] args) {
		
		romanNumerals();
	}

	private static void romanNumerals() {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Put in your roman numeral you want converted.");
		String x = scan1.next().toUpperCase();
		String[] bob = x.split(""); 
		romanCheck(bob);
		
	}

	private static int romanCheck(String[] bob) {
		List<String> romans = new LinkedList<>();
		for (String a: bob) {
			romans.add(a);
		}
		System.out.println(romans);
		
		//build constraint for input
		
		int result = Service.getRomanToNumber(romans);
		System.out.println("Total numeric value for your roman numerals is: " + result);
		return result;
		
	}

}
