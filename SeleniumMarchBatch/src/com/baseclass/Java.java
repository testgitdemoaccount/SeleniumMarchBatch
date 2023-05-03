package com.baseclass;

import java.util.Scanner;


public class Java {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a vowels");

		String s = sc.nextLine();
		
		System.out.println(vowels(s));
	}
	
	public static int vowels(String s) {
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				
				count++;
			}
		}
		return count;

		
	}

}
