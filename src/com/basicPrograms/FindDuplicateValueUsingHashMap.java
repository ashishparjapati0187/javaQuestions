package com.basicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateValueUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet<String> hash=new HashSet<>();
//		
//		System.out.println(hash.add("ashish"));
//		System.out.println(hash.add("kumar"));
//		System.out.println(hash.add("ashish")); // returns boolean
		
		HashMap<String, Integer> map= new HashMap<>();
		
		
		Scanner sc=new Scanner(System.in);
		Integer size=sc.nextInt();
		String[] array=new String[size];
		
		
		for(int i=0;i<size;i++) {
			array[i]=sc.next();
			 if (map.containsKey(array[i])) { 
				  
				 map.put(array[i], map.get(array[i]) + 1); 
	            } 
	            else { 

	                map.put(array[i], 1); 
	            } 
		}
		System.out.println("array = "+map);

		for(Map.Entry mapValues:map.entrySet()) {
			
			if(Integer.parseInt(mapValues.getValue().toString())>1) {
				System.out.println("Value duplicate for "+mapValues.getKey()+" at "+mapValues.getValue()+" times");

				
			}
		}
	
	}

}
