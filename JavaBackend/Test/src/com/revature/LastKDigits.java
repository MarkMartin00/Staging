package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class LastKDigits
{
  public static int lastKdigits(int A, int B, int K)
  {

    //this is default OUTPUT. You can change it.
    int result = -404;
    int total = 1;
    //Ab = array
    //K = last digits needed to print
    if ((1<=A) && (A<=1000) && (1<=B) && (B<=10000) && (1<=K) && (K<=8)) {
      for (int i = 0; i <= B; i++) {
        total *= A;
      }
    }
    System.out.println(total);
    String bob = Integer.toString(total);
    String[] abc = bob.split("");
    for (int a =0; a <= K; a++) {
    	int b = K - a;
    	System.out.println(abc[abc.length - b]);
    }
    

      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int A = sc.nextInt ();
    int B = sc.nextInt ();
    int K = sc.nextInt ();

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    lastKdigits(A,B,K);
  }
}