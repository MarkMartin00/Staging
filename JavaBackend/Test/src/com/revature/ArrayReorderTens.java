	package com.revature;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReorderTens {
	public static int[] sortArray(int N, int[] A) {

		// this is default OUTPUT. You can change it.

		// N is size of array
		// A is array
		ArrayList<Integer> bobby = new ArrayList<Integer>();
		int [] B = new int[N];
		if ((1 <= N) && (N <= 1000000) && (1 <= A.length) && (A.length <= 10000000)) {
			for (Integer i : A) {
				if (i < 10) {
					bobby.add(i);
	
				}
			}
			for (Integer i : A) {
				if ((10 < i) && (i < 100)) {
					bobby.add(i);

				}
			}
			for (Integer i : A) {
				if ((100 < i) && (i < 1000)) {
					bobby.add(i);

				}
			}
			for (Integer i : A) {
				if ((1000 < i) && (i < 10000)) {
					bobby.add(i);

				}
			}
			for (Integer i : A) {
				if ((10000 < i) && (i < 100000)) {
					bobby.add(i);

				}
			}
			for (Integer i : A) {
				if ((100000 < i) && (i < 1000000)) {
					bobby.add(i);

				}
			}
		}

		System.out.println("this is the new bobby " + "\n" + bobby);
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// INPUT [uncomment & modify if required]
		int N = sc.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		sc.close();

		// OUTPUT [uncomment & modify if required]
		sortArray(N, A);
	}
}