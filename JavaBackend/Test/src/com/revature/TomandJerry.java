package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class TomandJerry
{
  public static int tomAndJerry(int N, int T, int J, int[] A)
  {

    List<Integer> tom = new LinkedList<>();
    List<Integer> jerry = new LinkedList<>();
    int totalJerry = 0; 
    int currentTotalJerry = 0;
    int numberOfToysJerry = 0;
    int totalTom = 0; 
    int currentTotalTom = 0;
    int numberOfToysTom = 0;
    
    //A Toys     //N Cost       //T Tom     //J Jerry
      for (int a : A) {
        if (a%2 == 0) {
          tom.add(a);
        } else {
          jerry.add(a);
        }
        Collections.sort(tom); 
        Collections.sort(jerry);
        System.out.println(tom);
        System.out.println(jerry);
      }
      
      for (int i = 0; i <= tom.size(); i++) {
        if (currentTotalTom < T) {
          currentTotalTom = totalTom + tom.indexOf(i);
        } else {
          currentTotalTom = totalTom; numberOfToysTom = i;
        }
      }
      
      for (int i=0; i <= jerry.size(); i++) {
        if (currentTotalJerry < J) {
          currentTotalJerry = totalJerry + jerry.indexOf(i);
        } else {
          currentTotalJerry = totalJerry; numberOfToysJerry = i;
        }
      }
  
      return(numberOfToysTom + numberOfToysJerry);
  }
  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();
    int T = sc.nextInt ();
    int J = sc.nextInt ();

    int[] A = new int[N];
    for (int i = 0; i < N; i++)
    {
        A[i] = sc.nextInt ();
    }
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(tomAndJerry(N,T,J,A));
  }
}