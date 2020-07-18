package com.basicPrograms;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		
		printPalindrome(a);

	}
	
	static void printPalindrome(Integer num) {
		int value=0;
		int first=0;
		int second=1;
		int temp;
		System.out.print(first+" "+second+" ");
		
		for(int i=0;i<=num-2;i++) {
			
			temp=second;
			second=first+second;
			first=temp;
			
			System.out.print(first+second+" ");
			
		}
		
	}
}
