package com.revature;

public class TestMethods {
	public static void main(String[] args) {
		
		
		int i = 0;
		
//		while (i !=4) {
//			switch(i) {
//			case 0:
//				System.out.println(0); break;
//			case 1:
//				System.out.println(1);
//			default:
//				System.out.println("X"); break;
//			}
//			i++;
//		}
		
		while (i<5) {
			if (i == 0) System.out.println(0);
			i++;
			System.out.println((i>2 ? 1:2));
		}
		
		
	}
	
}
