package com.bharath;
import java.util.Scanner;
class Transactions {
	public static void main(String args[]) throws Exception {
		
		Scanner s = new Scanner (System.in);
		System.out.println("enter the size of transaaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the value of array");
		for (int i = 0; i < size; i++)
	
			arr[i] = s.nextInt ();
		System.out.println("enterthe total no of targets that needs to be achieved");
		int targetNo = s.nextInt();
		while (targetNo-- != 0) {
			int flag = 0;
			long target;
			System.out.println("enter the value of target");
			target = s.nextInt();
			
			long sum = 0;
			for (int i =0; i < size; i++) {
				sum += arr[i];
				if (sum>= target) {
					System.out.println("Target achieved after "+(i + 1) + "transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved ");
				
			}
		}
		
	}
}