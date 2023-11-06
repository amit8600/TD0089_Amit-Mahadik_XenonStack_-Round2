package com.BasicProgram;

import java.util.Scanner;

public class ReverseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print reverse tables.

		
		int n;
		int result;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter num of your choice");
		n=input.nextInt();		
		 System.out.println("Reverse table is");
		 for (int i=10; i>=1; i--) {
			 result=n*i;			 
			 System.out.println("" +result);
		 }
		

	}

}
