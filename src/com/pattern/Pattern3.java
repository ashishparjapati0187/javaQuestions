package com.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

  //    Write a program that takes the height and width of a square and print the box of 
//		that height and width with alphabet ‘B’. E.g. if user presses 5 for height and 
//		8 for width, your program should print the following. (Restrict the user such 
//		that height or width should not be equal to zero).

//		B B B B B B B B
//		B B B B B B B B
//		B B B B B B B B
//		B B B B B B B B
//		B B B B B B B B

		Scanner sc=new Scanner(System.in);
		Integer height=sc.nextInt();
		Integer width=sc.nextInt();
		
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=width;j++) {
				
				System.out.print("B");
			}
			System.out.println();
		}

	}

}
