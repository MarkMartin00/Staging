package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class RightShift
{
  public static int rightShift(String A, int K)
  {
	ArrayList<String> delta = new ArrayList<>();
    //this is default OUTPUT. You can change it.
    int result = -404;
    String[] bob = A.split("");
    System.out.println(bob);
    for (String b: bob) {
    	delta.add(b);
    }
    if ((1 <= K) && (K <= 100)) {
           String b = delta.remove(0);
            delta.add(K, b);
            System.out.println(delta);
    }

    
      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    String A = sc.next();
    int K = sc.nextInt ();

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(rightShift(A,K));
  }
}
