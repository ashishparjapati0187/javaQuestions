package com.basicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		Integer forBufferFunction=a;
		
		Integer reverse=0;
		while(a!=0) {
			reverse*=10;
			reverse+=a%10;
			a/=10;
		}
		
		System.out.println("reversed number with % = "+reverse);
		reverseNumber(forBufferFunction);

	}
	
	static void reverseNumber(Integer a) {
		
		StringBuffer str=new StringBuffer(String.valueOf(a));
		
		System.out.println("reversed string using buffer = "+str.reverse());
	}

}
