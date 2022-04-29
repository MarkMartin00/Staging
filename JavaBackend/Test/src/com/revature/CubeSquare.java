package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class CubeSquare{
    public static int cubeSquare(int T,int[] N){
        //this is default OUTPUT. You can change it.
        int result = 0;
        Set<Integer> abc = new HashSet<>();
        for (int a: N) {
            int b = (int) Math.sqrt(a);
            int c = (a*a*a);
            abc.add(b); abc.add(c);
        }

        return result;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
		int T = sc.nextInt();
		int[] N = new int[T];
		for (int i = 0; i < T; i++){
		N[i] = sc.nextInt();
		}
		

        sc.close();
        
        cubeSquare(T,N);
    }
}