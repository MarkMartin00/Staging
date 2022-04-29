package com.revature;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Solution
{
  public static long numberPlay(long A, long B)
  {

    //this is default OUTPUT. You can change it.
    long result;
    ArrayList<Long> martha = new ArrayList<>();
    ArrayList<Long> removes = new ArrayList<>();
    if (((2 <= A) && (A <= 10000000)) && ((1 <= B) && (B <= 10000000))) {
    	
      for (int i = 0; i <=100; i++) {
        martha.add((long) i);
      }
      
      martha.stream()
      .filter(n -> n%A  == 0)
      .forEach(item -> {
    	  removes.add(item);
      });
      System.out.println("The built Array is removes: " + "\n"+  removes);
      martha.removeAll(removes);
    	 
      System.out.println("The final Array is martha: " + "\n"+ martha);
    }
    return result = martha.get((int) B);

  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    System.out.println("Scan A and B");
    long A = sc.nextInt ();
    long B = sc.nextInt ();

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(numberPlay(A,B));
  }
}