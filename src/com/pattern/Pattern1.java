package com.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
//		1*****
//		12****
//		123***
//		1234**
//		12345*
//		123456
		
		Scanner sc=new Scanner(System.in);
		Integer row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			
			for(int column=1;column<=row;column++) {
				if(column<=i)
					System.out.print(column);
				else 
					System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
