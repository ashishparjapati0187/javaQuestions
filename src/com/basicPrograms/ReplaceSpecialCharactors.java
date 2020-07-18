package com.basicPrograms;

import java.util.Scanner;

public class ReplaceSpecialCharactors {

	public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    String word=sc.nextLine();
    
    word=word.replaceAll("[^A-Za-z0-9]", ""); // it must store in string to print
    System.out.println("after replace = "+word);

    
 // for replacing spaces
	
 	word=word.replaceAll("\\s", "");
 	System.out.println("after removing space= "+word);
	}
	
	

}
