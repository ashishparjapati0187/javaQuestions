package com.basicPrograms;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		countNumber(a);

	}

	static void countNumber(Integer num) {
		
		Integer count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("count = "+count);
	}
	
}
