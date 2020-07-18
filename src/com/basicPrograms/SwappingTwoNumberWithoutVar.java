package com.basicPrograms;

import java.util.Scanner;

public class SwappingTwoNumberWithoutVar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		Integer b=sc.nextInt();
		
		// without using third variable
		
		//ex. 10 20
		a=a+b;   // 30 
		b=a-b;   
		a=a-b;
		
		System.out.println("a = "+a+" and b= "+b);

	}

}
