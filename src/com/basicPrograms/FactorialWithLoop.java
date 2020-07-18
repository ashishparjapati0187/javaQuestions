package com.basicPrograms;

import java.util.Scanner;

public class FactorialWithLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer num=sc.nextInt();
		
		long factorial=1;
		for(int i=2;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("factorial = "+factorial);

	}

}
