package com.basicPrograms;

import java.util.Scanner;

public class CountWordInLine {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String line=sc.nextLine();
    
    int size=line.length();
    int count=1;
    
    for(int i=0;i<size;i++) {
    	if(line.charAt(i)==' ' && line.charAt(i+1)!=' ' )
    		count++;
    }
    System.out.println("no of words = "+count);


	}

}
