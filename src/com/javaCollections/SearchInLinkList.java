package com.javaCollections;

import java.util.*;

public class SearchInLinkList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer element=sc.nextInt();
		
		
      LinkedList<Integer> list=new LinkedList<>();
      

        list.add(2);
		list.add(3);
		list.add(9);
		list.add(5);
		list.add(4);
		
		Iterator<Integer> itr=list.iterator();  
		int count=0;
		  while(itr.hasNext()){  
			  count++;
		   if(itr.next()==element)
			   
			   System.out.println("found at "+count);

	         }
		  
		  while(itr.hasNext()){  
			  count++;
		   if(itr.next()==element)
			   
			   System.out.println("found at "+count);

	         }
		  

	}

}
