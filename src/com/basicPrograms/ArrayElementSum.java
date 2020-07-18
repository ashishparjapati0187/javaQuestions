package com.basicPrograms;

import java.util.Scanner;

public class ArrayElementSum {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		Integer size=sc.nextInt();
		int[] array=new int[size] ;
		long sum=0;
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.println("sum = "+sum);

	}

}
