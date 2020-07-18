package com.basicPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer size=sc.nextInt();
		Integer[] arr=new Integer[size];
		
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		
		}
//		for(int i=0;i<size-1;i++) {
//			for(int j=0;j<size-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			
//		}
		Arrays.sort(arr); // increasing order
		Arrays.sort(arr,Collections.reverseOrder()); // (decreasinh order)only support primitive type ex Integer
		System.out.println("arra after bubble sort= "+Arrays.toString(arr));
		

	}

}
