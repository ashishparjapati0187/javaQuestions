package com.basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayEqual {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer size=sc.nextInt();
		Integer size2=sc.nextInt();
		int[] array=new int[size] ;
		int[] array2=new int[size2] ;
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<size;i++) {
			array2[i]=sc.nextInt();
			
		}
		System.out.println("Is array equals : "+Arrays.equals(array, array2));

	}

}
