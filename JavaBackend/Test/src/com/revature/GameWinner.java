package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class GameWinner
{
  public static int gameWinner(int N,int[] A, int[] B)
  {
    int a = 0; // A winner
    int b = 0; // B winner
    //this is default OUTPUT. You can change it.
    int result = -404;
    if ((1<=N)&&(N<=100000)) {
      for (int i = 0; i <= A.length-1; i++) {
    	  System.out.println(i);
        if (A[i] < B[i]) {
          b++;
        } else if (A[i] > B[i]) {
          a++;
        } else if (A[i] == B[i]) {
          a++; b++;
        } else {
          System.out.println("You're missing the if statement.");
        }
      }
      if (a > b) {
        System.out.println("A "+ a);
      } else if (a < b) {
        System.out.println("B "+ b);
      } else if (a == b) {
        System.out.println("tied");
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
    
    int[] B = new int[N];
    for (int i = 0; i < N; i++)
    {
        B[i] = sc.nextInt ();
    }
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    gameWinner(N,A,B);
  }
}