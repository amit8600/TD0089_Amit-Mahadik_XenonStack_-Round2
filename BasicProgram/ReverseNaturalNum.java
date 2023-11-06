package com.BasicProgram;

import java.util.Scanner;

public class ReverseNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print natural numbers in reverse.Take initial value from the user.
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number of your choice");
		n=scanner.nextInt();
		
		System.out.println("Reverse order is ");
		for (int i=n; i>=1; i--) {
			System.out.println(+i+ " ");
			
		}
		
	}

}
