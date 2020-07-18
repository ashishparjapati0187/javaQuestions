package com.basicPrograms;

import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		checkPalindrome(a);

	}
	
	static void checkPalindrome(Integer num) {
		
		StringBuffer str=new StringBuffer(String.valueOf(num));
		StringBuffer strRev=str.reverse();
		if(str.equals(strRev)) {
			System.out.println(" yes its a palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	
	

}
