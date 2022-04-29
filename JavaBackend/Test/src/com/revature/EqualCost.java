package com.revature;

import java.lang.*;
import java.io.*;
import java.util.*;

public class EqualCost {
    public static int equalCost(int N,int K,int[] A) {
        
        List<Integer> abc = new LinkedList<>();
        int result = 0;
        //N = number in array
        //K = is the goal for every index
        //A = array

        //Use collections for all methods
        for (int a: A) { abc.add(a); }
        int a=0;
        for(int i=0; i< abc.size(); i++) {
            a = 0;
            a = K - abc.get(i);
            if(a >= 1) {
                result += a;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        sc.close();

        //OUTPUT [uncomment & modify if required]
        System.out.print(equalCost(N,K,A));
    }
}