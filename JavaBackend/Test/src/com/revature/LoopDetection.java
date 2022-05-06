package com.revature;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoopDetection {
	public static String repeatString(ListNode[] list1, ListNode[] list2) {
	
		String result = "There is no intersection.";
		
		
//		for (int i = 0; i < list1.size(); i++) {
//			if (list1.contains(list2.get(i))) {
//				result = list2.get(i);
//				System.out.println(result);
//				return result;
//			}
//			
//		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How big is the array?");
		
		//create a list with the number of T Objects
		int T = sc.nextInt();
//		List<String> NumberOne = new LinkedList<String>();
//		List<String> numberTwo = new LinkedList<String>();
		ListNode list1[] = makeList1(T);
		ListNode list2[] = makeList2(T);
		
		
		System.out.println("Let's list #2 " + T +" indexes.");
		for (int i = 1; i <= T; i++) {
			System.out.println("What's at index "+ i);
			String x = sc.next();
			list2[i] = new ListNode(x);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		sc.close();

		repeatString(list1, list2);
	}
	
	private static ListNode[] makeList2(int t) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's list #2 " + t +" indexes.");
		for (int i = 1; i <= t; i++) {
			System.out.println("What's at index "+ i);
			String x = sc.next();
			list2[i] = new ListNode(x);
		}
		sc.close();
		return null;
	}

	private static ListNode[] makeList1(int t) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's list #1 " + t +" indexes.");
		for (int i = 1; i <= t; i++) {
			System.out.println("What's at index "+ i);
			String x = sc.next();
			list1[i] = new ListNode(x);
		}
		sc.close();
		return null;
	}

	private static class ListNode {
		private String data;
		private ListNode next;
		
		public ListNode(String data) {
			this.data = data;
			this.next = null;
		}
	}
}
