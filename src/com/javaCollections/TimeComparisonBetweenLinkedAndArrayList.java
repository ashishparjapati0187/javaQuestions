package com.javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparisonBetweenLinkedAndArrayList {

	public static void main(String[] args) {
		
		long n=(long) 1E7;  // means 10^7 elements
		
		// ADDING comparison
		
		ArrayList aList=new ArrayList();
		long timeInMilliSeconds=System.currentTimeMillis();
		
		for(int i=0;i<n;i++) 
			aList.add(i);
		
		System.out.println("Time taken to add in arraytlist = "+(System.currentTimeMillis()-timeInMilliSeconds)+" ms");
		
		LinkedList Linklist=new LinkedList();
		long timeInMilliSecondsForLink=System.currentTimeMillis();
		
		for(int i=0;i<n;i++) 
			Linklist.add(i);
		System.out.println("Time taken to add in linkList = "+(System.currentTimeMillis()-timeInMilliSecondsForLink)+" ms");
	}

	// watch this video for more time comparisons 
	// https://www.youtube.com/watch?v=6zskWpj5unE&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=33
}
