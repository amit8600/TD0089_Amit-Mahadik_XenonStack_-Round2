package com.BasicProgram;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print remark according to the grade obtained using switch statement
	//	int report;
		char grade;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter grade ('A','B','C','D'): to know your performance");
		
		grade=sc.next().charAt(0);
		switch (grade) {
		
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Average");
			break;
			
		case 'D':
			System.out.println("Poor");
			break;
			
		default: 
			System.out.println("Enter valid grade");
		}
	
	}

}
