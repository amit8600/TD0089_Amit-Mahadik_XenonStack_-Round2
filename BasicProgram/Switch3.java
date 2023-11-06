package com.BasicProgram;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to Check whether a character is a vowel or consonant using switch statement
		Scanner sc = new Scanner(System.in);
		char chtr;
		System.out.println("Enter letter of your choice");
		chtr=sc.next().charAt(0);
		sc.close();
		if ((chtr>='a' && chtr<='z')||(chtr>='A' && chtr<='Z')) {
			switch (chtr) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				
				System.out.println("Character is vowel");
				break;
				default:
					System.out.println("Character is constant");
		}
		
		
	
		}

	}

}
