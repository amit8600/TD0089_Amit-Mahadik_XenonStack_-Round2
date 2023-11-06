package com.BasicProgram;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
		
		char gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your choice as 'M' or 'F'");
		gender=sc.next().charAt(0);
		
		switch (gender){
		case 'M':
		case 'm':
			System.out.println("You have selected Male Gender");
			break;
			
		case 'f':
		case 'F':
			System.out.println("You have selected Feamle gender");
			break;
			
		default:
		    System.out.println("Please enter valid choice");
			break;
			
		}

	}

}
