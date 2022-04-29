package com.revature;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class KTimes {
    public static int kTimes(int N,int A[],int K) {
        
        int result = 1;
        List<Integer> abc = new LinkedList<>();
        for (int a: A){ abc.add(a); }
        Collections.sort(abc);
        Collections.reverse(abc);
        
        // if ((1<=N)&&(N<=10000)&&(1<=K)&&(K<=1000)){
        //     //This is a dummy constraint
        // } else {
        //     return result;
        // }
        for (int b: abc) {
            int a = 100;
            if (b == a) {
                System.out.println("if");
                result++; 
            } else if (b > a ) {
                System.out.println("else if");
                return b;
            }
            a = b;
        } 
        if (!abc.contains(K)) {
            return result=-1;
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
        int K = sc.nextInt();
        // OUTPUT [uncomment & modify if required]
        System.out.print(kTimes(N,A,K));
        sc.close();
    }
}