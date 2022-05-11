package com.revature;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MagicIndexTransform {
	public static int multiplyTimes(int n, List<Integer> arr) {
        
        int result = -404;
        
//      1) Magic Index: A magic index in an array A [ 0 ... n -1] is defined 
//			to be an index such that A[i] = i. Given a sorted array of distinct integers, 
//			write a method to find a magic index, if one exists, in array A.
//        	Follow up: What if the values are not distinct?
        SortedSet<Integer> distinct = new TreeSet<>();
        SortedSet<Integer> sub = new TreeSet<>();
        for (int r: arr) {
        	System.out.println(r);
        	distinct.add(r);
        }
        System.out.println("All your numbers are: "+ "\n" + distinct);
        
//      2) Power Set: Write a method to return all subsets of a set.
        sub = distinct.subSet(1, 10000);
        System.out.println("The subArray* of Real NUmbers is/are: "+ "\n" + sub);
        
        
        int thisTotal = 0;
        for (int b: sub) {
        	if(thisTotal==0) {
        		thisTotal = b;
        	} else {
        		thisTotal = multiplyList(thisTotal, b);
        	}
        }
        System.out.println("The total is: " + thisTotal);
        
        return result;
    }
	
	private static int multiplyList(int thisTotal, int b) {
		int result = thisTotal;
//      3) Recursive Multiply: Write a recursive function to multiply two positive 
//			integers without using the *operator. You can use addition, subtraction, 
//			and bit shifting, but you should minimize the number of those operations.
		if (thisTotal==1) {
			return b;
		} else if (b==1) {
			return thisTotal;
		}
		for (int i=1; i < b; i++) {
			result += thisTotal;
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many integers will you be multiplying?");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Integer " + (i+1) +".");
			int num = scan.nextInt();
			arr.add(num);

		}	
		scan.close();
		
		Collections.sort(arr);
		
		multiplyTimes(n, arr);
	}
}