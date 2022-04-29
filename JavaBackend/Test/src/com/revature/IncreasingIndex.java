package com.revature;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class IncreasingIndex {
    public static int increasingIndex(int N, int A[]) {
        
        int result = 0;
        int total = 0;

        //create a collections and add list.
        List<Integer> abc = new LinkedList<>();
        for (int a: A) { abc.add(a); }
        
        //build constraints. return if not valid
        if (!(0<=N) || !(N<=100)) { return 0;}

        //build an if statement to add all collections but subtract 
        //the current index. If the number is greater than, result +=
        for (int q = 0; q < abc.size(); q++) {
            //add I constraints
            
                total += q;
                if (abc.get(q) > total) {
                    result += q;
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
        System.out.print(increasingIndex(N,A));
        sc.close();
    }
}
