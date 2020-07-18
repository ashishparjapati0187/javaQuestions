package com.basicPrograms;

import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		checkPrime(a);

	}
	
	static void checkPrime(Integer num) {
		
		if(num>1) {
			Integer primeCount=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					primeCount++;
				}
				
			}
			if(primeCount==2)
				System.out.println("Its a prime number");
			else 
				System.out.println("not a prime");
		}
		else {
			System.out.println("Not a prime number");
		}
		
		
		
		
	}
}
