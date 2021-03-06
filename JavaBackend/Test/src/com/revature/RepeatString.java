package com.revature;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
	public static int repeatString(List<String> abc) {
	
		int result = 1;
		int testNumberForReturn = 0;
		List<String> finish = new LinkedList<String>();
		
		//I am returning a collection list and working with collections as I don't need to worry 
		//about fulfilling an actual test case.
		
		for (int i = 0; i < abc.size(); i++) {
				String temp = "xyz";
				
				try {
					temp = abc.get(i + 1);
				} catch (IndexOutOfBoundsException xyz) {
					
				}
				if (temp.equalsIgnoreCase(abc.get(i))) {
					result++;
					testNumberForReturn++;
						
				} else if (!temp.equalsIgnoreCase(abc.get(i))){
					finish.add(abc.get(i));
					finish.add(Integer.toString(result));
					result = 1;
				} 
		}
		if (testNumberForReturn > 0) {
			System.out.println("Finished: " + "\n" + finish);
		} else {
			System.out.println("Instructed to return original string when the length would be the same. Since there are no duplicates "
					+ "in a row we can assume: " + "\n" + abc);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How big is the array?");
		int T = sc.nextInt();
		List<String> abc = new ArrayList<String>(T);
		
		System.out.println("Let's list " + T +" indexes.");
		for (int i = 1; i <= T; i++) {
			System.out.println("What's at index "+ i);
			abc.add(sc.next());
		}
		
		sc.close();

		repeatString(abc);
	}
}