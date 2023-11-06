package com.BasicProgram;
import java.util.Scanner;
public class CheckUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )
		
		char character;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter any character from a-z either in lowercase or uppercase");
			
			character=input.next().charAt(0);
			input.close();
		}
		
		//char a,z,A,Z;
		if (character>='a' && character<='z') {
			System.out.println("lowercase");
		}
		else if (character>='A' && character<='Z') {
			System.out.println("Uppercase");
		}
		else { 
			System.out.println("Not character");
		}
		
	}

}
