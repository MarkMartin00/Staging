package com.revature;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class SpecialSum {
	public static int specialSum(int N, int[] Arr, int K) {

		// this is default OUTPUT. You can change it.
		int result = 0;
		int b = 0;
		List<Integer> abc = new ArrayList<Integer>();
		for (int a : Arr) {	abc.add(a);	}
		try {
			for (int i = 0; i < abc.size(); i++) {

				for (int m = 0; m < K; m++) {
					abc.remove(b);
				}
				b += K;
			}
		} catch (IndexOutOfBoundsException i) {

		} finally {
			for (int k = 0; k < abc.size(); k++) {
				result += abc.get(k);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// INPUT [uncomment & modify if required]
		int N = sc.nextInt();
		int[] Arr = new int[N];

		for (int i = 0; i < N; i++) {
			Arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		sc.close();

		// OUTPUT [uncomment & modify if required]
		System.out.print(specialSum(N, Arr, K));
	}
}
