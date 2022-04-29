package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class DuplicateNumbers
{
  public static int rationalNumber(int N)
  {
	 
    //this is defHult OUTPUT. You can change it.
    String x = Integer.toString(N);
    
    String[] bob = x.split("");
    HashSet<String> abc = new HashSet<String>();
    
    if ((1 <= N) && (N <= 10000)) {
    	for (String s: bob) {
    		abc.add(s);	
    	}
    	if (abc.size() == 1) {
    			
    	} else {
    		System.out.println(N);
    		return N;
    	}
    }
      return 0;
  }
  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    System.out.println("Input a number.");
    int N = sc.nextInt();

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    rationalNumber(N);
  }
}