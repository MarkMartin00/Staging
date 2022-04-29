package com.revature;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class FindBeautifulPairs {
    public static int findBeautifulPairs(int N, int A[]) {
        // this is default OUTPUT. You can change it.
        int result=0;
        
        //N = Integers, length of array
        //A = Array

        if((1 <=N)&&(N<=100)){
            for (int i = 0; i < A.length; i++) {
                for (int j=0; j< A.length; j++) {
                    int x = (A[i] - A[j]);
                    Math.abs(x);
                    if ((x > 1) && (x %2 == 0)) {
                        result++;
                    } 
                }
            }
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
        System.out.print(findBeautifulPairs(N,A));
        sc.close();
    }
}