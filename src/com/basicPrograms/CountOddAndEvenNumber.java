package com.basicPrograms;

import java.util.Scanner;

public class CountOddAndEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		countOddAndEvenNumber(a);

	}

	static void countOddAndEvenNumber(Integer num) {
		
		Integer count=0;
		Integer odd=0;
		Integer even=0;
		Integer sum=0;
		while(num>0) {
			sum+=num%10;
			
			if((num%10)%2==0)
				even++;
			else 
				odd++;
			num=num/10;
			count++;
		}
		System.out.println("count = "+count);
		System.out.println("even = "+even);
		System.out.println("odd = "+odd);
		System.out.println("sum = "+sum);
	}
}
