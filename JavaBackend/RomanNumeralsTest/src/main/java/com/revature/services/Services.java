package com.revature.services;

import java.util.List;

public class Services {
	
	static int total = 0;
	
	private static int romanNumeralConversion(List<String> romans) {
		for (int i=0; i <=romans.size(); i++) {
			
			int result1 = romanToNumber(String.valueOf(i)); 
			int result2 = 0;
			if (i+1 <= romans.size()) {
			result2 = romanToNumber(String.valueOf(i+1));
			}
			
			if (result1 > result2) {
				total += result1;
			} else {
				total += result2 - result1;
				i++;
			}
			
		} 
		return 0;
		
	}
	
	private static int romanToNumber(String charX) {
		if (charX == "I") {
			return 1;
		}
		if (charX == "V") {
			return 5;
		}
		if (charX == "X") {
			return 10;
		}
		return 0;
	}
	
	public static int getRomanToNumber(List<String> romans) {
		int x = romanNumeralConversion(romans);
		
		return x;
	}
}
