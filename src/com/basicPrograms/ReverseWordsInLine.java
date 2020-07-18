package com.basicPrograms;

import java.util.Scanner;

public class ReverseWordsInLine {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		    String line=sc.nextLine();
		    
		    int size=line.length();
		    String result="";
		    String[] arr=line.split(" ");
		    int ff=0;
		    for(String word:arr) {
		    	if(ff==0)
		    	result=reverseString(word)+"";
		    	else 
		    		result=result+" "+reverseString(word);	
		    	ff++;
		    }
		    System.out.println("reversed string ="+result+"90");

	}
	static String reverseString(String word) {
		
		StringBuffer wordz=new StringBuffer(word);
		wordz.reverse();
		return wordz.toString();
	}

}
