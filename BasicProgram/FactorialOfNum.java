package com.BasicProgram;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find the factorial value of any number entered through the keyboard.
		int num;
		int facto=1;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your number");
		num=input.nextInt();
		
		if (num<=0) {
			System.out.println("Enter positive natural number");
		}
		else {
			
			System.out.println("Factorial of your num is ");
			for(int i=1; i<=num; i++) {
				facto=facto*i;
										
		}
			System.out.println(facto+ "");
		
		}

	}

}
