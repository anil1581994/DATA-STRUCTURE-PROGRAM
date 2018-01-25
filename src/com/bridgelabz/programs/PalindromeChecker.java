package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {
public static void main(String[] args) {
	Utility utility=new Utility();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter string to check wether it is palindrome or not");
	 String str=scanner.nextLine();
	 boolean message =Utility.isPalindrome(str);
	 System.out.println(" Is a palindrome..?-->"+message);
	
}
}
