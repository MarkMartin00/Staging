package com.revature;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class DistinctPrime {
    public static int distinctPrime(int N, int A[]) {
        
        LinkedList<Integer> abc = new LinkedList<Integer>();
        int result=0;
        Set<Integer> abcd = new HashSet<>();
        if ((1<=N)&&(N<=500)&&(2<=A[N])&&(A[N]<=10000)){
            for (int j=0; j <= A.length; j++)
                for (int i = 1; i <= j; i++) {
                    while (j%i == 0) {
                        abc.add(j);
                    }
                    
                }
            abc.descendingIterator();
            System.out.println(abc);    
        }
        
        return result;
    }
    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int A [] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        // OUTPUT [uncomment & modify if required]
        distinctPrime(N,A);
        sc.close();
    }
}