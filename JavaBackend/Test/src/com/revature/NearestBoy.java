package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class NearestBoy
{
  public static int nearestBoy(int N,int[] A)
  {

    //this is default OUTPUT. You can change it.
    int result = -404;
    int minimum = 2;
    int b = 0; int c = 0; int d = 0;

    //let's use the Collections interface
    List<Integer> abc = new LinkedList<>();
    //add all of the String[] so we can use their methods
    for (int a: A){ abc.add(a); } //ading it to the abc list

    //This list is for printing later
    List<Integer> print = new ArrayList<>();

    //build the constraint
    if (!((1<=N)&&(N<=1000000))) {
      return 0;
    }

    for (int i=0; i < abc.size(); i++) {
      for (int a: abc){
        if (abc.get(i) >= a) {

        } else if ((abc.get(i) < a)&&(abc.indexOf(a) - abc.indexOf(i) <=2)) {
          print.add(2);
        } else if ((abc.get(i) < a)&&(abc.indexOf(a) - abc.indexOf(i) > 2)) {
          print.add(abc.indexOf(a) - abc.indexOf(i));
        } else if (abc.indexOf(i)+1 == abc.size()) {
          print.add(-1);
        }
        
        System.out.println(print);
      }

    }

      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();

    int[] A = new int[N];
    for (int i = 0; i < N; i++)
    {
        A[i] = sc.nextInt ();
    }
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    nearestBoy(N,A);
  }
}