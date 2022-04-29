package com.revature.services;

import java.util.List;

public class Service {
	
	static int total = 0;
	
	private static int romanNumeralConversion(List<String> romans) {
		for (int i=0; i < romans.size(); i++) {
			
			int result1 = romanToNumber(romans.get(i)); 
			int result2 = 0;
			if (i+1 < romans.size()) {
			result2 = romanToNumber(romans.get(i+1));
			}
			
			if (result1 >= result2) {
				total += total + result1;
				System.out.println(total + " result 2");
			} else {
				total += total + result2 - result1;
				System.out.println(total + " result 2 - result 1");
				i++;
			}
		} 
		return total;
	}
	
	private static int romanToNumber(String x) {
		System.out.println(x);
		if (x == "I") {
			System.out.println("+1");
			return 1;
		} else if (x == "V") {
			System.out.println("+5");
			return 5;
		} else if (x == "X") {
			System.out.println("+10");
			return 10;
		} else {
			return -404;
		}
	}
	
	public static int getRomanToNumber(List<String> romans) {
		int x = romanNumeralConversion(romans);
		
		return x;
	}
}
