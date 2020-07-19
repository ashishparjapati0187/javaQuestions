package com.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++) {
			System.out.print("@");
			
			for(int j=1;j<=row;j++) {
				
				for(int k=0;j<i;k++) {
					System.out.println(" ");
				}
				
				if(j==i)
					System.out.print("@");
				
			}
			System.out.println();
		}

	}

}
